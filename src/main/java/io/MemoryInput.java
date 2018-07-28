//: io/MemoryInput.java
package io; /* Added by Eclipse.py */

import java.io.*;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile
				.read("D:\\Workspaces\\Eclipse\\thinking-In-Java-master\\src\\main\\java\\io\\MemoryInput.java"));
		int c;
		while ((c = in.read()) != -1)
			System.out.print(c + "\n");
	}
}
/* (Execute to see output) */// :~