package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class FormalParameterTarget {
	
	private U1 formalParameterIndex;
	
	public FormalParameterTarget(byte[] bytes, int offset) {
		this.formalParameterIndex = new U1(bytes, offset);
	}
	
	public int getFormalParameterIndex() {
		return formalParameterIndex.getValue();
	}

	@Override
	public String toString() {
		return "FormalParameterTarget [getFormalParameterIndex()=" + getFormalParameterIndex() + "]";
	}
}
