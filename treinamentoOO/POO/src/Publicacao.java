public abstract class Publicacao implements Referenciavel {
    protected String titulo;
	protected int anoPub;
	protected boolean estaEmprestado;
	protected String cpfUsuarioEmp;
	protected String observacoes;

    public String gerarReferencia(){
		String resultado = this.titulo +" ( "+this.anoPub+ " ) ";
		return resultado;
	}
	public String toString(){
		return gerarReferencia();
	}
	public void addObs(String novaObs){
		observacoes = observacoes + "\n"+ novaObs;
	}

	public void addObs(String novaObs, int dia, int mes, int ano){
		String linhaObs = dia +"/"+mes+"/"+ano;
		addObs(linhaObs);
	}

	public String getObs(){
		return this.observacoes;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public int getAnoPub(){
		return anoPub;
	}
	public void setAnoPub(int anoPub){
		this.anoPub = anoPub;
    }
    public void emprestar(String cpf){
		if(!estaEmprestado){
			this.cpfUsuarioEmp = cpf;
			this.estaEmprestado = true;
		} else{
			System.out.println("Livro está emprestado");
		}
	}
}
