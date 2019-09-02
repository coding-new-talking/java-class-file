package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class ChopFrame extends Frame {

	private OffsetDelta offsetDelta;
	
	public ChopFrame(byte[] bytes, int offset) {
		super(bytes, offset);
	}

	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3;
	}

	public int getAbsentLocalVariables() {
		return 251 - getFrameType().getFrameType();
	}

	public int getOffsetDelta() {
		if (offsetDelta == null) {
			offsetDelta = new OffsetDelta(bytes, offset + 1);
		}
		return offsetDelta.getOffsetDelta();
	}

	@Override
	public String toString() {
		return "ChopFrame [getAbsentLocalVariables()=" + getAbsentLocalVariables() + ", getOffsetDelta()="
				+ getOffsetDelta() + ", getFrameType()=" + getFrameType() + "]";
	}
}
