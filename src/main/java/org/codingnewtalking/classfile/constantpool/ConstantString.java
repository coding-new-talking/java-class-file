package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantString extends ConstantEntry {

	private Index2 stringIndex;
	
	public ConstantString(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2;
	}
	
	public int getStringIndex() {
		if (stringIndex == null) {
			stringIndex = new Index2(bytes, offset + 1);
		}
		return stringIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantString [getStringIndex()=" + getStringIndex() + ", getTag()=" + getTag() + "]";
	}
}
