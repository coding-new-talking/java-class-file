package org.codingnewtalking.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codingnewtalking.classfile.ClassFile;
import org.codingnewtalking.java.SourceCode;
import org.codingnewtalking.jvm.ByteCode;

/**
 * @author lixinjie
 * @since 2019-07-02
 */
public class MainTest {

	public static void main(String[] args) throws IOException {
		String project = new File("").getCanonicalPath();
		String path = project + "\\target\\test-classes\\org\\codingnewtalking\\test\\Broccoli.class";
		path = project + "\\target\\test-classes\\org\\codingnewtalking\\test\\Apple.class";
		//path = "C:\\Users\\Administrator\\Desktop\\AnnotationMetadataReadingVisitor.class";
		//path = "C:\\Users\\DELL\\Desktop\\AnnotationMetadataReadingVisitor.class";
		byte[] bytes = Files.readAllBytes(Paths.get(path));
		ClassFile classFile = new ClassFile(bytes);
		StringBuilder csb = new StringBuilder();
		classFile.toString(csb);
		log(csb);
		ByteCode byteCode = new ByteCode(classFile);
		StringBuilder bsb = new StringBuilder();
		byteCode.toString(bsb);
		log(bsb);
		SourceCode sourceCode = new SourceCode(byteCode);
		StringBuilder ssb = new StringBuilder();
		sourceCode.toString(ssb);
		log(ssb);
	}
	
	
	static void log(Object o) {
		System.out.println(o);
	}
}
