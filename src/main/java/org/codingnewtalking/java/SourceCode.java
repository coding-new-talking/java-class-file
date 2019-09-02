package org.codingnewtalking.java;

import java.util.Arrays;

import org.codingnewtalking.jvm.ByteCode;
import org.codingnewtalking.jvm.FieldJvm;
import org.codingnewtalking.jvm.MethodJvm;
import org.codingnewtalking.util.AccessFlagsUtils;
import org.codingnewtalking.util.ArrayUtils;
import org.codingnewtalking.util.JJTypeUtils;

/**
 * @author lixinjie
 * @since 2019-08-31
 */
public class SourceCode {

	private ByteCode byteCode;
	
	public SourceCode(ByteCode byteCode) {
		this.byteCode = byteCode;
	}
	
	public ByteCode getByteCode() {
		return byteCode;
	}
	
	public String[] getAccessFlagsJavaString() {
		return AccessFlagsUtils.getJavaString(getByteCode().getAccessFlags());
	}
	
	public String getClassName() {
		return JJTypeUtils.jvmClassNameToJava(getByteCode().getThisClass());
	}
	
	public String getSuperClassName() {
		return JJTypeUtils.jvmClassNameToJava(getByteCode().getSuperClass());
	}
	
	public String[] getInterfaceNames() {
		return JJTypeUtils.jvmClassNameToJava(getByteCode().getInterfaces());
	}
	
	public FieldJava[] getFields() {
		FieldJvm[] fieldJvms = getByteCode().getFields();
		FieldJava[] fieldJavas = new FieldJava[fieldJvms.length];
		ArrayUtils.map(fieldJvms, fieldJavas, (fieldJvm) -> {
			return new FieldJava(fieldJvm);
		});
		return fieldJavas;
	}
	
	public MethodJava[] getMethods() {
		MethodJvm[] methodJvms = getByteCode().getMethods();
		MethodJava[] methodJavas = new MethodJava[methodJvms.length];
		ArrayUtils.map(methodJvms, methodJavas, (methodJvm) -> {
			return new MethodJava(methodJvm);
		});
		return methodJavas;
	}
	
	public void toString(StringBuilder builder) {
		builder.append("AccessFlagsJavaString ").append(Arrays.toString(getAccessFlagsJavaString())).append("\r\n");
		builder.append("ClassName [").append(getClassName()).append("]\r\n");
		builder.append("SuperClassName [").append(getSuperClassName()).append("]\r\n");
		builder.append("InterfaceNames ").append(Arrays.toString(getInterfaceNames())).append("\r\n");
		builder.append("Fields [\r\n");
		FieldJava[] fieldJavas = getFields();
		ArrayUtils.action(fieldJavas, (index, fieldJava) -> {
			builder.append("#").append(index).append(" Field [");
			builder.append(Arrays.toString(fieldJava.getAccessFlagsJavaString()));
			builder.append(", ").append(fieldJava.getType());
			builder.append(", ").append(fieldJava.getName());
			builder.append("]\r\n");
		});
		builder.append("]\r\n");
		builder.append("Methods [\r\n");
		MethodJava[] methodJavas = getMethods();
		ArrayUtils.action(methodJavas, (index, methodJava) -> {
			builder.append("#").append(index).append(" Method [");
			builder.append(Arrays.toString(methodJava.getAccessFlagsJavaString()));
			builder.append(", ").append(methodJava.getReturnType());
			builder.append(", ").append(methodJava.getName());
			builder.append(", ").append(ArrayUtils.join(methodJava.getParametersType(), ", ", "(", ")"));
			builder.append(", ").append(ArrayUtils.join(methodJava.getParametersName(), ", ", "(", ")"));
			builder.append("]\r\n");
		});
		builder.append("]\r\n");
	}
}
