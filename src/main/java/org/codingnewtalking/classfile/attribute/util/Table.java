package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-16
 */
public class Table {
	
	private StartPc startPc;
	private Length2 length;
	private Index2 index;
	
	public Table(byte[] bytes, int offset) {
		this.startPc = new StartPc(bytes, offset);
		this.length = new Length2(bytes, offset + 2);
		this.index = new Index2(bytes, offset + 4);
	}
	
	public int getStartPc() {
		return startPc.getStartPc();
	}
	
	public int getLength() {
		return length.getLength();
	}
	
	public int getIndex() {
		return index.getIndex();
	}
}
