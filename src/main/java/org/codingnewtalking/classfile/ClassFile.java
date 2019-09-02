package org.codingnewtalking.classfile;

/**
 * @author lixinjie
 * @since 2019-07-10
 */
public class ClassFile {

	private Magic magic;
	private MinorVersion minorVersion;
	private MajorVersion majorVersion;
	private ConstantPoolCount constantPoolCount;
	private ConstantPool constantPool;
	private AccessFlags accessFlags;
	private ThisClass thisClass;
	private SuperClass superClass;
	private InterfacesCount interfacesCount;
	private Interfaces interfaces;
	private FieldsCount fieldsCount;
	private Fields fields;
	private MethodsCount methodsCount;
	private Methods methods;
	private AttributesCount attributesCount;
	private Attributes attributes;
	
	private int offset;
	private byte[] bytes;
	
	public ClassFile(byte[] bytes) {
		this.bytes = bytes;
		this.offset = 0;
		this.parse();
	}
	
	public Magic getMagic() {
		return magic;
	}

	public MinorVersion getMinorVersion() {
		return minorVersion;
	}

	public MajorVersion getMajorVersion() {
		return majorVersion;
	}

	public ConstantPoolCount getConstantPoolCount() {
		return constantPoolCount;
	}

	public ConstantPool getConstantPool() {
		return constantPool;
	}

	public AccessFlags getAccessFlags() {
		return accessFlags;
	}

	public ThisClass getThisClass() {
		return thisClass;
	}

	public SuperClass getSuperClass() {
		return superClass;
	}

	public InterfacesCount getInterfacesCount() {
		return interfacesCount;
	}

	public Interfaces getInterfaces() {
		return interfaces;
	}

	public FieldsCount getFieldsCount() {
		return fieldsCount;
	}

	public Fields getFields() {
		return fields;
	}

	public MethodsCount getMethodsCount() {
		return methodsCount;
	}

	public Methods getMethods() {
		return methods;
	}

	public AttributesCount getAttributesCount() {
		return attributesCount;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	private void parse() {
		parseMagic();
		parseMinorVersion();
		parseMajorVersion();
		parseConstantPoolCount();
		parseConstantPool();
		parseAccessFlags();
		parseThisClass();
		parseSuperClass();
		parseInterfacesCount();
		parseInterfaces();
		parseFieldsCount();
		parseFields();
		parseMethodsCount();
		parseMethods();
		parseAttributesCount();
		parseAttributes();
	}
	
	private void parseMagic() {
		magic = new Magic(bytes, offset);
		offset += magic.getByteLength();
	}
	
	private void parseMinorVersion() {
		minorVersion = new MinorVersion(bytes, offset);
		offset += minorVersion.getByteLength();
	}
	
	private void parseMajorVersion() {
		majorVersion = new MajorVersion(bytes, offset);
		offset += majorVersion.getByteLength();
	}
	
	private void parseConstantPoolCount() {
		constantPoolCount = new ConstantPoolCount(bytes, offset);
		offset += constantPoolCount.getByteLength();
	}
	
	private void parseConstantPool() {
		constantPool = new ConstantPool(bytes, offset, constantPoolCount.getCount());
		offset += constantPool.getByteLength();
	}
	
	private void parseAccessFlags() {
		accessFlags = new AccessFlags(bytes, offset);
		offset += accessFlags.getByteLength();
	}
	
	private void parseThisClass() {
		thisClass = new ThisClass(bytes, offset, constantPool);
		offset += thisClass.getByteLength();
	}
	
	private void parseSuperClass() {
		superClass = new SuperClass(bytes, offset, constantPool);
		offset += superClass.getByteLength();
	}
	
	private void parseInterfacesCount() {
		interfacesCount = new InterfacesCount(bytes, offset);
		offset += interfacesCount.getByteLength();
	}
	
	private void parseInterfaces() {
		interfaces = new Interfaces(bytes, offset, interfacesCount.getCount(), constantPool);
		offset += interfaces.getByteLength();
	}
	
	private void parseFieldsCount() {
		fieldsCount = new FieldsCount(bytes, offset);
		offset += fieldsCount.getByteLength();
	}
	
	private void parseFields() {
		fields = new Fields(bytes, offset, fieldsCount.getCount(), constantPool);
		offset += fields.getByteLength();
	}
	
	private void parseMethodsCount() {
		methodsCount = new MethodsCount(bytes, offset);
		offset += methodsCount.getByteLength();
	}
	
	private void parseMethods() {
		methods = new Methods(bytes, offset, methodsCount.getCount(), constantPool);
		offset += methods.getByteLength();
	}
	
	private void parseAttributesCount() {
		attributesCount = new AttributesCount(bytes, offset);
		offset += attributesCount.getByteLength();
	}
	
	private void parseAttributes() {
		attributes = new Attributes(bytes, offset, attributesCount.getCount(), constantPool);
		offset += attributes.getByteLength();
	}
	
	public void toString(StringBuilder sb) {
		sb.append("-----bytes=" + bytes.length + ", offset=0-----\r\n");
		sb.append(magic).append("\r\n");
		sb.append(minorVersion).append("\r\n");
		sb.append(majorVersion).append("\r\n");
		sb.append(constantPoolCount).append("\r\n");
		sb.append(constantPool).append("\r\n");
		sb.append(accessFlags).append("\r\n");
		sb.append(thisClass).append("\r\n");
		sb.append(superClass).append("\r\n");
		sb.append(interfacesCount).append("\r\n");
		sb.append(interfaces).append("\r\n");
		sb.append(fieldsCount).append("\r\n");
		sb.append(fields).append("\r\n");
		sb.append(methodsCount).append("\r\n");
		sb.append(methods).append("\r\n");
		sb.append(attributesCount).append("\r\n");
		sb.append(attributes).append("\r\n");
		sb.append("-----bytes=" + bytes.length + ", offset=" + offset + "-----\r\n");
	}
}
