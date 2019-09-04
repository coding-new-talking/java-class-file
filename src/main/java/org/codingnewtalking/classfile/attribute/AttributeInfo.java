package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Length4;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public abstract class AttributeInfo {

	protected byte[] bytes;
	protected int offset;
	protected ConstantPool constantPool;
	
	protected Index2 attributeNameIndex;
	protected Length4 attributeLength;
	
	public AttributeInfo(byte[] bytes, int offset, ConstantPool constantPool) {
		this.bytes = bytes;
		this.offset = offset;
		this.constantPool = constantPool;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 2 + 4 + getAttributeLength();
	}
	
	public ConstantPool getConstantPool() {
		return constantPool;
	}
	
	public int getAttributeNameIndex() {
		if (attributeNameIndex == null) {
			attributeNameIndex = new Index2(bytes, offset);
		}
		return attributeNameIndex.getIndex();
	}
	
	public int getAttributeLength() {
		if (attributeLength == null) {
			attributeLength = new Length4(bytes, offset + 2);
		}
		return (int) attributeLength.getLength();
	}
	
	public String getAttributeName() {
		return constantPool.getConstantUtf8String(getAttributeNameIndex());
	}
	
	public String toString(String baseBlank, String blankUnit, String blank4) {
		return "";
	}
}
