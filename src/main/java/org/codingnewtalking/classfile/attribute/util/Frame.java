package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public abstract class Frame {

	protected byte[] bytes;
	protected int offset;
	
	private FrameType frameType;
	
	public Frame(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public abstract int getByteOffset();
	
	public abstract int getByteLength();
	
	public abstract int getOffsetDelta();
	
	public FrameType getFrameType() {
		if (frameType == null) {
			frameType = new FrameType(bytes, offset);
		}
		return frameType;
	}
}
