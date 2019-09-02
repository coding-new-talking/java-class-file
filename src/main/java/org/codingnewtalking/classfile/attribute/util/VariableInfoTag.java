package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class VariableInfoTag {
	
	private U1 u1;
	
	public VariableInfoTag(byte[] bytes, int offset) {
		this.u1 = new U1(bytes, offset);
	}
	
	public int getByteOffset() {
		return u1.getByteOffset();
	}

	public int getByteLength() {
		return u1.getByteLength();
	}
	
	public int getTag() {
		return u1.getValue();
	}

	@Override
	public String toString() {
		return "VariableInfoTag [getTag()=" + getTag() + "]";
	}
	
	public static final int ITEM_Top = 0;
	public static final int ITEM_Integer = 1;
	public static final int ITEM_Float = 2;
	public static final int ITEM_Null = 5;
	public static final int ITEM_UninitializedThis = 6;
	public static final int ITEM_Object = 7;
	public static final int ITEM_Uninitialized = 8;
	public static final int ITEM_Long = 4;
	public static final int ITEM_Double = 3;
}
