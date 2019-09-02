package org.codingnewtalking.classfile.attribute.util;

import java.util.Arrays;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class SameLocals1StackItemFrame extends Frame {

	private VerificationTypeInfo[] stack;
	
	public SameLocals1StackItemFrame(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 1 + VerificationTypeInfo.getByteLength(bytes, offset + 1);
	}

	public int getOffsetDelta() {
		return getFrameType().getFrameType() - 64;
	}

	public VerificationTypeInfo[] getStack() {
		if (stack == null) {
			stack = new VerificationTypeInfo[1];
			stack[0] = new VerificationTypeInfo(bytes, offset + 1);
		}
		return stack;
	}

	@Override
	public String toString() {
		return "SameLocals1StackItemFrame [getOffsetDelta()=" + getOffsetDelta() + ", getStack()="
				+ Arrays.toString(getStack()) + ", getFrameType()=" + getFrameType() + "]";
	}
}
