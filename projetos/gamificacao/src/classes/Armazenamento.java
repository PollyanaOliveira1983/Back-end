package classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
	

	public class Armazenamento {
		ArrayList <Usuario> usuarios = new ArrayList<Usuario>();
		
		public void gerarArquivo(String nomeArquivo) throws IOException {
			FileWriter fw = new FileWriter(nomeArquivo);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("Pontuação:\r\n");
			//pw.println("Usuário\t\tTipo\t\tPontos");
			pw.printf("\tUsuario \t   Tipo \t pontos\r\n");
			pw.println("-----------------------------------------------------");
			for(Usuario u : usuarios){
				getUsuarioTipoPonto(pw, u);
			}
			pw.println("-----------------------------------------------------");
			fw.close();
			
			
		}

		public String lerArquivo(String nomeArquivo) throws IOException {
			FileReader fr = new FileReader(nomeArquivo);
			BufferedReader br = new BufferedReader(fr);
			String texto;
			texto = br.readLine();
			br.close();
			
			return texto;
		}

		public void adicionaUsuario(Usuario user){
			usuarios.add(user);
		}
		
		public void adicionarPonto(String usuario, int ponto, String tipo) {
			Usuario user = getUsuario(usuario);
			user.adicionaTipo(tipo, ponto);
		}

		public int getQuantidadeTipo(String usuario, String tipo) {
			Usuario user = getUsuario(usuario);
			return user.getPontos(tipo);
		}

		public Usuario getUsuario(String nome) {
			for(Usuario user : usuarios){
				if(user.getNome() == nome)
					return user;
			}
			return null;
		}

		public String usuariosQueReceberamPontos() {
			String nomes = "";
			for(Usuario user : usuarios){
				if(user.isTipos()){
					nomes = nomes + user.getNome() + ";";
				}
			}
			return nomes;
		}
		
		public void getUsuariosSplit(PrintWriter pw){
			String s = usuariosQueReceberamPontos();
			String[] nomes = s.split(";");
			for(String n : nomes){
				pw.println("- " + n);
			}
		}
		
		public String pontosRegistrados(String nome) {
			Usuario user = getUsuario(nome);
			return user.getTipos();
			
		}

			public void getUsuarioTipoPonto(PrintWriter pw, Usuario user){
				String s = user.getTipos();
				String[] nomes = s.split(";");
				for(String n : nomes){
					//pw.println(user.getNome() + "\t\t" + n + "\t\t" + user.getPontos(n));
					pw.printf("%15s %15s %15d\r\n", user.getNome(), n, user.getPontos(n));
				}
			}
		

}
