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
		} catch(NegocioBibliotecaException exception){
			System.out.println("Erro ao executar o código"+exception.getMessage());
		} finally{
			System.out.println("Até logo");
		}
	}
	
	static void cadastrarLivro(Livro novoLivro) throws NegocioBibliotecaException{
		if(novoLivro == null){
			throw new IllegalArgumentException("É necessário informar um livro");
		}
		if(novoLivro.getTitulo().equals("")){
			throw new NegocioBibliotecaException("Título do livro não pode ser vazio");
		}else{
			livros.add(novoLivro);
		}
	}
}
