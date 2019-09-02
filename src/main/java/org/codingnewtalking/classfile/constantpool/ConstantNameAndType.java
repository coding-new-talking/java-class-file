package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantNameAndType extends ConstantEntry {

	private Index2 nameIndex;
	private Index2 descriptorIndex;
	
	public ConstantNameAndType(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2 + 2;
	}
	
	public int getNameIndex() {
		if (nameIndex == null) {
			nameIndex = new Index2(bytes, offset + 1);
		}
		return nameIndex.getIndex();
	}
	
	public int getDescriptorIndex() {
		if (descriptorIndex == null) {
			descriptorIndex = new Index2(bytes, offset + 3);
		}
		return descriptorIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantNameAndType [getNameIndex()=" + getNameIndex() + ", getDescriptorIndex()="
				+ getDescriptorIndex() + ", getTag()=" + getTag() + "]";
	}
}
