package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class EndPc {
	
	private U2 u2;
	
	public EndPc(byte[] bytes, int offset) {
		this.u2 = new U2(bytes, offset);
	}
	
	public int getEndPc() {
		return u2.getValue();
	}

	@Override
	public String toString() {
		return "EndPc [getEndPc()=" + getEndPc() + "]";
	}
}
