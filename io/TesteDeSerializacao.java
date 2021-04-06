package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeSerializacao {

	public static void main(String[] args) throws IOException {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Marcello");
		cliente.setCpf("123456789");
		cliente.setProfissao("Programador");
		
		Conta conta = new ContaCorrente(22, 3333);
		
		conta.setTitular(cliente);
		conta.deposita(500.58);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
		oos.writeObject(conta);
		oos.close();

	}

}
