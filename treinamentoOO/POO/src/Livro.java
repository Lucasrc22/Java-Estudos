import java.util.ArrayList;

public class Livro extends Publicacao{
	private ArrayList<String> autores;

	Livro(String titulo, int anoPub){
		this.autores = new ArrayList<>();
		this.observacoes = "";
		this.titulo = titulo;
		this.anoPub = anoPub;
	}
	Livro(String titulo, int anoPub, boolean estaEmprestado){
		this(titulo,anoPub);
		this.estaEmprestado = estaEmprestado;
	}
	public void addNomeAutor(String nomeAutor){
		autores.add(nomeAutor);
	}
	public String gerarReferencia(){
		String linhaAutores = String.join(";", autores);
		String referenciaPub = super.gerarReferencia();
		return linhaAutores + ",  "+ referenciaPub;
	}
}