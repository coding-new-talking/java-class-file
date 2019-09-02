package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class Classes {
	
	private byte[] bytes;
	private int offset;
	
	private Index2 innerClassInfoIndex;
	private Index2 outerClassInfoIndex;
	private Index2 innerNameIndex;
	private InnerClassAccessFlags accessFlags;
	
	public Classes(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getInnerClassInfoIndex() {
		if (innerClassInfoIndex == null) {
			innerClassInfoIndex = new Index2(bytes, offset);
		}
		return innerClassInfoIndex.getIndex();
	}

	public int getOuterClassInfoIndex() {
		if (outerClassInfoIndex == null) {
			outerClassInfoIndex = new Index2(bytes, offset + 2);
		}
		return outerClassInfoIndex.getIndex();
	}

	public int getInnerNameIndex() {
		if (innerNameIndex == null) {
			innerNameIndex = new Index2(bytes, offset + 4);
		}
		return innerNameIndex.getIndex();
	}

	public InnerClassAccessFlags getAccessFlags() {
		if (accessFlags == null) {
			accessFlags = new InnerClassAccessFlags(bytes, offset + 6);
		}
		return accessFlags;
	}

	@Override
	public String toString() {
		return "Classes [getInnerClassInfoIndex()=" + getInnerClassInfoIndex() + ", getOuterClassInfoIndex()="
				+ getOuterClassInfoIndex() + ", getInnerNameIndex()=" + getInnerNameIndex() + ", getAccessFlags()="
				+ getAccessFlags() + "]";
	}
}
