package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class LongInstruction {
	
	public static class l2d extends Instruction {
		
		public l2d(U1[] codes, int offset) {
			super(Mnemonic.l2d, Opcode.l2d, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class l2f extends Instruction {
		
		public l2f(U1[] codes, int offset) {
			super(Mnemonic.l2f, Opcode.l2f, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class l2i extends Instruction {
		
		public l2i(U1[] codes, int offset) {
			super(Mnemonic.l2i, Opcode.l2i, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ladd extends Instruction {
		
		public ladd(U1[] codes, int offset) {
			super(Mnemonic.ladd, Opcode.ladd, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class land extends Instruction {
		
		public land(U1[] codes, int offset) {
			super(Mnemonic.land, Opcode.land, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lcmp extends Instruction {
		
		public lcmp(U1[] codes, int offset) {
			super(Mnemonic.lcmp, Opcode.lcmp, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lconst_0 extends Instruction {
		
		public lconst_0(U1[] codes, int offset) {
			super(Mnemonic.lconst_0, Opcode.lconst_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lconst_1 extends Instruction {
		
		public lconst_1(U1[] codes, int offset) {
			super(Mnemonic.lconst_1, Opcode.lconst_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ldiv extends Instruction {
		
		public ldiv(U1[] codes, int offset) {
			super(Mnemonic.ldiv, Opcode.ldiv, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload extends Instruction {
		
		public lload(U1[] codes, int offset) {
			super(Mnemonic.lload, Opcode.lload, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class lload_0 extends Instruction {
		
		public lload_0(U1[] codes, int offset) {
			super(Mnemonic.lload_0, Opcode.lload_0, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_1 extends Instruction {
		
		public lload_1(U1[] codes, int offset) {
			super(Mnemonic.lload_1, Opcode.lload_1, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_2 extends Instruction {
		
		public lload_2(U1[] codes, int offset) {
			super(Mnemonic.lload_2, Opcode.lload_2, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_3 extends Instruction {
		
		public lload_3(U1[] codes, int offset) {
			super(Mnemonic.lload_3, Opcode.lload_3, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lmul extends Instruction {
		
		public lmul(U1[] codes, int offset) {
			super(Mnemonic.lmul, Opcode.lmul, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lneg extends Instruction {
		
		public lneg(U1[] codes, int offset) {
			super(Mnemonic.lneg, Opcode.lneg, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lor extends Instruction {
		
		public lor(U1[] codes, int offset) {
			super(Mnemonic.lor, Opcode.lor, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lrem extends Instruction {
		
		public lrem(U1[] codes, int offset) {
			super(Mnemonic.lrem, Opcode.lrem, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lreturn extends Instruction {
		
		public lreturn(U1[] codes, int offset) {
			super(Mnemonic.lreturn, Opcode.lreturn, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ishl extends Instruction {
		
		public ishl(U1[] codes, int offset) {
			super(Mnemonic.ishl, Opcode.ishl, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ishr extends Instruction {
		
		public ishr(U1[] codes, int offset) {
			super(Mnemonic.ishr, Opcode.ishr, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class istore extends Instruction {
		
		public istore(U1[] codes, int offset) {
			super(Mnemonic.istore, Opcode.istore, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 2;
		}
	}
	
	public static class istore_0 extends Instruction {
		
		public istore_0(U1[] codes, int offset) {
			super(Mnemonic.istore_0, Opcode.istore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class istore_1 extends Instruction {
		
		public istore_1(U1[] codes, int offset) {
			super(Mnemonic.istore_1, Opcode.istore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class istore_2 extends Instruction {
		
		public istore_2(U1[] codes, int offset) {
			super(Mnemonic.istore_2, Opcode.istore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class istore_3 extends Instruction {
		
		public istore_3(U1[] codes, int offset) {
			super(Mnemonic.istore_3, Opcode.istore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class isub extends Instruction {
		
		public isub(U1[] codes, int offset) {
			super(Mnemonic.isub, Opcode.isub, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iushr extends Instruction {
		
		public iushr(U1[] codes, int offset) {
			super(Mnemonic.iushr, Opcode.iushr, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ixor extends Instruction {
		
		public ixor(U1[] codes, int offset) {
			super(Mnemonic.ixor, Opcode.ixor, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
