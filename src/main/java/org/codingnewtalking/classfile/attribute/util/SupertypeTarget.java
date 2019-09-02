package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class SupertypeTarget {
	
	private U2 supertypeIndex;
	
	public SupertypeTarget(byte[] bytes, int offset) {
		this.supertypeIndex = new U2(bytes, offset);
	}
	
	public int getSupertypeIndex() {
		return supertypeIndex.getValue();
	}

	@Override
	public String toString() {
		return "SupertypeTarget [getSupertypeIndex()=" + getSupertypeIndex() + "]";
	}
}
