package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Carlos da Silva", "carlos@gmaill.com");
		Pessoa p2 = new Pessoa(1, "Joaquim Torres", "joaquim@gmaill.com");
		Pessoa p3 = new Pessoa(1, "Ana Maria", "ana@gmaill.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		

	}

}
