package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.attribute.util.ElementValueTag;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class ElementValue {

	private byte[] bytes;
	private int offset;
	
	private ElementValueTag tag;
	private ElementValueUnion union;
	
	public ElementValue(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + getUnion().getByteLength();
	}
	
	public ElementValueTag getTag() {
		if (tag == null) {
			tag = new ElementValueTag(bytes, offset);
		}
		return tag;
	}
	public ElementValueUnion getUnion() {
		if (union == null) {
			union = new ElementValueUnion(bytes, offset + 1, getTag());
		}
		return union;
	}

	@Override
	public String toString() {
		return "ElementValue [getTag()=" + getTag() + ", getUnion()=" + getUnion() + "]";
	}
}
