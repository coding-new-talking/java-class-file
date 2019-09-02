package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-22
 */
public class JvmCode {
	
	private byte[] bytes;
	private int offset;
	
	private int codeLength;
	private U1[] u1s;
	
	public JvmCode(byte[] bytes, int offset, int codeLength) {
		this.bytes = bytes;
		this.offset = offset;
		this.codeLength = codeLength;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return codeLength;
	}

	public int getCode() {
		if (u1s == null) {
			u1s = new U1[codeLength];
			for (int i = 0, len = u1s.length; i < len; i++) {
				u1s[i] = new U1(bytes, offset + i);
			}
		}
		return codeLength;
	}

	@Override
	public String toString() {
		return "JvmCode [getCode()=" + getCode() + "]";
	}
}
