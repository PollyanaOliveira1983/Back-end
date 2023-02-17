package testes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import classes.Armazenamento;
import classes.Usuario;

public class TesteArmazenamento {

	private PrintWriter pw;
	private Armazenamento arm;
	private FileWriter fw;
	private FileReader fr;
	private BufferedReader br;
	
	@Before
	public void inicializacao() throws IOException{
		arm = new Armazenamento();
		Usuario user = new Usuario("Guerra");
		Usuario user2 = new Usuario("Fernandes");
		arm.adicionaUsuario(user);
		arm.adicionaUsuario(user2);
	}
	
	@Test
	public void testAdicionarPontoMoeda() throws IOException{
		arm.adicionarPonto("Guerra", 10, "Moeda");
		assertEquals(arm.getQuantidadeTipo("Guerra", "Moeda"), 10);
	}
	
	@Test
	public void testAdicionarPontosMoeda2() throws IOException{
		arm.adicionarPonto("Guerra", 10, "Moeda");
		arm.adicionarPonto("Guerra", 30, "Moeda");
		assertEquals(arm.getQuantidadeTipo("Guerra", "Moeda"), 40);
	}
	
	@Test
	public void testAdicionarPontoEstrela() throws IOException{
		arm.adicionarPonto("Guerra", 15, "Estrela");
		arm.adicionarPonto("Guerra", 10, "Moeda");
		arm.adicionarPonto("Guerra", 40, "Estrela");
		assertEquals(arm.getQuantidadeTipo("Guerra", "Estrela"), 55);
		assertEquals(arm.getQuantidadeTipo("Guerra", "Moeda"), 10);
	}
	
	@Test
	public void testAdicionarPontosDoisUsuarios() throws IOException{
		arm.adicionarPonto("Guerra", 10, "Moeda");
		arm.adicionarPonto("Fernandes", 30, "Estrela");
		assertEquals(arm.getQuantidadeTipo("Guerra", "Moeda"), 10);
		assertEquals(arm.getQuantidadeTipo("Fernandes", "Estrela"), 30);
		arm.adicionarPonto("Guerra", 15, "Moeda");
		arm.adicionarPonto("Fernandes", 50, "Moeda");
		assertEquals(arm.getQuantidadeTipo("Guerra", "Moeda"), 25);
		assertEquals(arm.getQuantidadeTipo("Fernandes", "Moeda"), 50);
	}
	
	@Test
	public void testUsuariosQueJaReceberamPontos(){
		arm.adicionarPonto("Guerra", 10, "Moeda");
		assertEquals(arm.usuariosQueReceberamPontos(), "Guerra;");
		arm.adicionarPonto("Fernandes", 15, "Estrela");
		assertEquals(arm.usuariosQueReceberamPontos(), "Guerra;Fernandes;");
	}
	
	@Test 
	public void testPontosRegistrados(){
		arm.adicionarPonto("Guerra", 10, "Moeda");
		assertEquals(arm.pontosRegistrados("Guerra"), "Moeda;");
		arm.adicionarPonto("Guerra", 20, "Moeda");
		assertEquals(arm.pontosRegistrados("Guerra"), "Moeda;");
		arm.adicionarPonto("Guerra", 20, "Estrela");
		assertEquals(arm.pontosRegistrados("Guerra"), "Moeda;Estrela;");
		
	}
	
	@Test
	public void testGerarArquivo() throws IOException{
		arm.adicionarPonto("Guerra", 10, "Moeda");
		arm.adicionarPonto("Guerra", 20, "Moeda");
		arm.adicionarPonto("Guerra", 20, "Estrela");
		arm.adicionarPonto("Fernandes", 50, "Estrela");

		arm.gerarArquivo("teste.txt");
	}
	/*@Test
	public void testEscritaArquivo() throws IOException { 
		List<String> actual = new ArrayList<String>();
		List<String> expected = new ArrayList<String>();
		arm.gerarArquivo("teste.txt");
		
		FileReader fr = new FileReader("teste.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(br.ready()){
			actual.add(br.readLine());
		}
		fr = new FileReader("expected.txt");
		br = new BufferedReader(fr);
		
		while(br.ready()){
			expected.add(br.readLine());
		}
		
		assertTrue(expected.equals(actual));

		br.close();

	}*/
	

}
