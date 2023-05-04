
import java.util.*;
public class Programa{
	private static List<Livro> livros= new ArrayList<>();
	public static void main(String[] args){
		Object object = new Object();
		object.toString();

		Livro livro = new Livro("Dom Casmurro", 1899);
		livro.addObs("Observação sem data");
		livro.addObs("outra observação, agora com data", 22, 10, 2000);
		System.out.println(livro.toString());;
	}
	public static void cadastrarLivro(String titulo, String autor){
		Livro novoLivro = new Livro(titulo, 0);
		novoLivro.addNomeAutor(autor);
		livros.add(novoLivro);
	}

	public static void cadastrarLivro(String titulo, int ano){
		Livro novoLivro = new Livro(titulo, ano);
		livros.add(novoLivro);
	}
}
