package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class DoubleInstruction {
	
	public static class d2f extends Instruction {
		
		public d2f(U1[] codes, int offset) {
			super(Mnemonic.d2f, Opcode.d2f, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class d2i extends Instruction {
		
		public d2i(U1[] codes, int offset) {
			super(Mnemonic.d2i, Opcode.d2i, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class d2l extends Instruction {
		
		public d2l(U1[] codes, int offset) {
			super(Mnemonic.d2l, Opcode.d2l, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dadd extends Instruction {
		
		public dadd(U1[] codes, int offset) {
			super(Mnemonic.dadd, Opcode.dadd, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dcmpg extends Instruction {
		
		public dcmpg(U1[] codes, int offset) {
			super(Mnemonic.dcmpg, Opcode.dcmpg, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dcmpl extends Instruction {
		
		public dcmpl(U1[] codes, int offset) {
			super(Mnemonic.dcmpl, Opcode.dcmpl, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dconst_0 extends Instruction {
		
		public dconst_0(U1[] codes, int offset) {
			super(Mnemonic.dconst_0, Opcode.dconst_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dconst_1 extends Instruction {
		
		public dconst_1(U1[] codes, int offset) {
			super(Mnemonic.dconst_1, Opcode.dconst_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ddiv extends Instruction {
		
		public ddiv(U1[] codes, int offset) {
			super(Mnemonic.ddiv, Opcode.ddiv, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dload extends Instruction {
		
		public dload(U1[] codes, int offset) {
			super(Mnemonic.dload, Opcode.dload, codes, offset, 1, 0);
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
			//该索引及其下一个索引共同对应一个double值
			//即double值占两个连续的索引，但读写时却只使用第一个索引
			//long值也是这样的，可能这是历史遗留问题
		}
	}
	
	public static class dload_0 extends Instruction {
		
		public dload_0(U1[] codes, int offset) {
			super(Mnemonic.dload_0, Opcode.dload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dload_1 extends Instruction {
		
		public dload_1(U1[] codes, int offset) {
			super(Mnemonic.dload_1, Opcode.dload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dload_2 extends Instruction {
		
		public dload_2(U1[] codes, int offset) {
			super(Mnemonic.dload_2, Opcode.dload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dload_3 extends Instruction {
		
		public dload_3(U1[] codes, int offset) {
			super(Mnemonic.dload_3, Opcode.dload_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dmul extends Instruction {
		
		public dmul(U1[] codes, int offset) {
			super(Mnemonic.dmul, Opcode.dmul, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dneg extends Instruction {
		
		public dneg(U1[] codes, int offset) {
			super(Mnemonic.dneg, Opcode.dneg, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class drem extends Instruction {
		
		public drem(U1[] codes, int offset) {
			super(Mnemonic.drem, Opcode.drem, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dreturn extends Instruction {
		
		public dreturn(U1[] codes, int offset) {
			super(Mnemonic.dreturn, Opcode.dreturn, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dstore extends Instruction {
		
		public dstore(U1[] codes, int offset) {
			super(Mnemonic.dstore, Opcode.dstore, codes, offset, 1, 1);
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
	
	public static class dstore_0 extends Instruction {
		
		public dstore_0(U1[] codes, int offset) {
			super(Mnemonic.dstore_0, Opcode.dstore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dstore_1 extends Instruction {
		
		public dstore_1(U1[] codes, int offset) {
			super(Mnemonic.dstore_1, Opcode.dstore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dstore_2 extends Instruction {
		
		public dstore_2(U1[] codes, int offset) {
			super(Mnemonic.dstore_2, Opcode.dstore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dstore_3 extends Instruction {
		
		public dstore_3(U1[] codes, int offset) {
			super(Mnemonic.dstore_3, Opcode.dstore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class dsub extends Instruction {
		
		public dsub(U1[] codes, int offset) {
			super(Mnemonic.dsub, Opcode.dsub, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
