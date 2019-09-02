package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class TypeArgumentIndex {
	
	private U1 u1;
	
	public TypeArgumentIndex(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}
	
	public int getByteOffset() {
		return u1.getByteOffset();
	}

	public int getByteLength() {
		return u1.getByteLength();
	}
	
	public int getTypeArgumentIndex() {
		return u1.getValue();
	}

	@Override
	public String toString() {
		return "TypeArgumentIndex [getTypeArgumentIndex()=" + getTypeArgumentIndex() + "]";
	}
}
