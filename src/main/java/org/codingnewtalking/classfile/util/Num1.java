package org.codingnewtalking.classfile.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Num1 {
	
	private U1 u1;
	
	public Num1(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}

	public int getByteOffset() {
		return u1.getByteOffset();
	}

	public int getByteLength() {
		return u1.getByteLength();
	}
	
	public int getNum() {
		return u1.getValue();
	}
}
