package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.attribute.util.TypeArgumentIndex;
import org.codingnewtalking.classfile.attribute.util.TypePathKind;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class Path {

	private byte[] bytes;
	private int offset;
	
	private TypePathKind typePathKind;
	private TypeArgumentIndex typeArgumentIndex;
	
	public Path(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 2;
	}
	
	public TypePathKind getTypePathKind() {
		if (typePathKind == null) {
			typePathKind = new TypePathKind(bytes, offset);
		}
		return typePathKind;
	}

	public TypeArgumentIndex getTypeArgumentIndex() {
		if (typeArgumentIndex == null) {
			typeArgumentIndex = new TypeArgumentIndex(bytes, offset + 1);
		}
		return typeArgumentIndex;
	}
}
