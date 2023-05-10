
public class Programa{
	public static void main(String[] args){
		Livro pub = new Livro("Dragon Ball", 1994);
		pub.addNomeAutor("Machado de Assis");
		System.out.println(pub.getResponsavel());
		
	}	
}
