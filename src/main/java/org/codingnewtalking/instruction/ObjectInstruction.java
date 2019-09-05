package org.codingnewtalking.instruction;

import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.ByteUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class ObjectInstruction {
	
	public static class aconst_null extends Instruction {

		public aconst_null(U1[] codes, int offset) {
			super(Mnemonic.aconst_null, Opcode.aconst_null, codes, offset, 0, 0);
		}

		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload extends Instruction {
		
		public aload(U1[] codes, int offset) {
			super(Mnemonic.aload, Opcode.aload, codes, offset, 1, 0);
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
	
	public static class aload_0 extends Instruction {
		
		public aload_0(U1[] codes, int offset) {
			super(Mnemonic.aload_0, Opcode.aload_0, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_1 extends Instruction {
		
		public aload_1(U1[] codes, int offset) {
			super(Mnemonic.aload_1, Opcode.aload_1, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_2 extends Instruction {
		
		public aload_2(U1[] codes, int offset) {
			super(Mnemonic.aload_2, Opcode.aload_2, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class aload_3 extends Instruction {
		
		public aload_3(U1[] codes, int offset) {
			super(Mnemonic.aload_3, Opcode.aload_3, codes, offset, 0, 0);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class areturn extends Instruction {
		
		public areturn(U1[] codes, int offset) {
			super(Mnemonic.areturn, Opcode.areturn, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore extends Instruction {
		
		public astore(U1[] codes, int offset) {
			super(Mnemonic.astore, Opcode.astore, codes, offset, 1, 1);
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
	
	public static class astore_0 extends Instruction {
		
		public astore_0(U1[] codes, int offset) {
			super(Mnemonic.astore_0, Opcode.astore_0, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_1 extends Instruction {
		
		public astore_1(U1[] codes, int offset) {
			super(Mnemonic.astore_1, Opcode.astore_1, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_2 extends Instruction {
		
		public astore_2(U1[] codes, int offset) {
			super(Mnemonic.astore_2, Opcode.astore_2, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class astore_3 extends Instruction {
		
		public astore_3(U1[] codes, int offset) {
			super(Mnemonic.astore_3, Opcode.astore_3, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class athrow extends Instruction {
		
		public athrow(U1[] codes, int offset) {
			super(Mnemonic.athrow, Opcode.athrow, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class checkcast extends Instruction {
		
		public checkcast(U1[] codes, int offset) {
			super(Mnemonic.checkcast, Opcode.checkcast, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个引用类型";
		}
	}
	
	public static class getfield extends Instruction {
		
		public getfield(U1[] codes, int offset) {
			super(Mnemonic.getfield, Opcode.getfield, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个字段类型";
		}
	}
	
	public static class getstatic extends Instruction {
		
		public getstatic(U1[] codes, int offset) {
			super(Mnemonic.getstatic, Opcode.getstatic, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个字段类型";
		}
	}
	
	public static class if_acmpeq extends Instruction {
		
		public if_acmpeq(U1[] codes, int offset) {
			super(Mnemonic.if_acmpeq, Opcode.if_acmpeq, codes, offset, 1, 2);
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
	
	public static class if_acmpne extends Instruction {
		
		public if_acmpne(U1[] codes, int offset) {
			super(Mnemonic.if_acmpne, Opcode.if_acmpne, codes, offset, 1, 2);
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
	
	public static class ifnonnull extends Instruction {
		
		public ifnonnull(U1[] codes, int offset) {
			super(Mnemonic.ifnonnull, Opcode.ifnonnull, codes, offset, 1, 1);
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
	
	public static class ifnull extends Instruction {
		
		public ifnull(U1[] codes, int offset) {
			super(Mnemonic.ifnull, Opcode.ifnull, codes, offset, 1, 1);
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
	
	public static class _instanceof extends Instruction {
		
		public _instanceof(U1[] codes, int offset) {
			super(Mnemonic._instanceof, Opcode._instanceof, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个引用类型";
		}
	}
	
	public static class invokedynamic extends Instruction {
		
		public invokedynamic(U1[] codes, int offset) {
			super(Mnemonic.invokedynamic, Opcode.invokedynamic, codes, offset, 1, -1);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个方法句柄类型";
		}
	}
	
	public static class invokeinterface extends Instruction {
		
		public invokeinterface(U1[] codes, int offset) {
			super(Mnemonic.invokeinterface, Opcode.invokeinterface, codes, offset, 2, -1);
		}
		
		@Override
		public int getLength() {
			return 5;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个接口方法类型";
		}
	}
	
	public static class invokespecial extends Instruction {
		
		public invokespecial(U1[] codes, int offset) {
			super(Mnemonic.invokespecial, Opcode.invokespecial, codes, offset, 1, -1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个方法或接口方法类型";
		}
	}
	
	public static class invokestatic extends Instruction {
		
		public invokestatic(U1[] codes, int offset) {
			super(Mnemonic.invokestatic, Opcode.invokestatic, codes, offset, 1, -1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个方法或接口方法类型";
		}
	}
	
	public static class invokevirtual extends Instruction {
		
		public invokevirtual(U1[] codes, int offset) {
			super(Mnemonic.invokevirtual, Opcode.invokevirtual, codes, offset, 1, -1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个方法类型";
		}
	}
	
	public static class monitorenter extends Instruction {
		
		public monitorenter(U1[] codes, int offset) {
			super(Mnemonic.monitorenter, Opcode.monitorenter, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class monitorexit extends Instruction {
		
		public monitorexit(U1[] codes, int offset) {
			super(Mnemonic.monitorexit, Opcode.monitorexit, codes, offset, 0, 1);
		}
		
		@Override
		public int getLength() {
			return 1;
		}
	}
	
	public static class _new extends Instruction {
		
		public _new(U1[] codes, int offset) {
			super(Mnemonic._new, Opcode._new, codes, offset, 1, 0);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个类或接口类型，最终会产生一个类类型";
			//new指令并不能完整的创建一个新实例，必须要等到实例的初始化方法执行完成后，实例的创建才算完整
		}
	}
	
	public static class putfield extends Instruction {
		
		public putfield(U1[] codes, int offset) {
			super(Mnemonic.putfield, Opcode.putfield, codes, offset, 1, 2);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个字段类型";
		}
	}
	
	public static class putstatic extends Instruction {
		
		public putstatic(U1[] codes, int offset) {
			super(Mnemonic.putstatic, Opcode.putstatic, codes, offset, 1, 1);
		}
		
		@Override
		public int getLength() {
			return 3;
		}
		
		public int getIndex() {
			return ByteUtils.toUnsigned(codes[offset + 1].getByte(), codes[offset + 2].getByte());
		}
		
		@Override
		protected String embeddedOperandsToString() {
			return "#" + getIndex() + "	// 常量池中的索引，表示一个字段类型";
		}
	}
}
