package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class SameFrame extends Frame {

	public SameFrame(byte[] bytes, int offset) {
		super(bytes, offset);
	}

	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 1;
	}

	public int getOffsetDelta() {
		return getFrameType().getFrameType();
	}

	@Override
	public String toString() {
		return "SameFrame [getOffsetDelta()=" + getOffsetDelta() + ", getFrameType()=" + getFrameType() + "]";
	}
}
