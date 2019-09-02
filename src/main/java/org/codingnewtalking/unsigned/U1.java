package org.codingnewtalking.unsigned;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class U1 {
	
	private byte[] bytes;
	private int offset;
	private int length = 1;
	
	public U1(byte[] bytes, int offset) {
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
	
	public byte getByte() {
		return bytes[offset];
	}
	
	public byte[] getBytes() {
		return new byte[] {getByte()};
	}
}
