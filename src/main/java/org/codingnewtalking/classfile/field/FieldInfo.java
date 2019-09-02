package org.codingnewtalking.classfile.field;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.AttributeInfo;
import org.codingnewtalking.classfile.attribute.AttributeInfoBuilder;
import org.codingnewtalking.classfile.util.Count2;
import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.util.ByteUtils;


/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class FieldInfo {

	private byte[] bytes;
	private int offset;
	private int length;
	
	private ConstantPool constantPool;
	
	private FieldAccessFlags accessFlags;
	private Index2 nameIndex;
	private Index2 descriptorIndex;
	private Count2 attributesCount;
	private AttributeInfo[] attributes;
	
	public FieldInfo(byte[] bytes, int offset, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			length += 8;
			int attrlen = 0;
			for (int i = 0, count = getAttributesCount(); i < count; i++) {
				length += 2;
				attrlen = (int) ByteUtils.toUnsignedLong(bytes, offset + length, 4);
				length += 4 + attrlen;
			}
		}
		return length;
	}
	
	public ConstantPool getConstantPool() {
		return constantPool;
	}

	public FieldAccessFlags getAccessFlags() {
		if (accessFlags == null) {
			accessFlags = new FieldAccessFlags(bytes, offset);
		}
		return accessFlags;
	}

	public int getNameIndex() {
		if (nameIndex == null) {
			nameIndex = new Index2(bytes, offset + 2);
		}
		return nameIndex.getIndex();
	}

	public int getDescriptorIndex() {
		if (descriptorIndex == null) {
			descriptorIndex = new Index2(bytes, offset + 4);
		}
		return descriptorIndex.getIndex();
	}

	public int getAttributesCount() {
		if (attributesCount == null) {
			attributesCount = new Count2(bytes, offset + 6);
		}
		return attributesCount.getCount();
	}

	public AttributeInfo[] getAttributes() {
		if (attributes == null) {
			attributes = new AttributeInfo[getAttributesCount()];
			AttributeInfoBuilder builder = AttributeInfoBuilder.newBuilder(bytes, constantPool);
			int length = 8;
			for (int i = 0, len = attributes.length; i < len; i++) {
				attributes[i] = builder.build(offset + length);
				length += attributes[i].getByteLength();
			}
		}
		return attributes;
	}
	
	public String getName() {
		return constantPool.getConstantUtf8String(getNameIndex());
	}
	
	public String getDescriptor() {
		return constantPool.getConstantUtf8String(getDescriptorIndex());
	}

	@Override
	public String toString() {
		return "FieldInfo [getAccessFlags()=" + getAccessFlags() + ", getNameIndex()=" + getNameIndex()
		 		+ ", getName()=" + getName()
				+ ", getDescriptorIndex()=" + getDescriptorIndex()
				+ ", getDescriptor()=" + getDescriptor()
				+ ", getAttributesCount()=" + getAttributesCount()
				+ ", getAttributes()=" + Arrays.toString(getAttributes()) + "]";
	}
}
