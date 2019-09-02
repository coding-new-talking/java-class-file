package org.codingnewtalking.classfile.attribute.util;

import java.util.Arrays;

import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class FullFrame extends Frame {

	private OffsetDelta offsetDelta;
	private Num2 numberOfLocals;
	private VerificationTypeInfo[] locals;
	private Num2 numberOfStackItems;
	private VerificationTypeInfo[] stack;
	
	public FullFrame(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 7 + getLocalsByteLength() + getStackByteLength();
	}

	public int getOffsetDelta() {
		if (offsetDelta == null) {
			offsetDelta = new OffsetDelta(bytes, offset + 1);
		}
		return offsetDelta.getOffsetDelta();
	}

	public int getNumberOfLocals() {
		if (numberOfLocals == null) {
			numberOfLocals = new Num2(bytes, offset + 3);
		}
		return numberOfLocals.getNum();
	}

	public VerificationTypeInfo[] getLocals() {
		if (locals == null) {
			locals = new VerificationTypeInfo[getNumberOfLocals()];
			int length = 5;
			for (int i = 0, len = locals.length; i < len; i++) {
				locals[i] = new VerificationTypeInfo(bytes, offset + length);
				length += locals[i].getByteLength();
			}
		}
		return locals;
	}
	
	private int getLocalsByteLength() {
		int length = 0;
		for (int i = 0, len = getNumberOfLocals(); i < len; i++) {
			length += VerificationTypeInfo.getByteLength(bytes, offset + 5 + length);
		}
		return length;
	}

	public int getNumberOfStackItems() {
		if (numberOfStackItems == null) {
			int length = 5 + getLocalsByteLength();
			numberOfStackItems = new Num2(bytes, offset + length);
		}
		return numberOfStackItems.getNum();
	}

	public VerificationTypeInfo[] getStack() {
		if (stack == null) {
			stack = new VerificationTypeInfo[getNumberOfStackItems()];
			int length = 7 + getLocalsByteLength();
			for (int i = 0, len = stack.length; i < len; i++) {
				stack[i] = new VerificationTypeInfo(bytes, offset + length);
				length += stack[i].getByteLength();
			}
		}
		return stack;
	}
	
	private int getStackByteLength() {
		int base = 7 + getLocalsByteLength();
		int length = 0;
		for (int i = 0, len = stack.length; i < len; i++) {
			stack[i] = new VerificationTypeInfo(bytes, offset + base + length);
			length += stack[i].getByteLength();
		}
		return length;
	}

	@Override
	public String toString() {
		return "FullFrame [getOffsetDelta()=" + getOffsetDelta() + ", getNumberOfLocals()=" + getNumberOfLocals()
				+ ", getLocals()=" + Arrays.toString(getLocals()) + ", getNumberOfStackItems()="
				+ getNumberOfStackItems() + ", getStack()=" + Arrays.toString(getStack()) + ", getFrameType()="
				+ getFrameType() + "]";
	}
}
