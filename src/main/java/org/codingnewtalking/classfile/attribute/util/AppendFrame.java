package org.codingnewtalking.classfile.attribute.util;

import java.util.Arrays;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class AppendFrame extends Frame {

	private OffsetDelta offsetDelta;
	private VerificationTypeInfo[] locals;
	
	public AppendFrame(byte[] bytes, int offset) {
		super(bytes, offset);
	}

	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3 + getLocalsByteLength();
	}

	public int getAdditionalLocalVariables() {
		return getFrameType().getFrameType() - 251;
	}

	public int getOffsetDelta() {
		if (offsetDelta == null) {
			offsetDelta = new OffsetDelta(bytes, offset + 1);
		}
		return offsetDelta.getOffsetDelta();
	}

	public VerificationTypeInfo[] getLocals() {
		if (locals == null) {
			locals = new VerificationTypeInfo[getAdditionalLocalVariables()];
			int length = 3;
			for (int i = 0, len = locals.length; i < len; i++) {
				locals[i] = new VerificationTypeInfo(bytes, offset + length);
				length += locals[i].getByteLength();
			}
		}
		return locals;
	}
	
	private int getLocalsByteLength() {
		int length = 0;
		for (int i = 0, len = getAdditionalLocalVariables(); i < len; i++) {
			length += VerificationTypeInfo.getByteLength(bytes, offset + 3 + length);
		}
		return length;
	}

	@Override
	public String toString() {
		return "AppendFrame [getAdditionalLocalVariables()=" + getAdditionalLocalVariables() + ", getOffsetDelta()="
				+ getOffsetDelta() + ", getLocals()=" + Arrays.toString(getLocals()) + ", getFrameType()="
				+ getFrameType() + "]";
	}
}
