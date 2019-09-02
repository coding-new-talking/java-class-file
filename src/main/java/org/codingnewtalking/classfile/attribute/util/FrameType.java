package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class FrameType {
	
	private U1 u1;
	
	public FrameType(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}
	
	public int getFrameType() {
		return u1.getValue();
	}

	@Override
	public String toString() {
		return "FrameType [getFrameType()=" + getFrameType() + "]";
	}
	
	public boolean isSameFrame() {
		return isSameFrame(getFrameType());
	}
	
	public boolean isSameLocals1StackItemFrame() {
		return isSameLocals1StackItemFrame(getFrameType());
	}
	
	public boolean isSameLocals1StackItemFrameExtended() {
		return isSameLocals1StackItemFrameExtended(getFrameType());
	}
	
	public boolean isChopFrame() {
		return isChopFrame(getFrameType());
	}
	
	public boolean isSameFrameExtended() {
		return isSameFrameExtended(getFrameType());
	}
	
	public boolean isAppendFrame() {
		return isAppendFrame(getFrameType());
	}
	
	public boolean isFullFrame() {
		return isFullFrame(getFrameType());
	}
	
	//Statics
	
	public static boolean isSameFrame(int frameType) {
		return SAME_Begin <= frameType && frameType <= SAME_End;
	}
	
	public static boolean isSameLocals1StackItemFrame(int frameType) {
		return SAME_LOCALS_1_STACK_ITEM_Begin <= frameType && frameType <= SAME_LOCALS_1_STACK_ITEM_End;
	}
	
	public static boolean isSameLocals1StackItemFrameExtended(int frameType) {
		return frameType == SAME_LOCALS_1_STACK_ITEM_EXTENDED;
	}
	
	public static boolean isChopFrame(int frameType) {
		return CHOP_Begin <= frameType && frameType <= CHOP_End;
	}
	
	public static boolean isSameFrameExtended(int frameType) {
		return frameType == SAME_FRAME_EXTENDED;
	}
	
	public static boolean isAppendFrame(int frameType) {
		return APPEND_Begin <= frameType && frameType <= APPEND_End;
	}
	
	public static boolean isFullFrame(int frameType) {
		return frameType == FULL;
	}
	
	public static final int SAME_Begin = 0;
	public static final int SAME_End = 63;
	
	public static final int SAME_LOCALS_1_STACK_ITEM_Begin = 64;
	public static final int SAME_LOCALS_1_STACK_ITEM_End = 127;
	
	//the range [128-246] are reserved for future use.
	
	public static final int SAME_LOCALS_1_STACK_ITEM_EXTENDED = 247;
	
	public static final int CHOP_Begin = 248;
	public static final int CHOP_End = 250;
	
	public static final int SAME_FRAME_EXTENDED = 251;
	
	public static final int APPEND_Begin = 252;
	public static final int APPEND_End = 254;
	
	public static final int FULL = 255;
}
