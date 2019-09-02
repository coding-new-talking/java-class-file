package org.codingnewtalking.classfile.attribute.annotation;

import java.util.Arrays;

import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class Annotation {

	private byte[] bytes;
	private int offset;
	private int length;

	private Index2 typeIndex;
	private Num2 numElementValuePairs;
	private ElementValuePair[] elementValuePairs;
	
	public Annotation(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			getElementValuePairs();
		}
		return length;
	}
	
	public int getTypeIndex() {
		if (typeIndex == null) {
			typeIndex = new Index2(bytes, offset);
		}
		return typeIndex.getIndex();
	}

	public int getNumElementValuePairs() {
		if (numElementValuePairs == null) {
			numElementValuePairs = new Num2(bytes, offset + 2);
		}
		return numElementValuePairs.getNum();
	}

	public ElementValuePair[] getElementValuePairs() {
		if (elementValuePairs == null) {
			elementValuePairs = new ElementValuePair[getNumElementValuePairs()];
			length += 4;
			for (int i = 0, len = elementValuePairs.length; i < len; i++) {
				elementValuePairs[i] = new ElementValuePair(bytes, offset + length);
				length += elementValuePairs[i].getByteLength();
			}
		}
		return elementValuePairs;
	}

	@Override
	public String toString() {
		return "Annotation [getTypeIndex()=" + getTypeIndex() + ", getNumElementValuePairs()="
				+ getNumElementValuePairs() + ", getElementValuePairs()=" + Arrays.toString(getElementValuePairs())
				+ "]";
	}
}
