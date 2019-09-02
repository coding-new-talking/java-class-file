package org.codingnewtalking.classfile.attribute.annotation;

import org.codingnewtalking.classfile.attribute.util.CatchTarget;
import org.codingnewtalking.classfile.attribute.util.EmptyTarget;
import org.codingnewtalking.classfile.attribute.util.FormalParameterTarget;
import org.codingnewtalking.classfile.attribute.util.LocalVarTarget;
import org.codingnewtalking.classfile.attribute.util.OffsetTarget;
import org.codingnewtalking.classfile.attribute.util.SupertypeTarget;
import org.codingnewtalking.classfile.attribute.util.TargetType;
import org.codingnewtalking.classfile.attribute.util.ThrowsTarget;
import org.codingnewtalking.classfile.attribute.util.TypeArgumentTarget;
import org.codingnewtalking.classfile.attribute.util.TypeParameterBoundTarget;
import org.codingnewtalking.classfile.attribute.util.TypeParameterTarget;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class TargetInfoUnion {

	private byte[] bytes;
	private int offset;
	
	private TargetType targetType;
	
	private TypeParameterTarget typeParameterTarget;
	private SupertypeTarget supertypeTarget;
	private TypeParameterBoundTarget typeParameterBoundTarget;
	private EmptyTarget emptyTarget;
	private FormalParameterTarget formalParameterTarget;
	private ThrowsTarget throwsTarget;
	private LocalVarTarget localVarTarget;
	private CatchTarget catchTarget;
	private OffsetTarget offsetTarget;
	private TypeArgumentTarget typeArgumentTarget;
	
	public TargetInfoUnion(byte[] bytes, int offset, TargetType targetType) {
		this.bytes = bytes;
		this.offset = offset;
		this.targetType = targetType;
	}
	
	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		if (targetType.isTypeParameterTarget()) {
			return 1;
		}
		if (targetType.isSupertypeTarget()) {
			return 2;
		}
		if (targetType.isTypeParameterBoundTarget()) {
			return 2;
		}
		if (targetType.isEmptyTarget()) {
			return 0;
		}
		if (targetType.isFormalParameterTarget()) {
			return 1;
		}
		if (targetType.isThrowsTarget()) {
			return 2;
		}
		if (targetType.isLocalVarTarget()) {
			return getLocalVarTarget().getByteLength();
		}
		if (targetType.isCatchTarget()) {
			return 2;
		}
		if (targetType.isOffsetTarget()) {
			return 2;
		}
		if (targetType.isTypeArgumentTarget()) {
			return 3;
		}
		throw new IllegalArgumentException("targetType=" + targetType.getTargetType()
				+ ", targetTypeHex=0x" + targetType.getTargetTypeHex());
	}
	
	public TypeParameterTarget getTypeParameterTarget() {
		if (targetType.isTypeParameterTarget()) {
			throw new IllegalArgumentException("targetType is not TypeParameterTarget");
		}
		if (typeParameterTarget == null) {
			typeParameterTarget = new TypeParameterTarget(bytes, offset);
		}
		return typeParameterTarget;
	}

	public SupertypeTarget getSupertypeTarget() {
		if (targetType.isSupertypeTarget()) {
			throw new IllegalArgumentException("targetType is not SupertypeTarget");
		}
		if (supertypeTarget == null) {
			supertypeTarget = new SupertypeTarget(bytes, offset);
		}
		return supertypeTarget;
	}

	public TypeParameterBoundTarget getTypeParameterBoundTarget() {
		if (targetType.isTypeParameterBoundTarget()) {
			throw new IllegalArgumentException("targetType is not TypeParameterBoundTarget");
		}
		if (typeParameterBoundTarget == null) {
			typeParameterBoundTarget = new TypeParameterBoundTarget(bytes, offset);
		}
		return typeParameterBoundTarget;
	}

	public EmptyTarget getEmptyTarget() {
		if (targetType.isEmptyTarget()) {
			throw new IllegalArgumentException("targetType is not EmptyTarget");
		}
		if (emptyTarget == null) {
			emptyTarget = new EmptyTarget(bytes, offset);
		}
		return emptyTarget;
	}

	public FormalParameterTarget getFormalParameterTarget() {
		if (targetType.isFormalParameterTarget()) {
			throw new IllegalArgumentException("targetType is not FormalParameterTarget");
		}
		if (formalParameterTarget == null) {
			formalParameterTarget = new FormalParameterTarget(bytes, offset);
		}
		return formalParameterTarget;
	}

	public ThrowsTarget getThrowsTarget() {
		if (targetType.isThrowsTarget()) {
			throw new IllegalArgumentException("targetType is not ThrowsTarget");
		}
		if (throwsTarget == null) {
			throwsTarget = new ThrowsTarget(bytes, offset);
		}
		return throwsTarget;
	}

	public LocalVarTarget getLocalVarTarget() {
		if (targetType.isLocalVarTarget()) {
			throw new IllegalArgumentException("targetType is not LocalVarTarget");
		}
		if (localVarTarget == null) {
			localVarTarget = new LocalVarTarget(bytes, offset);
		}
		return localVarTarget;
	}

	public CatchTarget getCatchTarget() {
		if (targetType.isCatchTarget()) {
			throw new IllegalArgumentException("targetType is not CatchTarget");
		}
		if (catchTarget == null) {
			catchTarget = new CatchTarget(bytes, offset);
		}
		return catchTarget;
	}

	public OffsetTarget getOffsetTarget() {
		if (targetType.isOffsetTarget()) {
			throw new IllegalArgumentException("targetType is not OffsetTarget");
		}
		if (offsetTarget == null) {
			offsetTarget = new OffsetTarget(bytes, offset);
		}
		return offsetTarget;
	}

	public TypeArgumentTarget getTypeArgumentTarget() {
		if (targetType.isTypeArgumentTarget()) {
			throw new IllegalArgumentException("targetType is not TypeArgumentTarget");
		}
		if (typeArgumentTarget == null) {
			typeArgumentTarget = new TypeArgumentTarget(bytes, offset);
		}
		return typeArgumentTarget;
	}
}
