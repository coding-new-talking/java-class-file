package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class StackMapFrame {

	private byte[] bytes;
	private int offset;
	
	private Frame frame;
	
	public StackMapFrame(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return getFrame().getByteLength();
	}

	public Frame getFrame() {
		if (frame == null) {
			frame = FrameBuilder.build(bytes, offset);
		}
		return frame;
	}

	@Override
	public String toString() {
		return "StackMapFrame [getFrame()=" + getFrame() + "]";
	}
}
