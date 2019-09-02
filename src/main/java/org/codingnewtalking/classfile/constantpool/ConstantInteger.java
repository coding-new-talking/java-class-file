package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Byte4;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantInteger extends ConstantEntry {
	
	private Byte4 byte4;
	
	public ConstantInteger(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 4;
	}

	public int getInteger() {
		if (byte4 == null) {
			byte4 = new Byte4(bytes, offset + 1);
		}
		return ByteUtils.toSigned(byte4.getByte3(), byte4.getByte2(), byte4.getByte1(), byte4.getByte0());
	}

	@Override
	public String toString() {
		return "ConstantInteger [getInteger()=" + getInteger() + ", getTag()=" + getTag() + "]";
	}
}
