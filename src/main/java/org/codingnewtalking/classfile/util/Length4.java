package org.codingnewtalking.classfile.util;

import org.codingnewtalking.unsigned.U4;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Length4 {
	
	private U4 u4;
	
	public Length4(byte[] bytes, int offset) {
		this.u4 = new U4(bytes, offset);
	}

	public int getByteOffset() {
		return u4.getByteOffset();
	}

	public int getByteLength() {
		return u4.getByteLength();
	}
	
	public long getLength() {
		return u4.getValue();
	}
}
