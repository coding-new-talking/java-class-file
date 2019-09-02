package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class Exceptions extends AttributeInfo {
	
	private Num2 numberOfExceptions;
	private Index2[] exceptionIndexTable;
	
	public Exceptions(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumberOfExceptions() {
		if (numberOfExceptions == null) {
			numberOfExceptions = new Num2(bytes, offset + 6);
		}
		return numberOfExceptions.getNum();
	}

	public int[] getExceptionIndexTable() {
		if (exceptionIndexTable == null) {
			exceptionIndexTable = new Index2[getNumberOfExceptions()];
			for (int i = 0, len = exceptionIndexTable.length; i < len; i++) {
				exceptionIndexTable[i] = new Index2(bytes, offset + 8 + i * 2);
			}
		}
		int[] indexTable = new int[exceptionIndexTable.length];
		for (int i = 0; i < exceptionIndexTable.length; i++) {
			indexTable[i] = exceptionIndexTable[i].getIndex();
		}
		return indexTable;
	}

	@Override
	public String toString() {
		return "Exceptions [getNumberOfExceptions()=" + getNumberOfExceptions() + ", getExceptionIndexTable()="
				+ Arrays.toString(getExceptionIndexTable()) + "]";
	}
	
}
