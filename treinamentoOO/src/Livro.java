public class Livro{
	String titulo;
	String[] autores;
	int anoPub;
	boolean estaEmprestado;
	
	Livro(String titulo, int anoPub){
		this.titulo = titulo;
		this.anoPub = anoPub;
	}
	Livro(String titulo, int anoPub, boolean estaEmprestado){
		this(titulo, anoPub);
		this.estaEmprestado = estaEmprestado;
	}
	public String gerarReferencia() {
		String resultado = this.titulo+ " ("+this.anoPub+ ")";
		return resultado;
	}
}