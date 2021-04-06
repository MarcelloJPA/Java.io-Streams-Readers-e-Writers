package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		
		OutputStream fos = new FileOutputStream("Teste2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Ronaldinho Gaucho, Pelé, Maradona, Cristiano Ronaldo, Ronaldo Fenomeno, Messi, ");
		bw.newLine();
		bw.newLine();
		bw.write("Jogadores de futebol que entraram para história");
		bw.close();
	}

}
