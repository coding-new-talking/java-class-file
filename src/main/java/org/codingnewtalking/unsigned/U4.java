package org.codingnewtalking.unsigned;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class U4 {
	
	private byte[] bytes;
	private int offset;
	private int length = 4;
	
	public U4(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return length;
	}
	
	public long getValue() {
		return ByteUtils.toUnsignedLong(bytes, offset, length);
	}
	
	public byte getByte0() {
		return bytes[offset + 3];
	}
	
	public byte getByte1() {
		return bytes[offset + 2];
	}
	
	public byte getByte2() {
		return bytes[offset + 1];
	}
	
	public byte getByte3() {
		return bytes[offset + 0];
	}
	
	public byte[] getBytes() {
		return new byte[] {getByte3(), getByte2(), getByte1(), getByte0()};
	}
}
