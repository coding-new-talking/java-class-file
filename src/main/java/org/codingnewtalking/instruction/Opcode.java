package org.codingnewtalking.instruction;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author lixinjie
 * @since 2019-09-04
 */
public class Opcode {

	public static void main(String[] args) throws Exception {
		Files.readAllLines(Paths.get("C:\\Users\\DELL\\Desktop\\op.txt"))
				.forEach((line) -> {
					if (line.isEmpty()) {
						System.out.println();
					} else {
						String[] parts = line.split(" ");
						if (parts.length == 1) {
							System.out.println("/*--------" + parts[0] + "--------*/");
						} else {
							System.out.print("public static final String ");
							System.out.print(parts[2]);
							System.out.print(" = ");
							System.out.print("\"" + parts[2] + "\"");
							System.out.println(";");
						}
					}
				});
	}
	/*--------Constants--------*/

	public static final int nop = 0;			//(0x00)
	public static final int aconst_null = 1;	//(0x01)
	public static final int iconst_m1 = 2;		//(0x02)
	public static final int iconst_0 = 3;		//(0x03)
	public static final int iconst_1 = 4;		//(0x04)
	public static final int iconst_2 = 5;		//(0x05)
	public static final int iconst_3 = 6;		//(0x06)
	public static final int iconst_4 = 7;		//(0x07)
	public static final int iconst_5 = 8;		//(0x08)
	public static final int lconst_0 = 9;		//(0x09)
	public static final int lconst_1 = 10;		//(0x0a)
	public static final int fconst_0 = 11;		//(0x0b)
	public static final int fconst_1 = 12;		//(0x0c)
	public static final int fconst_2 = 13;		//(0x0d)
	public static final int dconst_0 = 14;		//(0x0e)
	public static final int dconst_1 = 15;		//(0x0f)
	public static final int bipush = 16;		//(0x10)
	public static final int sipush = 17;		//(0x11)
	public static final int ldc = 18;			//(0x12)
	public static final int ldc_w = 19;			//(0x13)
	public static final int ldc2_w = 20;		//(0x14)

	/*--------Loads--------*/

	public static final int iload = 21;			//(0x15)
	public static final int lload = 22;			//(0x16)
	public static final int fload = 23;			//(0x17)
	public static final int dload = 24;			//(0x18)
	public static final int aload = 25;			//(0x19)
	public static final int iload_0 = 26;		//(0x1a)
	public static final int iload_1 = 27;		//(0x1b)
	public static final int iload_2 = 28;		//(0x1c)
	public static final int iload_3 = 29;		//(0x1d)
	public static final int lload_0 = 30;		//(0x1e)
	public static final int lload_1 = 31;		//(0x1f)
	public static final int lload_2 = 32;		//(0x20)
	public static final int lload_3 = 33;		//(0x21)
	public static final int fload_0 = 34;		//(0x22)
	public static final int fload_1 = 35;		//(0x23)
	public static final int fload_2 = 36;		//(0x24)
	public static final int fload_3 = 37;		//(0x25)
	public static final int dload_0 = 38;		//(0x26)
	public static final int dload_1 = 39;		//(0x27)
	public static final int dload_2 = 40;		//(0x28)
	public static final int dload_3 = 41;		//(0x29)
	public static final int aload_0 = 42;		//(0x2a)
	public static final int aload_1 = 43;		//(0x2b)
	public static final int aload_2 = 44;		//(0x2c)
	public static final int aload_3 = 45;		//(0x2d)
	public static final int iaload = 46;		//(0x2e)
	public static final int laload = 47;		//(0x2f)
	public static final int faload = 48;		//(0x30)
	public static final int daload = 49;		//(0x31)
	public static final int aaload = 50;		//(0x32)
	public static final int baload = 51;		//(0x33)
	public static final int caload = 52;		//(0x34)
	public static final int saload = 53;		//(0x35)

	/*--------Stores--------*/

	public static final int istore = 54;		//(0x36)
	public static final int lstore = 55;		//(0x37)
	public static final int fstore = 56;		//(0x38)
	public static final int dstore = 57;		//(0x39)
	public static final int astore = 58;		//(0x3a)
	public static final int istore_0 = 59;		//(0x3b)
	public static final int istore_1 = 60;		//(0x3c)
	public static final int istore_2 = 61;		//(0x3d)
	public static final int istore_3 = 62;		//(0x3e)
	public static final int lstore_0 = 63;		//(0x3f)
	public static final int lstore_1 = 64;		//(0x40)
	public static final int lstore_2 = 65;		//(0x41)
	public static final int lstore_3 = 66;		//(0x42)
	public static final int fstore_0 = 67;		//(0x43)
	public static final int fstore_1 = 68;		//(0x44)
	public static final int fstore_2 = 69;		//(0x45)
	public static final int fstore_3 = 70;		//(0x46)
	public static final int dstore_0 = 71;		//(0x47)
	public static final int dstore_1 = 72;		//(0x48)
	public static final int dstore_2 = 73;		//(0x49)
	public static final int dstore_3 = 74;		//(0x4a)
	public static final int astore_0 = 75;		//(0x4b)
	public static final int astore_1 = 76;		//(0x4c)
	public static final int astore_2 = 77;		//(0x4d)
	public static final int astore_3 = 78;		//(0x4e)
	public static final int iastore = 79;		//(0x4f)
	public static final int lastore = 80;		//(0x50)
	public static final int fastore = 81;		//(0x51)
	public static final int dastore = 82;		//(0x52)
	public static final int aastore = 83;		//(0x53)
	public static final int bastore = 84;		//(0x54)
	public static final int castore = 85;		//(0x55)
	public static final int sastore = 86;		//(0x56)

	/*--------Stack--------*/

	public static final int pop = 87;		//(0x57)
	public static final int pop2 = 88;		//(0x58)
	public static final int dup = 89;		//(0x59)
	public static final int dup_x1 = 90;	//(0x5a)
	public static final int dup_x2 = 91;	//(0x5b)
	public static final int dup2 = 92;		//(0x5c)
	public static final int dup2_x1 = 93;	//(0x5d)
	public static final int dup2_x2 = 94;	//(0x5e)
	public static final int swap = 95;		//(0x5f)

	/*--------Math--------*/

	public static final int iadd = 96;		//(0x60)
	public static final int ladd = 97;		//(0x61)
	public static final int fadd = 98;		//(0x62)
	public static final int dadd = 99;		//(0x63)
	public static final int isub = 100;		//(0x64)
	public static final int lsub = 101;		//(0x65)
	public static final int fsub = 102;		//(0x66)
	public static final int dsub = 103;		//(0x67)
	public static final int imul = 104;		//(0x68)
	public static final int lmul = 105;		//(0x69)
	public static final int fmul = 106;		//(0x6a)
	public static final int dmul = 107;		//(0x6b)
	public static final int idiv = 108;		//(0x6c)
	public static final int ldiv = 109;		//(0x6d)
	public static final int fdiv = 110;		//(0x6e)
	public static final int ddiv = 111;		//(0x6f)
	public static final int irem = 112;		//(0x70)
	public static final int lrem = 113;		//(0x71)
	public static final int frem = 114;		//(0x72)
	public static final int drem = 115;		//(0x73)
	public static final int ineg = 116;		//(0x74)
	public static final int lneg = 117;		//(0x75)
	public static final int fneg = 118;		//(0x76)
	public static final int dneg = 119;		//(0x77)
	public static final int ishl = 120;		//(0x78)
	public static final int lshl = 121;		//(0x79)
	public static final int ishr = 122;		//(0x7a)
	public static final int lshr = 123;		//(0x7b)
	public static final int iushr = 124;	//(0x7c)
	public static final int lushr = 125;	//(0x7d)
	public static final int iand = 126;		//(0x7e)
	public static final int land = 127;		//(0x7f)
	public static final int ior = 128;		//(0x80)
	public static final int lor = 129;		//(0x81)
	public static final int ixor = 130;		//(0x82)
	public static final int lxor = 131;		//(0x83)
	public static final int iinc = 132;		//(0x84)

	/*--------Conversions--------*/

	public static final int i2l = 133;		//(0x85)
	public static final int i2f = 134;		//(0x86)
	public static final int i2d = 135;		//(0x87)
	public static final int l2i = 136;		//(0x88)
	public static final int l2f = 137;		//(0x89)
	public static final int l2d = 138;		//(0x8a)
	public static final int f2i = 139;		//(0x8b)
	public static final int f2l = 140;		//(0x8c)
	public static final int f2d = 141;		//(0x8d)
	public static final int d2i = 142;		//(0x8e)
	public static final int d2l = 143;		//(0x8f)
	public static final int d2f = 144;		//(0x90)
	public static final int i2b = 145;		//(0x91)
	public static final int i2c = 146;		//(0x92)
	public static final int i2s = 147;		//(0x93)

	/*--------Comparisons--------*/

	public static final int lcmp = 148;			//(0x94)
	public static final int fcmpl = 149;		//(0x95)
	public static final int fcmpg = 150;		//(0x96)
	public static final int dcmpl = 151;		//(0x97)
	public static final int dcmpg = 152;		//(0x98)
	public static final int ifeq = 153;			//(0x99)
	public static final int ifne = 154;			//(0x9a)
	public static final int iflt = 155;			//(0x9b)
	public static final int ifge = 156;			//(0x9c)
	public static final int ifgt = 157;			//(0x9d)
	public static final int ifle = 158;			//(0x9e)
	public static final int if_icmpeq = 159;	//(0x9f)
	public static final int if_icmpne = 160;	//(0xa0)
	public static final int if_icmplt = 161;	//(0xa1)
	public static final int if_icmpge = 162;	//(0xa2)
	public static final int if_icmpgt = 163;	//(0xa3)
	public static final int if_icmple = 164;	//(0xa4)
	public static final int if_acmpeq = 165;	//(0xa5)
	public static final int if_acmpne = 166;	//(0xa6)

	/*--------Control--------*/

	public static final int _goto = 167;		//(0xa7)
	public static final int jsr = 168;			//(0xa8)
	public static final int ret = 169;			//(0xa9)
	public static final int tableswitch = 170;	//(0xaa)
	public static final int lookupswitch = 171;	//(0xab)
	public static final int ireturn = 172;		//(0xac)
	public static final int lreturn = 173;		//(0xad)
	public static final int freturn = 174;		//(0xae)
	public static final int dreturn = 175;		//(0xaf)
	public static final int areturn = 176;		//(0xb0)
	public static final int _return = 177;		//(0xb1)

	/*--------References--------*/

	public static final int getstatic = 178;		//(0xb2)
	public static final int putstatic = 179;		//(0xb3)
	public static final int getfield = 180;			//(0xb4)
	public static final int putfield = 181;			//(0xb5)
	public static final int invokevirtual = 182;	//(0xb6)
	public static final int invokespecial = 183;	//(0xb7)
	public static final int invokestatic = 184;		//(0xb8)
	public static final int invokeinterface = 185;	//(0xb9)
	public static final int invokedynamic = 186;	//(0xba)
	public static final int _new = 187;				//(0xbb)
	public static final int newarray = 188;			//(0xbc)
	public static final int anewarray = 189;		//(0xbd)
	public static final int arraylength = 190;		//(0xbe)
	public static final int athrow = 191;			//(0xbf)
	public static final int checkcast = 192;		//(0xc0)
	public static final int _instanceof = 193;		//(0xc1)
	public static final int monitorenter = 194;		//(0xc2)
	public static final int monitorexit = 195;		//(0xc3)

	/*--------Extended--------*/

	public static final int wide = 196;				//(0xc4)
	public static final int multianewarray = 197;	//(0xc5)
	public static final int ifnull = 198;			//(0xc6)
	public static final int ifnonnull = 199;		//(0xc7)
	public static final int goto_w = 200;			//(0xc8)
	public static final int jsr_w = 201;			//(0xc9)

	/*--------Reserved--------*/

	public static final int breakpoint = 202;		//(0xca)
	public static final int impdep1 = 254;			//(0xfe)
	public static final int impdep2 = 255;			//(0xff)

}
