package org.codingnewtalking.classfile.util;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ByteString {
	
	private byte[] bytes;
	private int offset;
	private int length;
	
	public ByteString(byte[] bytes, int offset, int length) {
		this.bytes = bytes;
		this.offset = offset;
		this.length = length;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return length;
	}
	
	public String getString() {
		return ByteUtils.toString(bytes, offset, length);
	}
}
