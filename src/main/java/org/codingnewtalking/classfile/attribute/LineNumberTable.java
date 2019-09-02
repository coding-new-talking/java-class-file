package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.LineNumTable;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LineNumberTable extends AttributeInfo {
	
	private Length2 lineNumTableLength;
	private LineNumTable[] lineNumTables;
	
	public LineNumberTable(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getLineNumTableLength() {
		if (lineNumTableLength == null) {
			lineNumTableLength = new Length2(bytes, offset + 6);
		}
		return lineNumTableLength.getLength();
	}

	public LineNumTable[] getLineNumTables() {
		lineNumTables = new LineNumTable[getLineNumTableLength()];
		for (int i = 0, len = lineNumTables.length; i < len; i++) {
			lineNumTables[i] = new LineNumTable(bytes, offset + 8 + i * 4);
		}
		return lineNumTables;
	}

	@Override
	public String toString() {
		return "LineNumberTable [getLineNumTableLength()=" + getLineNumTableLength() + ", getLineNumTables()="
				+ Arrays.toString(getLineNumTables()) + "]";
	}
	
}
