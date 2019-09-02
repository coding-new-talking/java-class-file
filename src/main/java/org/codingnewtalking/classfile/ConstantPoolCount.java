package org.codingnewtalking.classfile;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantPoolCount {
	
	private U2 u2;
	
	public ConstantPoolCount(byte[] bytes, int offset) {
		this.u2 = new U2(bytes, offset);
	}
	
	public int getByteOffset() {
		return u2.getByteOffset();
	}

	public int getByteLength() {
		return u2.getByteLength();
	}

	public int getCount() {
		return u2.getValue();
	}

	@Override
	public String toString() {
		return "ConstantPoolCount [getCount()=" + getCount() + "]";
	}
}
