package org.codingnewtalking.classfile.attribute.util;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class UninitializedVariableInfo extends VariableInfo {

	private Offset2 _offset;
	
	public UninitializedVariableInfo(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3;
	}
	
	public int getOffset() {
		if (_offset == null) {
			_offset = new Offset2(bytes, offset + 1);
		}
		return _offset.getOffset();
	}
}
