package org.codingnewtalking.instruction;

import java.util.ArrayList;
import java.util.List;

import org.codingnewtalking.instruction.ArrayInstruction.aaload;
import org.codingnewtalking.instruction.ArrayInstruction.aastore;
import org.codingnewtalking.instruction.ArrayInstruction.anewarray;
import org.codingnewtalking.instruction.ArrayInstruction.arraylength;
import org.codingnewtalking.instruction.ArrayInstruction.baload;
import org.codingnewtalking.instruction.ArrayInstruction.bastore;
import org.codingnewtalking.instruction.ArrayInstruction.caload;
import org.codingnewtalking.instruction.ArrayInstruction.castore;
import org.codingnewtalking.instruction.ArrayInstruction.daload;
import org.codingnewtalking.instruction.ArrayInstruction.dastore;
import org.codingnewtalking.instruction.ArrayInstruction.faload;
import org.codingnewtalking.instruction.ArrayInstruction.fastore;
import org.codingnewtalking.instruction.ArrayInstruction.iaload;
import org.codingnewtalking.instruction.ArrayInstruction.iastore;
import org.codingnewtalking.instruction.ArrayInstruction.laload;
import org.codingnewtalking.instruction.ArrayInstruction.lastore;
import org.codingnewtalking.instruction.ArrayInstruction.multianewarray;
import org.codingnewtalking.instruction.ArrayInstruction.newarray;
import org.codingnewtalking.instruction.ArrayInstruction.saload;
import org.codingnewtalking.instruction.ArrayInstruction.sastore;
import org.codingnewtalking.instruction.ByteInstruction.bipush;
import org.codingnewtalking.instruction.ConstantInstruction.ldc;
import org.codingnewtalking.instruction.ConstantInstruction.ldc2_w;
import org.codingnewtalking.instruction.ConstantInstruction.ldc_w;
import org.codingnewtalking.instruction.ConstantInstruction.nop;
import org.codingnewtalking.instruction.ControlInstruction._goto;
import org.codingnewtalking.instruction.ControlInstruction._return;
import org.codingnewtalking.instruction.ControlInstruction.goto_w;
import org.codingnewtalking.instruction.ControlInstruction.jsr;
import org.codingnewtalking.instruction.ControlInstruction.jsr_w;
import org.codingnewtalking.instruction.ControlInstruction.lookupswitch;
import org.codingnewtalking.instruction.ControlInstruction.ret;
import org.codingnewtalking.instruction.ControlInstruction.tableswitch;
import org.codingnewtalking.instruction.DoubleInstruction.d2f;
import org.codingnewtalking.instruction.DoubleInstruction.d2i;
import org.codingnewtalking.instruction.DoubleInstruction.d2l;
import org.codingnewtalking.instruction.DoubleInstruction.dadd;
import org.codingnewtalking.instruction.DoubleInstruction.dcmpg;
import org.codingnewtalking.instruction.DoubleInstruction.dcmpl;
import org.codingnewtalking.instruction.DoubleInstruction.dconst_0;
import org.codingnewtalking.instruction.DoubleInstruction.dconst_1;
import org.codingnewtalking.instruction.DoubleInstruction.ddiv;
import org.codingnewtalking.instruction.DoubleInstruction.dload;
import org.codingnewtalking.instruction.DoubleInstruction.dload_0;
import org.codingnewtalking.instruction.DoubleInstruction.dload_1;
import org.codingnewtalking.instruction.DoubleInstruction.dload_2;
import org.codingnewtalking.instruction.DoubleInstruction.dload_3;
import org.codingnewtalking.instruction.DoubleInstruction.dmul;
import org.codingnewtalking.instruction.DoubleInstruction.dneg;
import org.codingnewtalking.instruction.DoubleInstruction.drem;
import org.codingnewtalking.instruction.DoubleInstruction.dreturn;
import org.codingnewtalking.instruction.DoubleInstruction.dstore;
import org.codingnewtalking.instruction.DoubleInstruction.dstore_0;
import org.codingnewtalking.instruction.DoubleInstruction.dstore_1;
import org.codingnewtalking.instruction.DoubleInstruction.dstore_2;
import org.codingnewtalking.instruction.DoubleInstruction.dstore_3;
import org.codingnewtalking.instruction.DoubleInstruction.dsub;
import org.codingnewtalking.instruction.ExtendedInstruction.wide;
import org.codingnewtalking.instruction.FloatInstruction.f2d;
import org.codingnewtalking.instruction.FloatInstruction.f2i;
import org.codingnewtalking.instruction.FloatInstruction.f2l;
import org.codingnewtalking.instruction.FloatInstruction.fadd;
import org.codingnewtalking.instruction.FloatInstruction.fcmpg;
import org.codingnewtalking.instruction.FloatInstruction.fcmpl;
import org.codingnewtalking.instruction.FloatInstruction.fconst_0;
import org.codingnewtalking.instruction.FloatInstruction.fconst_1;
import org.codingnewtalking.instruction.FloatInstruction.fconst_2;
import org.codingnewtalking.instruction.FloatInstruction.fdiv;
import org.codingnewtalking.instruction.FloatInstruction.fload;
import org.codingnewtalking.instruction.FloatInstruction.fload_0;
import org.codingnewtalking.instruction.FloatInstruction.fload_1;
import org.codingnewtalking.instruction.FloatInstruction.fload_2;
import org.codingnewtalking.instruction.FloatInstruction.fload_3;
import org.codingnewtalking.instruction.FloatInstruction.fmul;
import org.codingnewtalking.instruction.FloatInstruction.fneg;
import org.codingnewtalking.instruction.FloatInstruction.frem;
import org.codingnewtalking.instruction.FloatInstruction.freturn;
import org.codingnewtalking.instruction.FloatInstruction.fstore;
import org.codingnewtalking.instruction.FloatInstruction.fstore_0;
import org.codingnewtalking.instruction.FloatInstruction.fstore_1;
import org.codingnewtalking.instruction.FloatInstruction.fstore_2;
import org.codingnewtalking.instruction.FloatInstruction.fstore_3;
import org.codingnewtalking.instruction.FloatInstruction.fsub;
import org.codingnewtalking.instruction.IntInstruction.i2b;
import org.codingnewtalking.instruction.IntInstruction.i2c;
import org.codingnewtalking.instruction.IntInstruction.i2d;
import org.codingnewtalking.instruction.IntInstruction.i2f;
import org.codingnewtalking.instruction.IntInstruction.i2l;
import org.codingnewtalking.instruction.IntInstruction.i2s;
import org.codingnewtalking.instruction.IntInstruction.iadd;
import org.codingnewtalking.instruction.IntInstruction.iand;
import org.codingnewtalking.instruction.IntInstruction.iconst_0;
import org.codingnewtalking.instruction.IntInstruction.iconst_1;
import org.codingnewtalking.instruction.IntInstruction.iconst_2;
import org.codingnewtalking.instruction.IntInstruction.iconst_3;
import org.codingnewtalking.instruction.IntInstruction.iconst_4;
import org.codingnewtalking.instruction.IntInstruction.iconst_5;
import org.codingnewtalking.instruction.IntInstruction.iconst_m1;
import org.codingnewtalking.instruction.IntInstruction.idiv;
import org.codingnewtalking.instruction.IntInstruction.if_icmpeq;
import org.codingnewtalking.instruction.IntInstruction.if_icmpge;
import org.codingnewtalking.instruction.IntInstruction.if_icmpgt;
import org.codingnewtalking.instruction.IntInstruction.if_icmple;
import org.codingnewtalking.instruction.IntInstruction.if_icmplt;
import org.codingnewtalking.instruction.IntInstruction.if_icmpne;
import org.codingnewtalking.instruction.IntInstruction.ifeq;
import org.codingnewtalking.instruction.IntInstruction.ifge;
import org.codingnewtalking.instruction.IntInstruction.ifgt;
import org.codingnewtalking.instruction.IntInstruction.ifle;
import org.codingnewtalking.instruction.IntInstruction.iflt;
import org.codingnewtalking.instruction.IntInstruction.ifne;
import org.codingnewtalking.instruction.IntInstruction.iinc;
import org.codingnewtalking.instruction.IntInstruction.iload;
import org.codingnewtalking.instruction.IntInstruction.iload_0;
import org.codingnewtalking.instruction.IntInstruction.iload_1;
import org.codingnewtalking.instruction.IntInstruction.iload_2;
import org.codingnewtalking.instruction.IntInstruction.iload_3;
import org.codingnewtalking.instruction.IntInstruction.imul;
import org.codingnewtalking.instruction.IntInstruction.ineg;
import org.codingnewtalking.instruction.IntInstruction.ior;
import org.codingnewtalking.instruction.IntInstruction.irem;
import org.codingnewtalking.instruction.IntInstruction.ireturn;
import org.codingnewtalking.instruction.IntInstruction.ishl;
import org.codingnewtalking.instruction.IntInstruction.ishr;
import org.codingnewtalking.instruction.IntInstruction.istore;
import org.codingnewtalking.instruction.IntInstruction.istore_0;
import org.codingnewtalking.instruction.IntInstruction.istore_1;
import org.codingnewtalking.instruction.IntInstruction.istore_2;
import org.codingnewtalking.instruction.IntInstruction.istore_3;
import org.codingnewtalking.instruction.IntInstruction.isub;
import org.codingnewtalking.instruction.IntInstruction.iushr;
import org.codingnewtalking.instruction.IntInstruction.ixor;
import org.codingnewtalking.instruction.LongInstruction.l2d;
import org.codingnewtalking.instruction.LongInstruction.l2f;
import org.codingnewtalking.instruction.LongInstruction.l2i;
import org.codingnewtalking.instruction.LongInstruction.ladd;
import org.codingnewtalking.instruction.LongInstruction.land;
import org.codingnewtalking.instruction.LongInstruction.lcmp;
import org.codingnewtalking.instruction.LongInstruction.lconst_0;
import org.codingnewtalking.instruction.LongInstruction.lconst_1;
import org.codingnewtalking.instruction.LongInstruction.ldiv;
import org.codingnewtalking.instruction.LongInstruction.lload;
import org.codingnewtalking.instruction.LongInstruction.lload_0;
import org.codingnewtalking.instruction.LongInstruction.lload_1;
import org.codingnewtalking.instruction.LongInstruction.lload_2;
import org.codingnewtalking.instruction.LongInstruction.lload_3;
import org.codingnewtalking.instruction.LongInstruction.lmul;
import org.codingnewtalking.instruction.LongInstruction.lneg;
import org.codingnewtalking.instruction.LongInstruction.lor;
import org.codingnewtalking.instruction.LongInstruction.lrem;
import org.codingnewtalking.instruction.LongInstruction.lreturn;
import org.codingnewtalking.instruction.LongInstruction.lshl;
import org.codingnewtalking.instruction.LongInstruction.lshr;
import org.codingnewtalking.instruction.LongInstruction.lstore;
import org.codingnewtalking.instruction.LongInstruction.lstore_0;
import org.codingnewtalking.instruction.LongInstruction.lstore_1;
import org.codingnewtalking.instruction.LongInstruction.lstore_2;
import org.codingnewtalking.instruction.LongInstruction.lstore_3;
import org.codingnewtalking.instruction.LongInstruction.lsub;
import org.codingnewtalking.instruction.LongInstruction.lushr;
import org.codingnewtalking.instruction.LongInstruction.lxor;
import org.codingnewtalking.instruction.ObjectInstruction._instanceof;
import org.codingnewtalking.instruction.ObjectInstruction._new;
import org.codingnewtalking.instruction.ObjectInstruction.aconst_null;
import org.codingnewtalking.instruction.ObjectInstruction.aload;
import org.codingnewtalking.instruction.ObjectInstruction.aload_0;
import org.codingnewtalking.instruction.ObjectInstruction.aload_1;
import org.codingnewtalking.instruction.ObjectInstruction.aload_2;
import org.codingnewtalking.instruction.ObjectInstruction.aload_3;
import org.codingnewtalking.instruction.ObjectInstruction.areturn;
import org.codingnewtalking.instruction.ObjectInstruction.astore;
import org.codingnewtalking.instruction.ObjectInstruction.astore_0;
import org.codingnewtalking.instruction.ObjectInstruction.astore_1;
import org.codingnewtalking.instruction.ObjectInstruction.astore_2;
import org.codingnewtalking.instruction.ObjectInstruction.astore_3;
import org.codingnewtalking.instruction.ObjectInstruction.athrow;
import org.codingnewtalking.instruction.ObjectInstruction.checkcast;
import org.codingnewtalking.instruction.ObjectInstruction.getfield;
import org.codingnewtalking.instruction.ObjectInstruction.getstatic;
import org.codingnewtalking.instruction.ObjectInstruction.if_acmpeq;
import org.codingnewtalking.instruction.ObjectInstruction.if_acmpne;
import org.codingnewtalking.instruction.ObjectInstruction.ifnonnull;
import org.codingnewtalking.instruction.ObjectInstruction.ifnull;
import org.codingnewtalking.instruction.ObjectInstruction.invokedynamic;
import org.codingnewtalking.instruction.ObjectInstruction.invokeinterface;
import org.codingnewtalking.instruction.ObjectInstruction.invokespecial;
import org.codingnewtalking.instruction.ObjectInstruction.invokestatic;
import org.codingnewtalking.instruction.ObjectInstruction.invokevirtual;
import org.codingnewtalking.instruction.ObjectInstruction.monitorenter;
import org.codingnewtalking.instruction.ObjectInstruction.monitorexit;
import org.codingnewtalking.instruction.ObjectInstruction.putfield;
import org.codingnewtalking.instruction.ObjectInstruction.putstatic;
import org.codingnewtalking.instruction.ShortInstruction.sipush;
import org.codingnewtalking.instruction.StackInstruction.dup;
import org.codingnewtalking.instruction.StackInstruction.dup2;
import org.codingnewtalking.instruction.StackInstruction.dup2_x1;
import org.codingnewtalking.instruction.StackInstruction.dup2_x2;
import org.codingnewtalking.instruction.StackInstruction.dup_x1;
import org.codingnewtalking.instruction.StackInstruction.dup_x2;
import org.codingnewtalking.instruction.StackInstruction.pop;
import org.codingnewtalking.instruction.StackInstruction.pop2;
import org.codingnewtalking.instruction.StackInstruction.swap;
import org.codingnewtalking.unsigned.U1;
import org.codingnewtalking.util.CollectionUtils;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class InstructionBuilder {

	private U1[] codes;
	private int offset;
	
	private InstructionBuilder(U1[] codes) {
		this.codes = codes;
		this.offset = 0;
	}
	
	public static InstructionBuilder newBuilder(U1[] codes) {
		return new InstructionBuilder(codes);
	}
	
	public Instruction[] buildAll() {
		List<Instruction> instructions = new ArrayList<>();
		Instruction instruction;
		while ((instruction = buildNext()) != null) {
			instructions.add(instruction);
		}
		return CollectionUtils.toArray(instructions, Instruction.class);
	}
	
	public Instruction buildNext() {
		Instruction instruction = buildInternal();
		if (instruction != null) {
			offset += instruction.getLength();
		}
		return instruction;
	}
	
	private Instruction buildInternal() {
		if (offset >= codes.length) {
			return null;
		}
		U1 opcode = codes[offset];
		switch (opcode.getValue()) {
			/*--------Constants--------*/
	
			case Opcode.nop:
				return new nop(codes, offset);
			case Opcode.aconst_null:
				return new aconst_null(codes, offset);
			case Opcode.iconst_m1:
				return new iconst_m1(codes, offset);
			case Opcode.iconst_0:
				return new iconst_0(codes, offset);
			case Opcode.iconst_1:
				return new iconst_1(codes, offset);
			case Opcode.iconst_2:
				return new iconst_2(codes, offset);
			case Opcode.iconst_3:
				return new iconst_3(codes, offset);
			case Opcode.iconst_4:
				return new iconst_4(codes, offset);
			case Opcode.iconst_5:
				return new iconst_5(codes, offset);
			case Opcode.lconst_0:
				return new lconst_0(codes, offset);
			case Opcode.lconst_1:
				return new lconst_1(codes, offset);
			case Opcode.fconst_0:
				return new fconst_0(codes, offset);
			case Opcode.fconst_1:
				return new fconst_1(codes, offset);
			case Opcode.fconst_2:
				return new fconst_2(codes, offset);
			case Opcode.dconst_0:
				return new dconst_0(codes, offset);
			case Opcode.dconst_1:
				return new dconst_1(codes, offset);
			case Opcode.bipush:
				return new bipush(codes, offset);
			case Opcode.sipush:
				return new sipush(codes, offset);
			case Opcode.ldc:
				return new ldc(codes, offset);
			case Opcode.ldc_w:
				return new ldc_w(codes, offset);
			case Opcode.ldc2_w:
				return new ldc2_w(codes, offset);
	
			/*--------Loads--------*/
	
			case Opcode.iload:
				return new iload(codes, offset);
			case Opcode.lload:
				return new lload(codes, offset);
			case Opcode.fload:
				return new fload(codes, offset);
			case Opcode.dload:
				return new dload(codes, offset);
			case Opcode.aload:
				return new aload(codes, offset);
			case Opcode.iload_0:
				return new iload_0(codes, offset);
			case Opcode.iload_1:
				return new iload_1(codes, offset);
			case Opcode.iload_2:
				return new iload_2(codes, offset);
			case Opcode.iload_3:
				return new iload_3(codes, offset);
			case Opcode.lload_0:
				return new lload_0(codes, offset);
			case Opcode.lload_1:
				return new lload_1(codes, offset);
			case Opcode.lload_2:
				return new lload_2(codes, offset);
			case Opcode.lload_3:
				return new lload_3(codes, offset);
			case Opcode.fload_0:
				return new fload_0(codes, offset);
			case Opcode.fload_1:
				return new fload_1(codes, offset);
			case Opcode.fload_2:
				return new fload_2(codes, offset);
			case Opcode.fload_3:
				return new fload_3(codes, offset);
			case Opcode.dload_0:
				return new dload_0(codes, offset);
			case Opcode.dload_1:
				return new dload_1(codes, offset);
			case Opcode.dload_2:
				return new dload_2(codes, offset);
			case Opcode.dload_3:
				return new dload_3(codes, offset);
			case Opcode.aload_0:
				return new aload_0(codes, offset);
			case Opcode.aload_1:
				return new aload_1(codes, offset);
			case Opcode.aload_2:
				return new aload_2(codes, offset);
			case Opcode.aload_3:
				return new aload_3(codes, offset);
			case Opcode.iaload:
				return new iaload(codes, offset);
			case Opcode.laload:
				return new laload(codes, offset);
			case Opcode.faload:
				return new faload(codes, offset);
			case Opcode.daload:
				return new daload(codes, offset);
			case Opcode.aaload:
				return new aaload(codes, offset);
			case Opcode.baload:
				return new baload(codes, offset);
			case Opcode.caload:
				return new caload(codes, offset);
			case Opcode.saload:
				return new saload(codes, offset);
	
			/*--------Stores--------*/
	
			case Opcode.istore:
				return new istore(codes, offset);
			case Opcode.lstore:
				return new lstore(codes, offset);
			case Opcode.fstore:
				return new fstore(codes, offset);
			case Opcode.dstore:
				return new dstore(codes, offset);
			case Opcode.astore:
				return new astore(codes, offset);
			case Opcode.istore_0:
				return new istore_0(codes, offset);
			case Opcode.istore_1:
				return new istore_1(codes, offset);
			case Opcode.istore_2:
				return new istore_2(codes, offset);
			case Opcode.istore_3:
				return new istore_3(codes, offset);
			case Opcode.lstore_0:
				return new lstore_0(codes, offset);
			case Opcode.lstore_1:
				return new lstore_1(codes, offset);
			case Opcode.lstore_2:
				return new lstore_2(codes, offset);
			case Opcode.lstore_3:
				return new lstore_3(codes, offset);
			case Opcode.fstore_0:
				return new fstore_0(codes, offset);
			case Opcode.fstore_1:
				return new fstore_1(codes, offset);
			case Opcode.fstore_2:
				return new fstore_2(codes, offset);
			case Opcode.fstore_3:
				return new fstore_3(codes, offset);
			case Opcode.dstore_0:
				return new dstore_0(codes, offset);
			case Opcode.dstore_1:
				return new dstore_1(codes, offset);
			case Opcode.dstore_2:
				return new dstore_2(codes, offset);
			case Opcode.dstore_3:
				return new dstore_3(codes, offset);
			case Opcode.astore_0:
				return new astore_0(codes, offset);
			case Opcode.astore_1:
				return new astore_1(codes, offset);
			case Opcode.astore_2:
				return new astore_2(codes, offset);
			case Opcode.astore_3:
				return new astore_3(codes, offset);
			case Opcode.iastore:
				return new iastore(codes, offset);
			case Opcode.lastore:
				return new lastore(codes, offset);
			case Opcode.fastore:
				return new fastore(codes, offset);
			case Opcode.dastore:
				return new dastore(codes, offset);
			case Opcode.aastore:
				return new aastore(codes, offset);
			case Opcode.bastore:
				return new bastore(codes, offset);
			case Opcode.castore:
				return new castore(codes, offset);
			case Opcode.sastore:
				return new sastore(codes, offset);
	
			/*--------Stack--------*/
	
			case Opcode.pop:
				return new pop(codes, offset);
			case Opcode.pop2:
				return new pop2(codes, offset);
			case Opcode.dup:
				return new dup(codes, offset);
			case Opcode.dup_x1:
				return new dup_x1(codes, offset);
			case Opcode.dup_x2:
				return new dup_x2(codes, offset);
			case Opcode.dup2:
				return new dup2(codes, offset);
			case Opcode.dup2_x1:
				return new dup2_x1(codes, offset);
			case Opcode.dup2_x2:
				return new dup2_x2(codes, offset);
			case Opcode.swap:
				return new swap(codes, offset);
	
			/*--------Math--------*/
	
			case Opcode.iadd:
				return new iadd(codes, offset);
			case Opcode.ladd:
				return new ladd(codes, offset);
			case Opcode.fadd:
				return new fadd(codes, offset);
			case Opcode.dadd:
				return new dadd(codes, offset);
			case Opcode.isub:
				return new isub(codes, offset);
			case Opcode.lsub:
				return new lsub(codes, offset);
			case Opcode.fsub:
				return new fsub(codes, offset);
			case Opcode.dsub:
				return new dsub(codes, offset);
			case Opcode.imul:
				return new imul(codes, offset);
			case Opcode.lmul:
				return new lmul(codes, offset);
			case Opcode.fmul:
				return new fmul(codes, offset);
			case Opcode.dmul:
				return new dmul(codes, offset);
			case Opcode.idiv:
				return new idiv(codes, offset);
			case Opcode.ldiv:
				return new ldiv(codes, offset);
			case Opcode.fdiv:
				return new fdiv(codes, offset);
			case Opcode.ddiv:
				return new ddiv(codes, offset);
			case Opcode.irem:
				return new irem(codes, offset);
			case Opcode.lrem:
				return new lrem(codes, offset);
			case Opcode.frem:
				return new frem(codes, offset);
			case Opcode.drem:
				return new drem(codes, offset);
			case Opcode.ineg:
				return new ineg(codes, offset);
			case Opcode.lneg:
				return new lneg(codes, offset);
			case Opcode.fneg:
				return new fneg(codes, offset);
			case Opcode.dneg:
				return new dneg(codes, offset);
			case Opcode.ishl:
				return new ishl(codes, offset);
			case Opcode.lshl:
				return new lshl(codes, offset);
			case Opcode.ishr:
				return new ishr(codes, offset);
			case Opcode.lshr:
				return new lshr(codes, offset);
			case Opcode.iushr:
				return new iushr(codes, offset);
			case Opcode.lushr:
				return new lushr(codes, offset);
			case Opcode.iand:
				return new iand(codes, offset);
			case Opcode.land:
				return new land(codes, offset);
			case Opcode.ior:
				return new ior(codes, offset);
			case Opcode.lor:
				return new lor(codes, offset);
			case Opcode.ixor:
				return new ixor(codes, offset);
			case Opcode.lxor:
				return new lxor(codes, offset);
			case Opcode.iinc:
				return new iinc(codes, offset);
	
			/*--------Conversions--------*/
	
			case Opcode.i2l:
				return new i2l(codes, offset);
			case Opcode.i2f:
				return new i2f(codes, offset);
			case Opcode.i2d:
				return new i2d(codes, offset);
			case Opcode.l2i:
				return new l2i(codes, offset);
			case Opcode.l2f:
				return new l2f(codes, offset);
			case Opcode.l2d:
				return new l2d(codes, offset);
			case Opcode.f2i:
				return new f2i(codes, offset);
			case Opcode.f2l:
				return new f2l(codes, offset);
			case Opcode.f2d:
				return new f2d(codes, offset);
			case Opcode.d2i:
				return new d2i(codes, offset);
			case Opcode.d2l:
				return new d2l(codes, offset);
			case Opcode.d2f:
				return new d2f(codes, offset);
			case Opcode.i2b:
				return new i2b(codes, offset);
			case Opcode.i2c:
				return new i2c(codes, offset);
			case Opcode.i2s:
				return new i2s(codes, offset);
	
			/*--------Comparisons--------*/
	
			case Opcode.lcmp:
				return new lcmp(codes, offset);
			case Opcode.fcmpl:
				return new fcmpl(codes, offset);
			case Opcode.fcmpg:
				return new fcmpg(codes, offset);
			case Opcode.dcmpl:
				return new dcmpl(codes, offset);
			case Opcode.dcmpg:
				return new dcmpg(codes, offset);
			case Opcode.ifeq:
				return new ifeq(codes, offset);
			case Opcode.ifne:
				return new ifne(codes, offset);
			case Opcode.iflt:
				return new iflt(codes, offset);
			case Opcode.ifge:
				return new ifge(codes, offset);
			case Opcode.ifgt:
				return new ifgt(codes, offset);
			case Opcode.ifle:
				return new ifle(codes, offset);
			case Opcode.if_icmpeq:
				return new if_icmpeq(codes, offset);
			case Opcode.if_icmpne:
				return new if_icmpne(codes, offset);
			case Opcode.if_icmplt:
				return new if_icmplt(codes, offset);
			case Opcode.if_icmpge:
				return new if_icmpge(codes, offset);
			case Opcode.if_icmpgt:
				return new if_icmpgt(codes, offset);
			case Opcode.if_icmple:
				return new if_icmple(codes, offset);
			case Opcode.if_acmpeq:
				return new if_acmpeq(codes, offset);
			case Opcode.if_acmpne:
				return new if_acmpne(codes, offset);
	
			/*--------Control--------*/
	
			case Opcode._goto:
				return new _goto(codes, offset);
			case Opcode.jsr:
				return new jsr(codes, offset);
			case Opcode.ret:
				return new ret(codes, offset);
			case Opcode.tableswitch:
				return new tableswitch(codes, offset);
			case Opcode.lookupswitch:
				return new lookupswitch(codes, offset);
			case Opcode.ireturn:
				return new ireturn(codes, offset);
			case Opcode.lreturn:
				return new lreturn(codes, offset);
			case Opcode.freturn:
				return new freturn(codes, offset);
			case Opcode.dreturn:
				return new dreturn(codes, offset);
			case Opcode.areturn:
				return new areturn(codes, offset);
			case Opcode._return:
				return new _return(codes, offset);
	
			/*--------References--------*/
	
			case Opcode.getstatic:
				return new getstatic(codes, offset);
			case Opcode.putstatic:
				return new putstatic(codes, offset);
			case Opcode.getfield:
				return new getfield(codes, offset);
			case Opcode.putfield:
				return new putfield(codes, offset);
			case Opcode.invokevirtual:
				return new invokevirtual(codes, offset);
			case Opcode.invokespecial:
				return new invokespecial(codes, offset);
			case Opcode.invokestatic:
				return new invokestatic(codes, offset);
			case Opcode.invokeinterface:
				return new invokeinterface(codes, offset);
			case Opcode.invokedynamic:
				return new invokedynamic(codes, offset);
			case Opcode._new:
				return new _new(codes, offset);
			case Opcode.newarray:
				return new newarray(codes, offset);
			case Opcode.anewarray:
				return new anewarray(codes, offset);
			case Opcode.arraylength:
				return new arraylength(codes, offset);
			case Opcode.athrow:
				return new athrow(codes, offset);
			case Opcode.checkcast:
				return new checkcast(codes, offset);
			case Opcode._instanceof:
				return new _instanceof(codes, offset);
			case Opcode.monitorenter:
				return new monitorenter(codes, offset);
			case Opcode.monitorexit:
				return new monitorexit(codes, offset);
	
			/*--------Extended--------*/
	
			case Opcode.wide:
				return new wide(codes, offset);
			case Opcode.multianewarray:
				return new multianewarray(codes, offset);
			case Opcode.ifnull:
				return new ifnull(codes, offset);
			case Opcode.ifnonnull:
				return new ifnonnull(codes, offset);
			case Opcode.goto_w:
				return new goto_w(codes, offset);
			case Opcode.jsr_w:
				return new jsr_w(codes, offset);
	
			/*--------Reserved--------*/
	
			case Opcode.breakpoint:
				//return new breakpoint(codes, offset);
			case Opcode.impdep1:
				//return new impdep1(codes, offset);
			case Opcode.impdep2:
				//return new impdep2(codes, offset);
		}
		throw new IllegalArgumentException("illegal opcode '" + opcode.getValue() + "'.");
	}
}
