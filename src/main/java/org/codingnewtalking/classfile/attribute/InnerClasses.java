package org.codingnewtalking.classfile.attribute;

import java.util.Arrays;

import org.codingnewtalking.classfile.ConstantPool;
import org.codingnewtalking.classfile.attribute.util.Classes;
import org.codingnewtalking.classfile.util.Num2;

/**
 * @author lixinjie
 * @since 2019-07-19
 */
public class InnerClasses extends AttributeInfo {
	
	private Num2 numberOfClasses;
	private Classes[] classes;
	
	public InnerClasses(byte[] bytes, int offset, ConstantPool constantPool) {
		super(bytes, offset, constantPool);
	}

	public int getNumberOfClasses() {
		if (numberOfClasses == null) {
			numberOfClasses = new Num2(bytes, offset + 6);
		}
		return numberOfClasses.getNum();
	}

	public Classes[] getClasses() {
		if (classes == null) {
			classes = new Classes[numberOfClasses.getNum()];
			for (int i = 0, len = classes.length; i < len; i++) {
				classes[i] = new Classes(bytes, offset + 8 + i * 8);
			}
		}
		return classes;
	}

	@Override
	public String toString() {
		return "InnerClasses [getNumberOfClasses()=" + getNumberOfClasses() + ", getClasses()="
				+ Arrays.toString(getClasses()) + "]";
	}
}
