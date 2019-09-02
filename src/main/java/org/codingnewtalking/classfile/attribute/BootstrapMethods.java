package org.codingnewtalking.classfile.attribute;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.BootstrapMethod;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class BootstrapMethods extends AttributeInfo {
	
	private Num2 numBootstrapMethods;
	private BootstrapMethod[] bootstrapMethods;
	
	public BootstrapMethods(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumBootstrapMethods() {
		if (numBootstrapMethods == null) {
			numBootstrapMethods = new Num2(bytes, offset + 6);
		}
		return numBootstrapMethods.getNum();
	}

	public BootstrapMethod[] getBootstrapMethods() {
		bootstrapMethods = new BootstrapMethod[getNumBootstrapMethods()];
		int length = 0;
		for (int i = 0, len = bootstrapMethods.length; i < len; i++) {
			bootstrapMethods[i] = new BootstrapMethod(bytes, offset + 8 + length);
			length += bootstrapMethods[i].getByteLength();
		}
		return bootstrapMethods;
	}
}
