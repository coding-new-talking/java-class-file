package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.attribute.util.ElementValueTag;
import org.codingnewtalking.classfile.util.Index2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class ElementValueUnion {

	private byte[] bytes;
	private int offset;
	
	private ElementValueTag tag;
	
	private Index2 constValueIndex;
	private EnumConstValue enumConstValue;
	private Index2 classInfoIndex;
	private Annotation annotationValue;
	private ArrayValue arrayValue;
	
	public ElementValueUnion(byte[] bytes, int offset, ElementValueTag tag) {
		this.bytes = bytes;
		this.offset = offset;
		this.tag = tag;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (tag.isConstant()) {
			return 2;
		}
		if (tag.isEnum()) {
			return 4;
		}
		if (tag.isClass()) {
			return 2;
		}
		if (tag.isAnnotation()) {
			return getAnnotationValue().getByteLength();
		}
		if (tag.isArray()) {
			return getArrayValue().getByteLength();
		}
		throw new IllegalArgumentException("tag=" + tag.getTag() + ", tagChar='" + tag.getTagChar() + "'");
	}
	
	public int getConstValueIndex() {
		if (!tag.isConstant()) {
			throw new IllegalArgumentException("tag is not Constant");
		}
		if (constValueIndex == null) {
			constValueIndex = new Index2(bytes, offset);
		}
		return constValueIndex.getIndex();
	}

	public EnumConstValue getEnumConstValue() {
		if (!tag.isEnum()) {
			throw new IllegalArgumentException("tag is not Enum");
		}
		if (enumConstValue == null) {
			enumConstValue = new EnumConstValue(bytes, offset);
		}
		return enumConstValue;
	}

	public int getClassInfoIndex() {
		if (!tag.isClass()) {
			throw new IllegalArgumentException("tag is not Class");
		}
		if (classInfoIndex == null) {
			classInfoIndex = new Index2(bytes, offset);
		}
		return classInfoIndex.getIndex();
	}

	public Annotation getAnnotationValue() {
		if (!tag.isAnnotation()) {
			throw new IllegalArgumentException("tag is not Annotation");
		}
		if (annotationValue == null) {
			annotationValue = new Annotation(bytes, offset);
		}
		return annotationValue;
	}

	public ArrayValue getArrayValue() {
		if (!tag.isArray()) {
			throw new IllegalArgumentException("tag is not Array");
		}
		if (arrayValue == null) {
			arrayValue = new ArrayValue(bytes, offset);
		}
		return arrayValue;
	}

	@Override
	public String toString() {
		return "ElementValueUnion ["
				+ (tag.isConstant() ? "getConstValueIndex()=" + getConstValueIndex() : "")
				+ (tag.isEnum() ? ", getEnumConstValue()=" + getEnumConstValue() : "")
				+ (tag.isClass() ? ", getClassInfoIndex()=" + getClassInfoIndex() : "")
				+ (tag.isAnnotation() ? ", getAnnotationValue()=" + getAnnotationValue() : "")
				+ (tag.isArray() ? ", getArrayValue()=" + getArrayValue() : "")
				+ "]";
	}
}
