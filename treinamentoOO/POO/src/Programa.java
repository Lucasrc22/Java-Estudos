
public class Programa{
	public static void main(String[] args){
		Livro pub = new Livro("Dom Casmurro", 1899);
		pub.addNomeAutor("Machado de Assis");
		System.out.println(pub.toString());
		
	}	
}
