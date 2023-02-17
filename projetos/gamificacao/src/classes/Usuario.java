package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Usuario {
	private String nome;
	private Map<String, Integer> tipos = new HashMap<String, Integer>();
	
	public Usuario(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void adicionaTipo(String tipo, int ponto){
		tipos.put(tipo, this.getPontos(tipo) + ponto);
	}
	
	public int getPontos(String tipo){
		if(tipos.containsKey(tipo)){
			return tipos.get(tipo);
		}
		return 0;
	}
	
	public boolean isTipos(){
		if(tipos.isEmpty()){
			return false;
		}
		return true;
	}
	
	public String getTipos(){
		String s = "";
		Set<String> chaves = tipos.keySet();
		for(String chave : chaves){
			if(chave != null)
				s += chave + ";";
		}
		
		return s;
	}
}
