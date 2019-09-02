package org.codingnewtalking.classfile.attribute.util;

import org.codingnewtalking.classfile.util.Index2;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class BootstrapMethod {
	
	private byte[] bytes;
	private int offset;
	
	private Index2 bootstrapMethodRef;
	private Num2 numBootstrapArguments;
	private Index2[] bootstrapArguments;
	
	public BootstrapMethod(byte[] bytes, int offset) {
		this.bytes = bytes;
		this.offset = offset;
	}

	public int getByteOffset() {
		return offset;
	}

	public int getByteLength() {
		return 2 + 2 + getNumBootstrapArguments() * 2;
	}
	

	public int getBootstrapMethodRef() {
		if (bootstrapMethodRef == null) {
			bootstrapMethodRef = new Index2(bytes, offset);
		}
		return bootstrapMethodRef.getIndex();
	}

	public int getNumBootstrapArguments() {
		if (numBootstrapArguments == null) {
			numBootstrapArguments = new Num2(bytes, offset + 2);
		}
		return numBootstrapArguments.getNum();
	}

	public int[] getBootstrapArguments() {
		if (bootstrapArguments == null) {
			bootstrapArguments = new Index2[getNumBootstrapArguments()];
			for (int i = 0, len = bootstrapArguments.length; i < len; i++) {
				bootstrapArguments[i] = new Index2(bytes, offset + 4 + i * 2);
			}
		}
		int[] argsIndexes = new int[bootstrapArguments.length];
		for (int i = 0, len = bootstrapArguments.length; i < len; i++) {
			argsIndexes[i] = bootstrapArguments[i].getIndex();
		}
		return argsIndexes;
	}
}