package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-08-10
 */
public class VariableInfoBuilder {

	private byte[] bytes;
	
	private VariableInfoBuilder(byte[] bytes) {
		this.bytes = bytes;
	}
	
	public static VariableInfoBuilder newBuilder(byte[] bytes) {
		return new VariableInfoBuilder(bytes);
	}
	
	public VariableInfo build(int offset) {
		return build(bytes, offset);
	}
	
	public static VariableInfo build(byte[] bytes, int offset) {
		int tag = ByteUtils.toUnsigned(bytes[offset]);
		switch (tag) {
			case VariableInfoTag.ITEM_Top:
				return new TopVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Integer:
				return new IntegerVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Float:
				return new FloatVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Null:
				return new NullVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_UninitializedThis:
				return new UninitializedThisVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Object:
				return new ObjectVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Uninitialized:
				return new UninitializedVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Long:
				return new LongVariableInfo(bytes, offset);
			case VariableInfoTag.ITEM_Double:
				return new DoubleVariableInfo(bytes, offset);
		}
		throw new IllegalArgumentException("tag=" + tag);
	}
	
	public static int getByteLength(byte[] bytes, int offset) {
		int tag = ByteUtils.toUnsigned(bytes[offset]);
		switch (tag) {
			case VariableInfoTag.ITEM_Top:
				return 1;
			case VariableInfoTag.ITEM_Integer:
				return 1;
			case VariableInfoTag.ITEM_Float:
				return 1;
			case VariableInfoTag.ITEM_Null:
				return 1;
			case VariableInfoTag.ITEM_UninitializedThis:
				return 1;
			case VariableInfoTag.ITEM_Object:
				return 3;
			case VariableInfoTag.ITEM_Uninitialized:
				return 3;
			case VariableInfoTag.ITEM_Long:
				return 1;
			case VariableInfoTag.ITEM_Double:
				return 1;
		}
		throw new IllegalArgumentException("tag=" + tag);
	}

}
