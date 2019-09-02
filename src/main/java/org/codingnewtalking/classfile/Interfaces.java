package org.codingnewtalking.classfile;

import java.util.Arrays;

import org.codingnewtalking.unsigned.U2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Interfaces {
	
	private byte[] bytes;
	private int offset;
	
	private int interfacesCount;
	private ConstantPool constantPool;
	
	private U2[] u2s;
	
	public Interfaces(byte[] bytes, int offset, int interfacesCount, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.interfacesCount = interfacesCount;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return interfacesCount * 2;
	}

	public int[] getClassIndexes() {
		if (u2s == null) {
			u2s = new U2[interfacesCount];
			for (int i = 0; i < interfacesCount; i++) {
				u2s[i] = new U2(bytes, offset + i * 2);
			}
		}
		int[] indexes = new int[interfacesCount];
		for (int i = 0; i < interfacesCount; i++) {
			indexes[i] = u2s[i].getValue();
		}
		return indexes;
	}

	public String[] getClassNames() {
		int[] indexes = getClassIndexes();
		String[] names = new String[indexes.length];
		int nameIndex = 0;
		for (int i = 0; i < indexes.length; i++) {
			nameIndex = constantPool.getConstantClass(indexes[i]).getNameIndex();
			names[i] = constantPool.getConstantUtf8String(nameIndex);
		}
		return names;
	}

	@Override
	public String toString() {
		return "Interfaces [getClassIndexes()=" + Arrays.toString(getClassIndexes()) + ", getClassNames()="
				+ Arrays.toString(getClassNames()) + "]";
	}
	
}
