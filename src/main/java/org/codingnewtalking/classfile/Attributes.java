package org.codingnewtalking.classfile;

import org.codingnewtalking.classfile.attribute.AttributeInfo;
import org.codingnewtalking.classfile.attribute.AttributeInfoBuilder;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class Attributes {

	private byte[] bytes;
	private int offset;
	private int length;

	private int attributesCount;
	private ConstantPool constantPool;

	private AttributeInfo[] attributes;
	
	public Attributes(byte[] bytes, int offset, int attributesCount, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.attributesCount = attributesCount;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			int attrlen = 0;
			for (int i = 0; i < attributesCount; i++) {
				length += 2;
				attrlen = (int) ByteUtils.toUnsignedLong(bytes, offset + length, 4);
				length += 4 + attrlen;
			}
		}
		return length;
	}


	public AttributeInfo[] getAttributes() {
		if (attributes == null) {
			attributes = new AttributeInfo[attributesCount];
			AttributeInfoBuilder builder = AttributeInfoBuilder.newBuilder(bytes, constantPool);
			int length = 0;
			for (int i = 0, len = attributes.length; i < len; i++) {
				attributes[i] = builder.build(offset + length);
				length += attributes[i].getByteLength();
			}
		}
		return attributes;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Attributes [\r\n");
		for (int i = 0, len = getAttributes().length; i < len; i++) {
			sb.append("#" + i).append(" = ")
				.append(getAttributes()[i]).append("\r\n");
		}
		sb.append("]");
		return sb.toString();
	}
}
