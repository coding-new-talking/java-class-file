package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class Signature extends AttributeInfo {

	private Index2 signatureIndex;
	
	public Signature(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}
	
	public int getSignatureIndex() {
		if (signatureIndex == null) {
			signatureIndex = new Index2(bytes, offset + 6);
		}
		return signatureIndex.getIndex();
	}

	@Override
	public String toString() {
		return "Signature [getSignatureIndex()=" + getSignatureIndex() + ", getAttributeNameIndex()="
				+ getAttributeNameIndex() + ", getAttributeLength()=" + getAttributeLength() + "]";
	}
}
