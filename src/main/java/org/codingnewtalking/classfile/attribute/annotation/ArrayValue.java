package org.codingnewtalking.classfile.attribute.annotation;

import java.util.Arrays;

import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class ArrayValue {

	private byte[] bytes;
	private int offset;
	private int length;

	private Num2 numValues;
	private ElementValue[] values;
	
	public ArrayValue(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			getValues();
		}
		return length;
	}
	
	public int getNumValues() {
		if (numValues == null) {
			numValues = new Num2(bytes, offset);
		}
		return numValues.getNum();
	}

	public ElementValue[] getValues() {
		if (values == null) {
			values = new ElementValue[getNumValues()];
			length += 2;
			for (int i = 0, len = values.length; i < len; i++) {
				values[i] = new ElementValue(bytes, offset + length);
				length += values[i].getByteLength();
			}
		}
		return values;
	}

	@Override
	public String toString() {
		return "ArrayValue [getNumValues()=" + getNumValues() + ", getValues()=" + Arrays.toString(getValues()) + "]";
	}
}
