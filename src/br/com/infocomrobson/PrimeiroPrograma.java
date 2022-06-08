package br.com.infocomrobson;

import br.com.infocomrobson.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		gato.setCor("preto"); 
		gato.setNome("Emma");
		System.out.println(gato);
		System.out.println(livros);
		/*int a = 4;
		int b = 5;
		System.out.println("Robson Farias o desenvolvedor "+(a+b));*/
	}

}

class Livros {
	private String nome, npag;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome; 
	}

	public String getNpag() {
		return npag;
	}

	public void setNpag(String npag) {
		this.npag = npag;
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", npag=" + npag + "]";
	}
	
}