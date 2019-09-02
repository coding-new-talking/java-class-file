package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-08-09
 */
public class ObjectVariableInfo extends VariableInfo {

	private Index2 cpoolIndex;
	
	public ObjectVariableInfo(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}
	
	public int getByteLength() {
		return 3;
	}
	
	public int getCpoolIndex() {
		if (cpoolIndex == null) {
			cpoolIndex = new Index2(bytes, offset + 1);
		}
		return cpoolIndex.getIndex();
	}
}
