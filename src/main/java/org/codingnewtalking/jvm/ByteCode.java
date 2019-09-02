package org.codingnewtalking.jvm;

import java.util.Arrays;

import org.codingnewtalking.classfile.ClassFile;
import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.field.FieldInfo;
import org.codingnewtalking.classfile.method.MethodInfo;
import org.codingnewtalking.util.AccessFlagsUtils;
import org.codingnewtalking.util.ArrayUtils;
import org.codingnewtalking.util.ForLoopUtils;
import org.codingnewtalking.util.HexUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class ByteCode {

	private ClassFile classFile;
	
	public ByteCode(ClassFile classFile) {
		this.classFile = classFile;
	}
	
	public ClassFile getClassFile() {
		return classFile;
	}
	
	public long getMagic() {
		return getClassFile().getMagic().getMagic();
	}
	
	public String getMagicHexString() {
		return HexUtils.toHexString(getMagic(), true);
	}
	
	public int getMinorVersion() {
		return getClassFile().getMinorVersion().getVersion();
	}
	
	public int getMajorVersion() {
		return getClassFile().getMajorVersion().getVersion();
	}
	
	public int getConstantPoolCount() {
		return getClassFile().getConstantPoolCount().getCount();
	}
	
	public ConstantPool getConstantPool() {
		return getClassFile().getConstantPool();
	}
	
	public int getAccessFlags() {
		return getClassFile().getAccessFlags().getAccessFlags();
	}
	
	public String getAccessFlagsHexString() {
		return AccessFlagsUtils.getHexString(getAccessFlags());
	}
	
	public String[] getAccessFlagsJvmString() {
		return AccessFlagsUtils.getJvmString(getAccessFlags());
	}
	
	public String getThisClass() {
		return getConstantPool().getConstantClassName(getClassFile().getThisClass().getClassIndex());
	}
	
	public String getSuperClass() {
		return getConstantPool().getConstantClassName(getClassFile().getSuperClass().getClassIndex());
	}
	
	public int getInterfacesCount() {
		return getClassFile().getInterfacesCount().getCount();
	}
	
	public String[] getInterfaces() {
		int[] classIndexes = getClassFile().getInterfaces().getClassIndexes();
		String[] classNames = new String[classIndexes.length];
		ForLoopUtils.each(classIndexes.length, (index) -> {
			classNames[index] = getConstantPool().getConstantClassName(classIndexes[index]);
		});
		return classNames;
	}
	
	public int getFieldsCount() {
		return getClassFile().getFieldsCount().getCount();
	}
	
	public FieldJvm[] getFields() {
		FieldInfo[] fieldInfos = getClassFile().getFields().getFields();
		FieldJvm[] fieldJvms = new FieldJvm[fieldInfos.length];
		ArrayUtils.map(fieldInfos, fieldJvms, (fieldInfo) -> {
			return new FieldJvm(fieldInfo);
		});
		return fieldJvms;
	}
	
	public int getMethodsCount() {
		return getClassFile().getMethodsCount().getCount();
	}
	
	public MethodJvm[] getMethods() {
		MethodInfo[] methodInfos = getClassFile().getMethods().getMethods();
		MethodJvm[] methodJvms = new MethodJvm[methodInfos.length];
		ArrayUtils.map(methodInfos, methodJvms, (methodInfo) -> {
			return new MethodJvm(methodInfo);
		});
		return methodJvms;
	}
	
	public int getAttributesCount() {
		return getClassFile().getAttributesCount().getCount();
	}
	
	public Object[] getAttributes() {
		return null;
	}
	
	public void toString(StringBuilder builder) {
		builder.append("Magic [").append(getMagicHexString()).append("]\r\n");
		builder.append("MinorVersion [").append(getMinorVersion()).append("]\r\n");
		builder.append("MajorVersion [").append(getMajorVersion()).append("]\r\n");
		builder.append("AccessFlagsJvmString ").append(Arrays.toString(getAccessFlagsJvmString())).append("\r\n");
		builder.append("ThisClass [").append(getThisClass()).append("]\r\n");
		builder.append("SuperClass [").append(getSuperClass()).append("]\r\n");
		builder.append("Interfaces ").append(Arrays.toString(getInterfaces())).append("\r\n");
		builder.append("Fields [\r\n");
		FieldJvm[] fieldJvms = getFields();
		ArrayUtils.action(fieldJvms, (index, fieldJvm) -> {
			builder.append("#").append(index).append(" Field [");
			builder.append(Arrays.toString(fieldJvm.getAccessFlagsJvmString()));
			builder.append(", ").append(fieldJvm.getName());
			builder.append(", ").append(fieldJvm.getDescriptor());
			builder.append("]\r\n");
		});
		builder.append("]\r\n");
		builder.append("Methods [\r\n");
		MethodJvm[] methodJvms = getMethods();
		ArrayUtils.action(methodJvms, (index, methodJvm) -> {
			builder.append("#").append(index).append(" Method [");
			builder.append(Arrays.toString(methodJvm.getAccessFlagsJvmString()));
			builder.append(", ").append(methodJvm.getName());
			builder.append(", ").append(methodJvm.getDescriptor());
			builder.append(", ").append(ArrayUtils.join(methodJvm.getParametersName(), ", ", "(", ")"));
			builder.append("]\r\n");
		});
		builder.append("]\r\n");
	}
}
