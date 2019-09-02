package org.codingnewtalking.classfile;

import org.codingnewtalking.classfile.method.MethodInfo;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Methods {

	private byte[] bytes;
	private int offset;
	private int length;

	private int methodsCount;
	private ConstantPool constantPool;

	private MethodInfo[] methods;
	
	public Methods(byte[] bytes, int offset, int methodsCount, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.methodsCount = methodsCount;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			for (int i = 0; i < methodsCount; i++) {
				length += 6;
				int count = ByteUtils.toUnsigned(bytes, offset + length, 2);
				length += 2;
				int attrlen = 0;
				for (int j = 0; j < count; j++) {
					length += 2;
					attrlen = (int) ByteUtils.toUnsignedLong(bytes, offset + length, 4);
					length += 4 + attrlen;
				}
			}
		}
		return length;
	}


	public MethodInfo[] getMethods() {
		if (methods == null) {
			methods = new MethodInfo[methodsCount];
			int length = 0;
			for (int i = 0; i < methodsCount; i++) {
				methods[i] = new MethodInfo(bytes, offset + length, constantPool);
				length += methods[i].getByteLength();
			}
		}
		return methods;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Methods [\r\n");
		for (int i = 0, len = getMethods().length; i < len; i++) {
			sb.append("#" + i).append(" = ")
				.append(getMethods()[i]).append("\r\n");
		}
		sb.append("]");
		return sb.toString();
	}
}
