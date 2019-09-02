package org.codingnewtalking.classfile;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class SuperClass {
	
	private ConstantPool constantPool;
	
	private U2 u2;
	
	public SuperClass(byte[] bytes, int offset, ConstantPool constantPool) {
		this.u2 = new U2(bytes, offset);
		this.constantPool = constantPool;
	}
	
	public int getByteOffset() {
		return u2.getByteOffset();
	}

	public int getByteLength() {
		return u2.getByteLength();
	}

	public int getClassIndex() {
		return u2.getValue();
	}
	
	public String getClassName() {
		int nameIndex = constantPool.getConstantClass(getClassIndex()).getNameIndex();
		return constantPool.getConstantUtf8String(nameIndex);
	}

	@Override
	public String toString() {
		return "SuperClass [getClassIndex()=" + getClassIndex() + ", getClassName()=" + getClassName() + "]";
	}
	
}
