package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ByteUtils;

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
	
	public static class if_icmpeq extends Instruction {
		
		public if_icmpeq(U1[] codes, int offset) {
			super(Mnemonic.if_icmpeq, Opcode.if_icmpeq, codes, offset, 1, 2);
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
	
	public static class if_icmpne extends Instruction {
		
		public if_icmpne(U1[] codes, int offset) {
			super(Mnemonic.if_icmpne, Opcode.if_icmpne, codes, offset, 1, 2);
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
	
	public static class if_icmplt extends Instruction {
		
		public if_icmplt(U1[] codes, int offset) {
			super(Mnemonic.if_icmplt, Opcode.if_icmplt, codes, offset, 1, 2);
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
	
	public static class if_icmpge extends Instruction {
		
		public if_icmpge(U1[] codes, int offset) {
			super(Mnemonic.if_icmpge, Opcode.if_icmpge, codes, offset, 1, 2);
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
	
	public static class if_icmpgt extends Instruction {
		
		public if_icmpgt(U1[] codes, int offset) {
			super(Mnemonic.if_icmpgt, Opcode.if_icmpgt, codes, offset, 1, 2);
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
	
	public static class if_icmple extends Instruction {
		
		public if_icmple(U1[] codes, int offset) {
			super(Mnemonic.if_icmple, Opcode.if_icmple, codes, offset, 1, 2);
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
	
	public static class ifeq extends Instruction {
		
		public ifeq(U1[] codes, int offset) {
			super(Mnemonic.ifeq, Opcode.ifeq, codes, offset, 1, 1);
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
	
	public static class ifne extends Instruction {
		
		public ifne(U1[] codes, int offset) {
			super(Mnemonic.ifne, Opcode.ifne, codes, offset, 1, 1);
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
	
	public static class iflt extends Instruction {
		
		public iflt(U1[] codes, int offset) {
			super(Mnemonic.iflt, Opcode.iflt, codes, offset, 1, 1);
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
	
	public static class ifge extends Instruction {
		
		public ifge(U1[] codes, int offset) {
			super(Mnemonic.ifge, Opcode.ifge, codes, offset, 1, 1);
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
	
	public static class ifgt extends Instruction {
		
		public ifgt(U1[] codes, int offset) {
			super(Mnemonic.ifgt, Opcode.ifgt, codes, offset, 1, 1);
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
	
	public static class ifle extends Instruction {
		
		public ifle(U1[] codes, int offset) {
			super(Mnemonic.ifle, Opcode.ifle, codes, offset, 1, 1);
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
	
	public static class iinc extends Instruction {
		
		public iinc(U1[] codes, int offset) {
			super(Mnemonic.iinc, Opcode.iinc, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return codes[offset + 1].getValue();
		}
		
		public int getImmediateValue() {
			return ByteUtils.toSigned(codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + " " + getImmediateValue() + "	// 本地变量表索引，一个字节的无符号数；int类型数值增量，一个字节的有符号数";
		}
	}
	
	public static class iload extends Instruction {
		
		public iload(U1[] codes, int offset) {
			super(Mnemonic.iload, Opcode.iload, codes, offset, 1, 0);
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
	
	public static class iload_0 extends Instruction {
		
		public iload_0(U1[] codes, int offset) {
			super(Mnemonic.iload_0, Opcode.iload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iload_1 extends Instruction {
		
		public iload_1(U1[] codes, int offset) {
			super(Mnemonic.iload_1, Opcode.iload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iload_2 extends Instruction {
		
		public iload_2(U1[] codes, int offset) {
			super(Mnemonic.iload_2, Opcode.iload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class iload_3 extends Instruction {
		
		public iload_3(U1[] codes, int offset) {
			super(Mnemonic.iload_3, Opcode.iload_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class imul extends Instruction {
		
		public imul(U1[] codes, int offset) {
			super(Mnemonic.imul, Opcode.imul, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ineg extends Instruction {
		
		public ineg(U1[] codes, int offset) {
			super(Mnemonic.ineg, Opcode.ineg, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ior extends Instruction {
		
		public ior(U1[] codes, int offset) {
			super(Mnemonic.ior, Opcode.ior, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class irem extends Instruction {
		
		public irem(U1[] codes, int offset) {
			super(Mnemonic.irem, Opcode.irem, codes, offset, 0, 2);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class ireturn extends Instruction {
		
		public ireturn(U1[] codes, int offset) {
			super(Mnemonic.ireturn, Opcode.ireturn, codes, offset, 0, 1);
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
		
		public int getIndex() {
			return codes[offset + 1].getValue();
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 本地变量表的索引，一个字节的无符号数";
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
