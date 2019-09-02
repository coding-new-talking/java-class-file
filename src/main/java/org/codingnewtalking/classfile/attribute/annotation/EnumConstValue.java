package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class EnumConstValue {

	private byte[] bytes;
	private int offset;
	
	private Index2 typeNameIndex;
	private Index2 constNameIndex;
	
	public EnumConstValue(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 4;
	}

	public int getTypeNameIndex() {
		if (typeNameIndex == null) {
			typeNameIndex = new Index2(bytes, offset);
		}
		return typeNameIndex.getIndex();
	}

	public int getConstNameIndex() {
		if (constNameIndex == null) {
			constNameIndex = new Index2(bytes, offset + 2);
		}
		return constNameIndex.getIndex();
	}

	@Override
	public String toString() {
		return "EnumConstValue [getTypeNameIndex()=" + getTypeNameIndex() + ", getConstNameIndex()="
				+ getConstNameIndex() + "]";
	}
}
