package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.Byte4;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantDouble extends ConstantEntry {
	
	private Byte4 highByte4;
	private Byte4 lowByte4;
	
	public ConstantDouble(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 4 + 4;
	}

	public double getDouble() {
		if (highByte4 == null) {
			highByte4 = new Byte4(bytes, offset + 1);
		}
		if (lowByte4 == null) {
			lowByte4 = new Byte4(bytes, offset + 5);
		}
		return ByteUtils.toDouble(highByte4.getByte3(), highByte4.getByte2(), highByte4.getByte1(), highByte4.getByte0(),
				lowByte4.getByte3(), lowByte4.getByte2(), lowByte4.getByte1(), lowByte4.getByte0());
	}

	@Override
	public String toString() {
		return "ConstantDouble [getDouble()=" + getDouble() + ", getTag()=" + getTag() + "]";
	}
}
