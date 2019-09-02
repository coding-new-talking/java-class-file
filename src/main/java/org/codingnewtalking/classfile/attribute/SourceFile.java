package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class SourceFile extends AttributeInfo {

	private Index2 sourcefileIndex;
	
	public SourceFile(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getSourcefileIndex() {
		if (sourcefileIndex == null) {
			sourcefileIndex = new Index2(bytes, offset + 6);
		}
		return sourcefileIndex.getIndex();
	}

	@Override
	public String toString() {
		return "SourceFile [getSourcefileIndex()=" + getSourcefileIndex() + "]";
	}
}
