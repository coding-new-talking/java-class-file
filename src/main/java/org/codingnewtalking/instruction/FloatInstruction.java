package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class FloatInstruction {
	
	public static class f2d extends Instruction {
		
		public f2d(U1[] codes, int offset) {
			super(Mnemonic.f2d, Opcode.f2d, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class f2i extends Instruction {
		
		public f2i(U1[] codes, int offset) {
			super(Mnemonic.f2i, Opcode.f2i, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class f2l extends Instruction {
		
		public f2l(U1[] codes, int offset) {
			super(Mnemonic.f2l, Opcode.f2l, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fadd extends Instruction {
		
		public fadd(U1[] codes, int offset) {
			super(Mnemonic.fadd, Opcode.fadd, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fcmpg extends Instruction {
		
		public fcmpg(U1[] codes, int offset) {
			super(Mnemonic.fcmpg, Opcode.fcmpg, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fcmpl extends Instruction {
		
		public fcmpl(U1[] codes, int offset) {
			super(Mnemonic.fcmpl, Opcode.fcmpl, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fconst_0 extends Instruction {
		
		public fconst_0(U1[] codes, int offset) {
			super(Mnemonic.fconst_0, Opcode.fconst_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fconst_1 extends Instruction {
		
		public fconst_1(U1[] codes, int offset) {
			super(Mnemonic.fconst_1, Opcode.fconst_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fconst_2 extends Instruction {
		
		public fconst_2(U1[] codes, int offset) {
			super(Mnemonic.fconst_2, Opcode.fconst_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fdiv extends Instruction {
		
		public fdiv(U1[] codes, int offset) {
			super(Mnemonic.fdiv, Opcode.fdiv, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fload extends Instruction {
		
		public fload(U1[] codes, int offset) {
			super(Mnemonic.fload, Opcode.fload, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
		
		public int getIndex() {
			return codes[offset + 1].getValue();
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 本地变量表的索引，一个字节的无符号数";
		}
	}
	
	public static class fload_0 extends Instruction {
		
		public fload_0(U1[] codes, int offset) {
			super(Mnemonic.fload_0, Opcode.fload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fload_1 extends Instruction {
		
		public fload_1(U1[] codes, int offset) {
			super(Mnemonic.fload_1, Opcode.fload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fload_2 extends Instruction {
		
		public fload_2(U1[] codes, int offset) {
			super(Mnemonic.fload_2, Opcode.fload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fload_3 extends Instruction {
		
		public fload_3(U1[] codes, int offset) {
			super(Mnemonic.fload_3, Opcode.fload_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fmul extends Instruction {
		
		public fmul(U1[] codes, int offset) {
			super(Mnemonic.fmul, Opcode.fmul, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fneg extends Instruction {
		
		public fneg(U1[] codes, int offset) {
			super(Mnemonic.fneg, Opcode.fneg, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class frem extends Instruction {
		
		public frem(U1[] codes, int offset) {
			super(Mnemonic.frem, Opcode.frem, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class freturn extends Instruction {
		
		public freturn(U1[] codes, int offset) {
			super(Mnemonic.freturn, Opcode.freturn, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fstore extends Instruction {
		
		public fstore(U1[] codes, int offset) {
			super(Mnemonic.fstore, Opcode.fstore, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
		
		public int getIndex() {
			return codes[offset + 1].getValue();
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 本地变量表的索引，一个字节的无符号数";
		}
	}
	
	public static class fstore_0 extends Instruction {
		
		public fstore_0(U1[] codes, int offset) {
			super(Mnemonic.fstore_0, Opcode.fstore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fstore_1 extends Instruction {
		
		public fstore_1(U1[] codes, int offset) {
			super(Mnemonic.fstore_1, Opcode.fstore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fstore_2 extends Instruction {
		
		public fstore_2(U1[] codes, int offset) {
			super(Mnemonic.fstore_2, Opcode.fstore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fstore_3 extends Instruction {
		
		public fstore_3(U1[] codes, int offset) {
			super(Mnemonic.fstore_3, Opcode.fstore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class fsub extends Instruction {
		
		public fsub(U1[] codes, int offset) {
			super(Mnemonic.fsub, Opcode.fsub, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
