package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-08-10
 */
public class FrameBuilder {

	private byte[] bytes;

	private FrameBuilder(byte[] bytes) {
		this.bytes = bytes;
	}
	
	public static FrameBuilder newBuilder(byte[] bytes) {
		return new FrameBuilder(bytes);
	}
	
	public Frame build(int offset) {
		return build(bytes, offset);
	}
	
	public static Frame build(byte[] bytes, int offset) {
		int frameType = ByteUtils.toUnsigned(bytes[offset]);
		if (FrameType.isSameFrame(frameType)) {
			return new SameFrame(bytes, offset);
		}
		if (FrameType.isSameLocals1StackItemFrame(frameType)) {
			return new SameLocals1StackItemFrame(bytes, offset);
		}
		if (FrameType.isSameLocals1StackItemFrameExtended(frameType)) {
			return new SameLocals1StackItemFrameExtended(bytes, offset);
		}
		if (FrameType.isChopFrame(frameType)) {
			return new ChopFrame(bytes, offset);
		}
		if (FrameType.isSameFrameExtended(frameType)) {
			return new SameFrameExtended(bytes, offset);
		}
		if (FrameType.isAppendFrame(frameType)) {
			return new AppendFrame(bytes, offset);
		}
		if (FrameType.isFullFrame(frameType)) {
			return new FullFrame(bytes, offset);
		}
		throw new IllegalArgumentException("frameType=" + frameType);
	}
}
