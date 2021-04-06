package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.Conta;

public class TesteDesserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conta.bin"));
		Conta cc = (Conta)ois.readObject();
		System.out.println(cc.getSaldo());
		System.out.println(cc.getTitular().getProfissao());
		ois.close();
	}

}
