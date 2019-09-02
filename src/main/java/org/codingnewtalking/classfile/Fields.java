package org.codingnewtalking.classfile;

import org.codingnewtalking.classfile.field.FieldInfo;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class Fields {

	private byte[] bytes;
	private int offset;
	private int length;

	private int fieldsCount;
	private ConstantPool constantPool;
	
	private FieldInfo[] fields;
	
	public Fields(byte[] bytes, int offset, int fieldsCount, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.fieldsCount = fieldsCount;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			for (int i = 0; i < fieldsCount; i++) {
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

	public FieldInfo[] getFields() {
		if (fields == null) {
			fields = new FieldInfo[fieldsCount];
			int length = 0;
			for (int i = 0; i < fieldsCount; i++) {
				fields[i] = new FieldInfo(bytes, offset + length, constantPool);
				length += fields[i].getByteLength();
			}
		}
		return fields;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Fields [\r\n");
		for (int i = 0, len = getFields().length; i < len; i++) {
			sb.append("#" + i).append(" = ")
				.append(getFields()[i]).append("\r\n");
		}
		sb.append("]");
		return sb.toString();
	}
}
