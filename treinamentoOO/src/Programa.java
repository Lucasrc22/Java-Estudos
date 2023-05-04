

public class Programa{
	public static void main(String[] args) {
		Livro meuNovoLivro = new Livro("Harry Potter", 1999);
		String referenciaLivro = meuNovoLivro.gerarReferencia();

		System.out.println(referenciaLivro);
		
		
		if(meuNovoLivro.estaEmprestado) {
			System.out.println("O livro es´ta emprestado");
		}
	}
}
