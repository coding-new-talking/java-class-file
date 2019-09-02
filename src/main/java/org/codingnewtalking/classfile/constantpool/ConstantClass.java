package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantClass extends ConstantEntry {

	private Index2 nameIndex;
	
	public ConstantClass(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2;
	}
	
	public int getNameIndex() {
		if (nameIndex == null) {
			nameIndex = new Index2(bytes, offset + 1);
		}
		return nameIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantClass [getNameIndex()=" + getNameIndex() + ", getTag()=" + getTag() + "]";
	}
}
