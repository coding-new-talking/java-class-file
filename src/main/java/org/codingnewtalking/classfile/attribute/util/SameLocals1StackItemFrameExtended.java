package org.codingnewtalking.classfile.attribute.util;

import java.util.Arrays;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class SameLocals1StackItemFrameExtended extends Frame {

	private OffsetDelta offsetDelta;
	private VerificationTypeInfo[] stack;
	
	public SameLocals1StackItemFrameExtended(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3 + VerificationTypeInfo.getByteLength(bytes, offset + 3);
	}
	
	public int getOffsetDelta() {
		if (offsetDelta == null) {
			offsetDelta = new OffsetDelta(bytes, offset + 1);
		}
		return offsetDelta.getOffsetDelta();
	}

	public VerificationTypeInfo[] getStack() {
		if (stack == null) {
			stack = new VerificationTypeInfo[1];
			stack[0] = new VerificationTypeInfo(bytes, offset + 3);
		}
		return stack;
	}

	@Override
	public String toString() {
		return "SameLocals1StackItemFrameExtended [getOffsetDelta()=" + getOffsetDelta() + ", getStack()="
				+ Arrays.toString(getStack()) + ", getFrameType()=" + getFrameType() + "]";
	}
}
