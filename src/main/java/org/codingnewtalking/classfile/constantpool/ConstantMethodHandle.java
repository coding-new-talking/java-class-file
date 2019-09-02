package org.codingnewtalking.classfile.constantpool;

import org.codingnewtalking.classfile.constantpool.util.RefKind;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-11
 */
public class ConstantMethodHandle extends ConstantEntry {

	private RefKind refKind;
	private Index2 refIndex;
	
	public ConstantMethodHandle(byte[] bytes, int offset) {
		super(bytes, offset);
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 1 + 1 + 2;
	}
	
	public int getRefKind() {
		if (refKind == null) {
			refKind = new RefKind(bytes, offset + 1);
		}
		return refKind.getRefKind();
	}
	
	public int getRefIndex() {
		if (refIndex == null) {
			refIndex = new Index2(bytes, offset + 2);
		}
		return refIndex.getIndex();
	}

	@Override
	public String toString() {
		return "ConstantMethodHandle [getRefKind()=" + getRefKind() + ", getRefIndex()=" + getRefIndex() + ", getTag()="
				+ getTag() + "]";
	}
}
