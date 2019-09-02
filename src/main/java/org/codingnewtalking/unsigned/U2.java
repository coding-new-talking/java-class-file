package org.codingnewtalking.unsigned;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class U2 {
	
	private byte[] bytes;
	private int offset;
	private int length = 2;
	
	public U2(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return length;
	}

	public int getValue() {
		return ByteUtils.toUnsigned(bytes, offset, length);
	}
	
	public byte getByte0() {
		return bytes[offset + 1];
	}
	
	public byte getByte1() {
		return bytes[offset + 0];
	}
	
	public byte[] getBytes() {
		return new byte[] {getByte1(), getByte0()};
	}
}
