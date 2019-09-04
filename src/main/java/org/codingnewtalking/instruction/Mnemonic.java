package org.codingnewtalking.instruction;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class Mnemonic {

	/*--------Constants--------*/

	public static final String nop = "nop";
	public static final String aconst_null = "aconst_null";
	public static final String iconst_m1 = "iconst_m1";
	public static final String iconst_0 = "iconst_0";
	public static final String iconst_1 = "iconst_1";
	public static final String iconst_2 = "iconst_2";
	public static final String iconst_3 = "iconst_3";
	public static final String iconst_4 = "iconst_4";
	public static final String iconst_5 = "iconst_5";
	public static final String lconst_0 = "lconst_0";
	public static final String lconst_1 = "lconst_1";
	public static final String fconst_0 = "fconst_0";
	public static final String fconst_1 = "fconst_1";
	public static final String fconst_2 = "fconst_2";
	public static final String dconst_0 = "dconst_0";
	public static final String dconst_1 = "dconst_1";
	public static final String bipush = "bipush";
	public static final String sipush = "sipush";
	public static final String ldc = "ldc";
	public static final String ldc_w = "ldc_w";
	public static final String ldc2_w = "ldc2_w";

	/*--------Loads--------*/

	public static final String iload = "iload";
	public static final String lload = "lload";
	public static final String fload = "fload";
	public static final String dload = "dload";
	public static final String aload = "aload";
	public static final String iload_0 = "iload_0";
	public static final String iload_1 = "iload_1";
	public static final String iload_2 = "iload_2";
	public static final String iload_3 = "iload_3";
	public static final String lload_0 = "lload_0";
	public static final String lload_1 = "lload_1";
	public static final String lload_2 = "lload_2";
	public static final String lload_3 = "lload_3";
	public static final String fload_0 = "fload_0";
	public static final String fload_1 = "fload_1";
	public static final String fload_2 = "fload_2";
	public static final String fload_3 = "fload_3";
	public static final String dload_0 = "dload_0";
	public static final String dload_1 = "dload_1";
	public static final String dload_2 = "dload_2";
	public static final String dload_3 = "dload_3";
	public static final String aload_0 = "aload_0";
	public static final String aload_1 = "aload_1";
	public static final String aload_2 = "aload_2";
	public static final String aload_3 = "aload_3";
	public static final String iaload = "iaload";
	public static final String laload = "laload";
	public static final String faload = "faload";
	public static final String daload = "daload";
	public static final String aaload = "aaload";
	public static final String baload = "baload";
	public static final String caload = "caload";
	public static final String saload = "saload";

	/*--------Stores--------*/

	public static final String istore = "istore";
	public static final String lstore = "lstore";
	public static final String fstore = "fstore";
	public static final String dstore = "dstore";
	public static final String astore = "astore";
	public static final String istore_0 = "istore_0";
	public static final String istore_1 = "istore_1";
	public static final String istore_2 = "istore_2";
	public static final String istore_3 = "istore_3";
	public static final String lstore_0 = "lstore_0";
	public static final String lstore_1 = "lstore_1";
	public static final String lstore_2 = "lstore_2";
	public static final String lstore_3 = "lstore_3";
	public static final String fstore_0 = "fstore_0";
	public static final String fstore_1 = "fstore_1";
	public static final String fstore_2 = "fstore_2";
	public static final String fstore_3 = "fstore_3";
	public static final String dstore_0 = "dstore_0";
	public static final String dstore_1 = "dstore_1";
	public static final String dstore_2 = "dstore_2";
	public static final String dstore_3 = "dstore_3";
	public static final String astore_0 = "astore_0";
	public static final String astore_1 = "astore_1";
	public static final String astore_2 = "astore_2";
	public static final String astore_3 = "astore_3";
	public static final String iastore = "iastore";
	public static final String lastore = "lastore";
	public static final String fastore = "fastore";
	public static final String dastore = "dastore";
	public static final String aastore = "aastore";
	public static final String bastore = "bastore";
	public static final String castore = "castore";
	public static final String sastore = "sastore";

	/*--------Stack--------*/

	public static final String pop = "pop";
	public static final String pop2 = "pop2";
	public static final String dup = "dup";
	public static final String dup_x1 = "dup_x1";
	public static final String dup_x2 = "dup_x2";
	public static final String dup2 = "dup2";
	public static final String dup2_x1 = "dup2_x1";
	public static final String dup2_x2 = "dup2_x2";
	public static final String swap = "swap";

	/*--------Math--------*/

	public static final String iadd = "iadd";
	public static final String ladd = "ladd";
	public static final String fadd = "fadd";
	public static final String dadd = "dadd";
	public static final String isub = "isub";
	public static final String lsub = "lsub";
	public static final String fsub = "fsub";
	public static final String dsub = "dsub";
	public static final String imul = "imul";
	public static final String lmul = "lmul";
	public static final String fmul = "fmul";
	public static final String dmul = "dmul";
	public static final String idiv = "idiv";
	public static final String ldiv = "ldiv";
	public static final String fdiv = "fdiv";
	public static final String ddiv = "ddiv";
	public static final String irem = "irem";
	public static final String lrem = "lrem";
	public static final String frem = "frem";
	public static final String drem = "drem";
	public static final String ineg = "ineg";
	public static final String lneg = "lneg";
	public static final String fneg = "fneg";
	public static final String dneg = "dneg";
	public static final String ishl = "ishl";
	public static final String lshl = "lshl";
	public static final String ishr = "ishr";
	public static final String lshr = "lshr";
	public static final String iushr = "iushr";
	public static final String lushr = "lushr";
	public static final String iand = "iand";
	public static final String land = "land";
	public static final String ior = "ior";
	public static final String lor = "lor";
	public static final String ixor = "ixor";
	public static final String lxor = "lxor";
	public static final String iinc = "iinc";

	/*--------Conversions--------*/

	public static final String i2l = "i2l";
	public static final String i2f = "i2f";
	public static final String i2d = "i2d";
	public static final String l2i = "l2i";
	public static final String l2f = "l2f";
	public static final String l2d = "l2d";
	public static final String f2i = "f2i";
	public static final String f2l = "f2l";
	public static final String f2d = "f2d";
	public static final String d2i = "d2i";
	public static final String d2l = "d2l";
	public static final String d2f = "d2f";
	public static final String i2b = "i2b";
	public static final String i2c = "i2c";
	public static final String i2s = "i2s";

	/*--------Comparisons--------*/

	public static final String lcmp = "lcmp";
	public static final String fcmpl = "fcmpl";
	public static final String fcmpg = "fcmpg";
	public static final String dcmpl = "dcmpl";
	public static final String dcmpg = "dcmpg";
	public static final String ifeq = "ifeq";
	public static final String ifne = "ifne";
	public static final String iflt = "iflt";
	public static final String ifge = "ifge";
	public static final String ifgt = "ifgt";
	public static final String ifle = "ifle";
	public static final String if_icmpeq = "if_icmpeq";
	public static final String if_icmpne = "if_icmpne";
	public static final String if_icmplt = "if_icmplt";
	public static final String if_icmpge = "if_icmpge";
	public static final String if_icmpgt = "if_icmpgt";
	public static final String if_icmple = "if_icmple";
	public static final String if_acmpeq = "if_acmpeq";
	public static final String if_acmpne = "if_acmpne";

	/*--------Control--------*/

	public static final String _goto = "goto";
	public static final String jsr = "jsr";
	public static final String ret = "ret";
	public static final String tableswitch = "tableswitch";
	public static final String lookupswitch = "lookupswitch";
	public static final String ireturn = "ireturn";
	public static final String lreturn = "lreturn";
	public static final String freturn = "freturn";
	public static final String dreturn = "dreturn";
	public static final String areturn = "areturn";
	public static final String _return = "return";

	/*--------References--------*/

	public static final String getstatic = "getstatic";
	public static final String putstatic = "putstatic";
	public static final String getfield = "getfield";
	public static final String putfield = "putfield";
	public static final String invokevirtual = "invokevirtual";
	public static final String invokespecial = "invokespecial";
	public static final String invokestatic = "invokestatic";
	public static final String invokeinterface = "invokeinterface";
	public static final String invokedynamic = "invokedynamic";
	public static final String _new = "new";
	public static final String newarray = "newarray";
	public static final String anewarray = "anewarray";
	public static final String arraylength = "arraylength";
	public static final String athrow = "athrow";
	public static final String checkcast = "checkcast";
	public static final String _instanceof = "instanceof";
	public static final String monitorenter = "monitorenter";
	public static final String monitorexit = "monitorexit";

	/*--------Extended--------*/

	public static final String wide = "wide";
	public static final String multianewarray = "multianewarray";
	public static final String ifnull = "ifnull";
	public static final String ifnonnull = "ifnonnull";
	public static final String goto_w = "goto_w";
	public static final String jsr_w = "jsr_w";

	/*--------Reserved--------*/

	public static final String breakpoint = "breakpoint";
	public static final String impdep1 = "impdep1";
	public static final String impdep2 = "impdep2";

}
