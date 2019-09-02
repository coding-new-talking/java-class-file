package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.attribute.util.TargetType;
import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class TypeAnnotation {

	private byte[] bytes;
	private int offset;
	private int length;

	private TargetType targetType;
	private TargetInfoUnion union;
	private TypePath targetPath;
	private Index2 typeIndex;
	private Num2 numElementValuePairs;
	private ElementValuePair[] elementValuePairs;
	
	public TypeAnnotation(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (length == 0) {
			getTargetType();
			getUnion();
			getTargetPath();
			getTypeIndex();
			getNumElementValuePairs();
			getElementValuePairs();
		}
		return length;
	}
	
	public TargetType getTargetType() {
		if (targetType == null) {
			targetType = new TargetType(bytes, offset);
			length += 1;
		}
		return targetType;
	}

	public TargetInfoUnion getUnion() {
		if (union == null) {
			union = new TargetInfoUnion(bytes, offset + length, targetType);
			length += union.getByteLength();
		}
		return union;
	}

	public TypePath getTargetPath() {
		if (targetPath == null) {
			targetPath = new TypePath(bytes, offset + length);
			length += targetPath.getByteLength();
		}
		return targetPath;
	}

	public int getTypeIndex() {
		if (typeIndex == null) {
			typeIndex = new Index2(bytes, offset + length);
			length += 2;
		}
		return typeIndex.getIndex();
	}

	public int getNumElementValuePairs() {
		if (numElementValuePairs == null) {
			numElementValuePairs = new Num2(bytes, offset);
			length += 2;
		}
		return numElementValuePairs.getNum();
	}

	public ElementValuePair[] getElementValuePairs() {
		if (elementValuePairs == null) {
			elementValuePairs = new ElementValuePair[getNumElementValuePairs()];
			for (int i = 0, len = elementValuePairs.length; i < len; i++) {
				elementValuePairs[i] = new ElementValuePair(bytes, offset + length);
				length += elementValuePairs[i].getByteLength();
			}
		}
		return elementValuePairs;
	}
}
