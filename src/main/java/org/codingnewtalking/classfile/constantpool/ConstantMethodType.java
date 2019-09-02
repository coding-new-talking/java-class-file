package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantMethodType extends ConstantEntry {

	private Index2 descriptorIndex;
	
	public ConstantMethodType(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2;
	}
	
	public int getDescriptorIndex() {
		if (descriptorIndex == null) {
			descriptorIndex = new Index2(bytes, offset + 1);
		}
		return descriptorIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantMethodType [getDescriptorIndex()=" + getDescriptorIndex() + ", getTag()=" + getTag() + "]";
	}
}
