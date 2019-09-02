package org.codingnewtalking.classfile.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Num2 {
	
	private U2 u2;
	
	public Num2(byte[] bytes, int offset) {
		this.u2 = new U2(bytes, offset);
	}

	public int getByteOffset() {
		return u2.getByteOffset();
	}

	public int getByteLength() {
		return u2.getByteLength();
	}
	
	public int getNum() {
		return u2.getValue();
	}
}
