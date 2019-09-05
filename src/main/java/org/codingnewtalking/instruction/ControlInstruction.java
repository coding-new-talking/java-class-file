package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ControlInstruction {
	
	public static class _goto extends Instruction {
		
		public _goto(U1[] codes, int offset) {
			super(Mnemonic._goto, Opcode._goto, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getBranchoffset() {
			return ByteUtils.toSigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getBranchoffset() + "	// 相对于本条指令的偏移量，是两个字节的有符号数";
		}
	}
	
	public static class goto_w extends Instruction {
		
		public goto_w(U1[] codes, int offset) {
			super(Mnemonic.goto_w, Opcode.goto_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
		
		public int getBranchoffset() {
			return ByteUtils.toSigned(codes[offset + 1].getByte(), codes[offset + 2].getByte(),
					codes[offset + 3].getByte(), codes[offset + 4].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getBranchoffset() + "	// 相对于本条指令的偏移量，是四个字节的有符号数";
		}
	}
	
	public static class jsr extends Instruction {
		
		public jsr(U1[] codes, int offset) {
			super(Mnemonic.jsr, Opcode.jsr, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getBranchoffset() {
			return ByteUtils.toSigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getBranchoffset() + "	// 相对于本条指令的偏移量，是两个字节的有符号数";
		}
	}
	
	public static class jsr_w extends Instruction {
		
		public jsr_w(U1[] codes, int offset) {
			super(Mnemonic.jsr_w, Opcode.jsr_w, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
		
		public int getBranchoffset() {
			return ByteUtils.toSigned(codes[offset + 1].getByte(), codes[offset + 2].getByte(),
					codes[offset + 3].getByte(), codes[offset + 4].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return getBranchoffset() + "	// 相对于本条指令的偏移量，是四个字节的有符号数";
		}
	}
	
	public static class lookupswitch extends Instruction {
		
		public lookupswitch(U1[] codes, int offset) {
			super(Mnemonic.lookupswitch, Opcode.lookupswitch, codes, offset, -1, 1);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
	}
	
	public static class ret extends Instruction {
		
		public ret(U1[] codes, int offset) {
			super(Mnemonic.ret, Opcode.ret, codes, offset, 1, 0);
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
			return "#" + getIndex() + "	// 本地变量表的索引，一个字节的无符号数，索引处的内容必须是returnAddress类型";
		}
	}
	
	public static class _return extends Instruction {
		
		public _return(U1[] codes, int offset) {
			super(Mnemonic._return, Opcode._return, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class tableswitch extends Instruction {
		
		public tableswitch(U1[] codes, int offset) {
			super(Mnemonic.tableswitch, Opcode.tableswitch, codes, offset, -1, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
}
