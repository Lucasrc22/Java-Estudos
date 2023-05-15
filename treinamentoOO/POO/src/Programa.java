import java.util.*;
public class Programa{
	static ArrayList<Livro> livros = new ArrayList<>();
	public static void main(String[] args){
		try{
			Livro livro1 = new Livro("Dragonball", 1994);
			cadastrarLivro(livro1);
			System.out.print("Novo tamanho da lista de livros: ");
			System.out.println(livros.size());
		} catch(NullPointerException exception){
			System.out.println("Valor nulo encontrado");
		} finally{
			System.out.println("Até logo");
		}
	}
	
	static void cadastrarLivro(Livro novoLivro){
		if(novoLivro.getTitulo().equals("")){
			System.out.println("Livro sem titulo não é perimitido");
		}else{
			livros.add(novoLivro);
		}
	}
}
