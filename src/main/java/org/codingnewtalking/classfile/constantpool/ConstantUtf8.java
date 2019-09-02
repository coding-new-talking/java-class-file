package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.util.ByteString;
import org.codingnewtalking.classfile.util.Length2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantUtf8 extends ConstantEntry {

	private Length2 length2;
	private ByteString byteString;
	
	public ConstantUtf8(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 2 + getLength();
	}
	
	public int getLength() {
		if (length2 == null) {
			length2 = new Length2(bytes, offset + 1);
		}
		return length2.getLength();
	}
	
	public String getString() {
		if (byteString == null) {
			byteString = new ByteString(bytes, offset + 3, getLength());
		}
		return byteString.getString();
	}

	@Override
	public String toString() {
		return "ConstantUtf8 [getLength()=" + getLength() + ", getString()=" + getString() + ", getTag()=" + getTag()
				+ "]";
	}
}
