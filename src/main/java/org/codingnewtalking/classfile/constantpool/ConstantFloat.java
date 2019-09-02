package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Byte4;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantFloat extends ConstantEntry {
	
	private Byte4 byte4;
	
	public ConstantFloat(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 4;
	}

	public float getFloat() {
		if (byte4 == null) {
			byte4 = new Byte4(bytes, offset + 1);
		}
		return ByteUtils.toFloat(byte4.getByte3(), byte4.getByte2(), byte4.getByte1(), byte4.getByte0());
	}

	@Override
	public String toString() {
		return "ConstantFloat [getFloat()=" + getFloat() + ", getTag()=" + getTag() + "]";
	}
}
