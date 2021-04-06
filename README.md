# Java.io-Streams-Readers-e-Writers
Serialização, Desserialização, Fluxos Binários, etc...

* A criação do fluxo binário a partir de um objeto é chamado de serialização;
* A criação de um objeto a partir de um um fluxo binário é chamado de desserialização;
* A classe deve implementar a interface java.io.Serializable;
* A serialização/desserialização funciona em cascata e também com herança;
* Existe a palavra-chave transient para indicar que o atributo não deve ser serializado;
* É boa prática colocar o atributo estático serialVersionUID para versionar a classe;
* A versão sempre fica guardada no fluxo binário;
* Se não colocarmos explicitamente o serialVersionUID, a versão será gerada dinamicamente;
* É raro usar a serialização na "unha", mas é um conhecimento importante, pois será utilizado por outras bibliotecas.
