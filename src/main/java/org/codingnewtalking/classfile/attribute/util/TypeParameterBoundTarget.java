package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class TypeParameterBoundTarget {
	
	private U1 typeParameterIndex;
	private U1 boundIndex;
	
	public TypeParameterBoundTarget(byte[] bytes, int offset) {
		this.typeParameterIndex = new U1(bytes, offset);
		this.boundIndex = new U1(bytes, offset + 1);
	}
	
	public int getTypeParameterIndex() {
		return typeParameterIndex.getValue();
	}
	
	public int getBoundIndex() {
		return boundIndex.getValue();
	}

	@Override
	public String toString() {
		return "TypeParameterBoundTarget [getTypeParameterIndex()=" + getTypeParameterIndex() + ", getBoundIndex()=" + getBoundIndex() + "]";
	}
}
