package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class LineNumTable {
	
	private byte[] bytes;
	private int offset;
	
	private StartPc startPc;
	private LineNumber lineNumber;
	
	public LineNumTable(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getStartPc() {
		if (startPc == null) {
			startPc = new StartPc(bytes, offset);
		}
		return startPc.getStartPc();
	}
	
	public int getLineNumber() {
		if (lineNumber == null) {
			lineNumber = new LineNumber(bytes, offset + 2);
		}
		return lineNumber.getLineNumber();
	}

	@Override
	public String toString() {
		return "LineNumTable [getStartPc()=" + getStartPc() + ", getLineNumber()=" + getLineNumber() + "]";
	}
}
