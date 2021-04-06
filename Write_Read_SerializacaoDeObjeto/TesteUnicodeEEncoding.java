package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String c = "C";

		System.out.println(c.codePointAt(0));

		System.out.println(Charset.defaultCharset().displayName());

		byte[] bytes = c.getBytes("windows-1252");
		System.out.println(bytes.length + ", windows-1252");
		String sNovo = new String(bytes);
		System.out.println(sNovo);

		bytes = c.getBytes("UTF-16");
		System.out.println(bytes.length + ", UTF-16");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);

		bytes = c.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + ", US-ASCII");
		sNovo = new String(bytes, "US-ASCII");
		System.out.println(sNovo);

	}

}
