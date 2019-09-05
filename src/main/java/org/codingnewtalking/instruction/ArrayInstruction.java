package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ArrayInstruction {

	public static class aaload extends Instruction {

		public aaload(U1[] codes, int offset) {
			super(Mnemonic.aaload, Opcode.aaload, codes, offset, 0, 2);
		}

		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aastore extends Instruction {
		
		public aastore(U1[] codes, int offset) {
			super(Mnemonic.aastore, Opcode.aastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class anewarray extends Instruction {
		
		public anewarray(U1[] codes, int offset) {
			super(Mnemonic.anewarray, Opcode.anewarray, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getComponentTypeIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getComponentTypeIndex() + "	// 常量池中的索引，表示数组的元素类型";
		}
	}
	
	public static class arraylength extends Instruction {
		
		public arraylength(U1[] codes, int offset) {
			super(Mnemonic.arraylength, Opcode.arraylength, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class baload extends Instruction {
		
		public baload(U1[] codes, int offset) {
			super(Mnemonic.baload, Opcode.baload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class bastore extends Instruction {
		
		public bastore(U1[] codes, int offset) {
			super(Mnemonic.bastore, Opcode.bastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class caload extends Instruction {
		
		public caload(U1[] codes, int offset) {
			super(Mnemonic.caload, Opcode.caload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class castore extends Instruction {
		
		public castore(U1[] codes, int offset) {
			super(Mnemonic.castore, Opcode.castore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class daload extends Instruction {
		
		public daload(U1[] codes, int offset) {
			super(Mnemonic.daload, Opcode.daload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dastore extends Instruction {
		
		public dastore(U1[] codes, int offset) {
			super(Mnemonic.dastore, Opcode.dastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class faload extends Instruction {
		
		public faload(U1[] codes, int offset) {
			super(Mnemonic.faload, Opcode.faload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fastore extends Instruction {
		
		public fastore(U1[] codes, int offset) {
			super(Mnemonic.fastore, Opcode.fastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iaload extends Instruction {
		
		public iaload(U1[] codes, int offset) {
			super(Mnemonic.iaload, Opcode.iaload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iastore extends Instruction {
		
		public iastore(U1[] codes, int offset) {
			super(Mnemonic.iastore, Opcode.iastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class laload extends Instruction {
		
		public laload(U1[] codes, int offset) {
			super(Mnemonic.laload, Opcode.laload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lastore extends Instruction {
		
		public lastore(U1[] codes, int offset) {
			super(Mnemonic.lastore, Opcode.lastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class multianewarray extends Instruction {
		
		public multianewarray(U1[] codes, int offset) {
			super(Mnemonic.multianewarray, Opcode.multianewarray, codes, offset, 2, -1);
		}
		
		@Override
		public int getLength() {
			return 4;
		}
		
		public int getComponentTypeIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		public int getDimensions() {
			return codes[offset + 3].getValue();
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getComponentTypeIndex() + " " + getDimensions() + "	// 常量池中的索引，表示数组的元素类型；数组的维度";
		}
	}
	
	public static class newarray extends Instruction {
		
		public newarray(U1[] codes, int offset) {
			super(Mnemonic.newarray, Opcode.newarray, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
		
		public int getComponentType() {
			return codes[offset + 1].getValue();
		}
		
		public String getComponentTypeString() {
			int componentType = getComponentType();
			switch (componentType) {
				case 4:
					return "boolean";
				case 5:
					return "char";
				case 6:
					return "float";
				case 7:
					return "double";
				case 8:
					return "byte";
				case 9:
					return "short";
				case 10:
					return "int";
				case 11:
					return "long";
			}
			throw new IllegalArgumentException("illegal component type '" + componentType + "'.");
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getComponentType() + "	// " + getComponentTypeString() + "，数组的元素类型";
		}
	}
	
	public static class saload extends Instruction {
		
		public saload(U1[] codes, int offset) {
			super(Mnemonic.saload, Opcode.saload, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class sastore extends Instruction {
		
		public sastore(U1[] codes, int offset) {
			super(Mnemonic.sastore, Opcode.sastore, codes, offset, 0, 3);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
