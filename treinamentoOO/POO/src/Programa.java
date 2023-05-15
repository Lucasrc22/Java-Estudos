import java.util.*;
public class Programa{
	static ArrayList<Livro> livros = new ArrayList<>();
	public static void main(String[] args){
		try{
			Livro livro1 = new Livro("Dragonball", 1994);
			livro1.setTitulo(livro1.titulo);
			cadastrarLivro(livro1);
			System.out.println("Seu livro: "+livro1);
			System.out.print("Novo tamanho da lista de livros: ");
			System.out.println(livros.size());
		} catch(Exception exception){
			System.out.println("Erro ao executar o código"+exception.getMessage());
		} finally{
			System.out.println("Até logo");
		}
	}
	
	static void cadastrarLivro(Livro novoLivro) throws Exception{
		if(novoLivro == null){
			throw new IllegalArgumentException("É necessário informar um livro");
		}
		if(novoLivro.getTitulo().equals("")){
			throw new Exception("Livro deve ter um título não-vazio");
		}else{
			livros.add(novoLivro);
		}
	}
}
