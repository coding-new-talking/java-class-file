package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class IntInstruction {
	
	public static class i2b extends Instruction {
		
		public i2b(U1[] codes, int offset) {
			super(Mnemonic.i2b, Opcode.i2b, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class i2c extends Instruction {
		
		public i2c(U1[] codes, int offset) {
			super(Mnemonic.i2c, Opcode.i2c, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class i2d extends Instruction {
		
		public i2d(U1[] codes, int offset) {
			super(Mnemonic.i2d, Opcode.i2d, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class i2f extends Instruction {
		
		public i2f(U1[] codes, int offset) {
			super(Mnemonic.i2f, Opcode.i2f, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class i2l extends Instruction {
		
		public i2l(U1[] codes, int offset) {
			super(Mnemonic.i2l, Opcode.i2l, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class i2s extends Instruction {
		
		public i2s(U1[] codes, int offset) {
			super(Mnemonic.i2s, Opcode.i2s, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class iadd extends Instruction {
		
		public iadd(U1[] codes, int offset) {
			super(Mnemonic.iadd, Opcode.iadd, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class iand extends Instruction {
		
		public iand(U1[] codes, int offset) {
			super(Mnemonic.iand, Opcode.iand, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_m1 extends Instruction {
		
		public iconst_m1(U1[] codes, int offset) {
			super(Mnemonic.iconst_m1, Opcode.iconst_m1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_0 extends Instruction {
		
		public iconst_0(U1[] codes, int offset) {
			super(Mnemonic.iconst_0, Opcode.iconst_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_1 extends Instruction {
		
		public iconst_1(U1[] codes, int offset) {
			super(Mnemonic.iconst_1, Opcode.iconst_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_2 extends Instruction {
		
		public iconst_2(U1[] codes, int offset) {
			super(Mnemonic.iconst_2, Opcode.iconst_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_3 extends Instruction {
		
		public iconst_3(U1[] codes, int offset) {
			super(Mnemonic.iconst_3, Opcode.iconst_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_4 extends Instruction {
		
		public iconst_4(U1[] codes, int offset) {
			super(Mnemonic.iconst_4, Opcode.iconst_4, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iconst_5 extends Instruction {
		
		public iconst_5(U1[] codes, int offset) {
			super(Mnemonic.iconst_5, Opcode.iconst_5, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class idiv extends Instruction {
		
		public idiv(U1[] codes, int offset) {
			super(Mnemonic.idiv, Opcode.idiv, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
