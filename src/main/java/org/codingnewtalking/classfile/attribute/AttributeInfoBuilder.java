package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-07-15
 */
public class AttributeInfoBuilder {

	private byte[] bytes;
	private ConstantPool constantPool;
	
	private AttributeInfoBuilder(byte[] bytes, ConstantPool constantPool) {
		this.bytes = bytes;
		this.constantPool = constantPool;
	}
	
	public static AttributeInfoBuilder newBuilder(byte[] bytes, ConstantPool constantPool) {
		return new AttributeInfoBuilder(bytes, constantPool);
	}
	
	public AttributeInfo build(int offset) {
		int attributeNameIndex = ByteUtils.toUnsigned(bytes[offset], bytes[offset + 1]);
		String attributeName = constantPool.getConstantUtf8String(attributeNameIndex);
		switch (attributeName) {
			case ConstantValue_Attribute:
				return new ConstantValue(bytes, offset, constantPool);
			case Code_Attribute:
				return new Code(bytes, offset, constantPool);
			case StackMapTable_Attribute:
				return new StackMapTable(bytes, offset, constantPool);
			case Exceptions_Attribute:
				return new Exceptions(bytes, offset, constantPool);
			case InnerClasses_Attribute:
				return new InnerClasses(bytes, offset, constantPool);
			case EnclosingMethod_Attribute:
				return new EnclosingMethod(bytes, offset, constantPool);
			case Synthetic_Attribute:
				return new Synthetic(bytes, offset, constantPool);
			case Signature_Attribute:
				return new Signature(bytes, offset, constantPool);
			case SourceFile_Attribute:
				return new SourceFile(bytes, offset, constantPool);
			case SourceDebugExtension_Attribute:
				return new SourceDebugExtension(bytes, offset, constantPool);
			case LineNumberTable_Attribute:
				return new LineNumberTable(bytes, offset, constantPool);
			case LocalVariableTable_Attribute:
				return new LocalVariableTable(bytes, offset, constantPool);
			case LocalVariableTypeTable_Attribute:
				return new LocalVariableTypeTable(bytes, offset, constantPool);
			case Deprecated_Attribute:
				return new Deprecated(bytes, offset, constantPool);
			case RuntimeVisibleAnnotations_Attribute:
				return new RuntimeVisibleAnnotations(bytes, offset, constantPool);
			case RuntimeInvisibleAnnotations_Attribute:
				return new RuntimeInvisibleAnnotations(bytes, offset, constantPool);
			case RuntimeVisibleParameterAnnotations_Attribute:
				return new RuntimeVisibleParameterAnnotations(bytes, offset, constantPool);
			case RuntimeInvisibleParameterAnnotations_Attribute:
				return new RuntimeInvisibleParameterAnnotations(bytes, offset, constantPool);
			case RuntimeVisibleTypeAnnotations_Attribute:
				return new RuntimeVisibleTypeAnnotations(bytes, offset, constantPool);
			case RuntimeInvisibleTypeAnnotations_Attribute:
				return new RuntimeInvisibleTypeAnnotations(bytes, offset, constantPool);
			case AnnotationDefault_Attribute:
				return new AnnotationDefault(bytes, offset, constantPool);
			case BootstrapMethods_Attribute:
				return new BootstrapMethods(bytes, offset, constantPool);
			case MethodParameters_Attribute:
				return new MethodParameters(bytes, offset, constantPool);
		}
		throw new RuntimeException(attributeName);
	}
	
	public static final String ConstantValue_Attribute = "ConstantValue";
	public static final String Code_Attribute = "Code";
	public static final String StackMapTable_Attribute = "StackMapTable";
	public static final String Exceptions_Attribute = "Exceptions";
	public static final String InnerClasses_Attribute = "InnerClasses";
	public static final String EnclosingMethod_Attribute = "EnclosingMethod";
	public static final String Synthetic_Attribute = "Synthetic";
	public static final String Signature_Attribute = "Signature";
	public static final String SourceFile_Attribute = "SourceFile";
	public static final String SourceDebugExtension_Attribute = "SourceDebugExtension";
	public static final String LineNumberTable_Attribute = "LineNumberTable";
	public static final String LocalVariableTable_Attribute = "LocalVariableTable";
	public static final String LocalVariableTypeTable_Attribute = "LocalVariableTypeTable";
	public static final String Deprecated_Attribute = "Deprecated";
	public static final String RuntimeVisibleAnnotations_Attribute = "RuntimeVisibleAnnotations";
	public static final String RuntimeInvisibleAnnotations_Attribute = "RuntimeInvisibleAnnotations";
	public static final String RuntimeVisibleParameterAnnotations_Attribute = "RuntimeVisibleParameterAnnotations";
	public static final String RuntimeInvisibleParameterAnnotations_Attribute = "RuntimeInvisibleParameterAnnotations";
	public static final String RuntimeVisibleTypeAnnotations_Attribute = "RuntimeVisibleTypeAnnotations";
	public static final String RuntimeInvisibleTypeAnnotations_Attribute = "RuntimeInvisibleTypeAnnotations";
	public static final String AnnotationDefault_Attribute = "AnnotationDefault";
	public static final String BootstrapMethods_Attribute = "BootstrapMethods";
	public static final String MethodParameters_Attribute = "MethodParameters";
}
