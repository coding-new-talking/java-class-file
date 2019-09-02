package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class SameFrameExtended extends Frame {

	private OffsetDelta offsetDelta;
	
	public SameFrameExtended(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3;
	}
	
	public int getOffsetDelta() {
		if (offsetDelta == null) {
			offsetDelta = new OffsetDelta(bytes, offset + 1);
		}
		return offsetDelta.getOffsetDelta();
	}
}
