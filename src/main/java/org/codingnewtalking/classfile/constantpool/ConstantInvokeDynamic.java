package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantInvokeDynamic extends ConstantEntry {

	private Index2 bootstrapMethodAttrIndex;
	private Index2 nameAndTypeIndex;
	
	public ConstantInvokeDynamic(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2 + 2;
	}
	
	public int getBootstrapMethodAttrIndex() {
		if (bootstrapMethodAttrIndex == null) {
			bootstrapMethodAttrIndex = new Index2(bytes, offset + 1);
		}
		return bootstrapMethodAttrIndex.getIndex();
	}
	
	public int getNameAndTypeIndex() {
		if (nameAndTypeIndex == null) {
			nameAndTypeIndex = new Index2(bytes, offset + 3);
		}
		return nameAndTypeIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantInvokeDynamic [getBootstrapMethodAttrIndex()=" + getBootstrapMethodAttrIndex()
				+ ", getNameAndTypeIndex()=" + getNameAndTypeIndex() + ", getTag()=" + getTag() + "]";
	}
}
