package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantFieldRef extends ConstantEntry {

	private Index2 classIndex;
	private Index2 nameAndTypeIndex;
	
	public ConstantFieldRef(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2 + 2;
	}
	
	public int getClassIndex() {
		if (classIndex == null) {
			classIndex = new Index2(bytes, offset + 1);
		}
		return classIndex.getIndex();
	}
	
	public int getNameAndTypeIndex() {
		if (nameAndTypeIndex == null) {
			nameAndTypeIndex = new Index2(bytes, offset + 3);
		}
		return nameAndTypeIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantFieldRef [getClassIndex()=" + getClassIndex() + ", getNameAndTypeIndex()="
				+ getNameAndTypeIndex() + ", getTag()=" + getTag() + "]";
	}
}
