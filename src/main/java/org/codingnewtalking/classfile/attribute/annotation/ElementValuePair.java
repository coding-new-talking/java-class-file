package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class ElementValuePair {

	private byte[] bytes;
	private int offset;
	
	private Index2 elementNameIndex;
	private ElementValue elementValue;
	
	public ElementValuePair(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 2 + getElementValue().getByteLength();
	}
	
	public int getElementNameIndex() {
		if (elementNameIndex == null) {
			elementNameIndex = new Index2(bytes, offset);
		}
		return elementNameIndex.getIndex();
	}

	public ElementValue getElementValue() {
		if (elementValue == null) {
			elementValue = new ElementValue(bytes, offset + 2);
		}
		return elementValue;
	}

	@Override
	public String toString() {
		return "ElementValuePair [getElementNameIndex()=" + getElementNameIndex() + ", getElementValue()="
				+ getElementValue() + "]";
	}
}
