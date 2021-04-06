package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteDeSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setCpf("123456789");
		cliente.setNome("Marise maria lima da costa");
		cliente.setProfissao("Cuidadora de idoso");

		/* Serializando Objeto criado pelo programador*/
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oi.bin"));
		oos.writeObject(cliente);
		oos.close(); 
		
		/*Desserializando Objeto do programador*/
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oi.bin"));
		Cliente clienteDesserializado = (Cliente)ois.readObject();
		System.out.println(clienteDesserializado.getCpf());
	}
}
