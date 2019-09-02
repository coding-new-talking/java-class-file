package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class ExceptionTable {
	
	private byte[] bytes;
	private int offset;
	
	private StartPc startPc;
	private EndPc endPc;
	private HandlerPc handlerPc;
	private Index2 catchType;
	
	public ExceptionTable(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getStartPc() {
		if (startPc == null) {
			startPc = new StartPc(bytes, offset);
		}
		return startPc.getStartPc();
	}

	public int getEndPc() {
		if (endPc == null) {
			endPc = new EndPc(bytes, offset + 2);
		}
		return endPc.getEndPc();
	}

	public int getHandlerPc() {
		if (handlerPc == null) {
			handlerPc = new HandlerPc(bytes, offset + 4);
		}
		return handlerPc.getHandlerPc();
	}

	public int getCatchType() {
		if (catchType == null) {
			catchType = new Index2(bytes, offset + 6);
		}
		return catchType.getIndex();
	}

	@Override
	public String toString() {
		return "ExceptionTable [getStartPc()=" + getStartPc() + ", getEndPc()=" + getEndPc() + ", getHandlerPc()="
				+ getHandlerPc() + ", getCatchType()=" + getCatchType() + "]";
	}
	
}
