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
		
		public int getIndex() {
			return codes[offset + 1].getValue();
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 本地变量表的索引，一个字节的无符号数";
			//该索引及其下一个索引共同对应一个long值
			//即long值占两个连续的索引，但读写时却只使用第一个索引
			//double值也是这样的，可能这是历史遗留问题
		}
	}
	
	public static class lload_0 extends Instruction {
		
		public lload_0(U1[] codes, int offset) {
			super(Mnemonic.lload_0, Opcode.lload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_1 extends Instruction {
		
		public lload_1(U1[] codes, int offset) {
			super(Mnemonic.lload_1, Opcode.lload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_2 extends Instruction {
		
		public lload_2(U1[] codes, int offset) {
			super(Mnemonic.lload_2, Opcode.lload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lload_3 extends Instruction {
		
		public lload_3(U1[] codes, int offset) {
			super(Mnemonic.lload_3, Opcode.lload_3, codes, offset, 0, 0);
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
	
	public static class lshl extends Instruction {
		
		public lshl(U1[] codes, int offset) {
			super(Mnemonic.lshl, Opcode.lshl, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lshr extends Instruction {
		
		public lshr(U1[] codes, int offset) {
			super(Mnemonic.lshr, Opcode.lshr, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lstore extends Instruction {
		
		public lstore(U1[] codes, int offset) {
			super(Mnemonic.lstore, Opcode.lstore, codes, offset, 1, 1);
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
	
	public static class lstore_0 extends Instruction {
		
		public lstore_0(U1[] codes, int offset) {
			super(Mnemonic.lstore_0, Opcode.lstore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lstore_1 extends Instruction {
		
		public lstore_1(U1[] codes, int offset) {
			super(Mnemonic.lstore_1, Opcode.lstore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lstore_2 extends Instruction {
		
		public lstore_2(U1[] codes, int offset) {
			super(Mnemonic.lstore_2, Opcode.lstore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lstore_3 extends Instruction {
		
		public lstore_3(U1[] codes, int offset) {
			super(Mnemonic.lstore_3, Opcode.lstore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lsub extends Instruction {
		
		public lsub(U1[] codes, int offset) {
			super(Mnemonic.lsub, Opcode.lsub, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lushr extends Instruction {
		
		public lushr(U1[] codes, int offset) {
			super(Mnemonic.lushr, Opcode.lushr, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class lxor extends Instruction {
		
		public lxor(U1[] codes, int offset) {
			super(Mnemonic.lxor, Opcode.lxor, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
