import java.util.*;

public class Programa{
	public static void main(String[] args){
		Object minhaPublicacao = new Livro("Dom Casmurro", 1899);

		

		System.out.println(((Livro)minhaPublicacao).gerarReferencia());
		
	}	
}
