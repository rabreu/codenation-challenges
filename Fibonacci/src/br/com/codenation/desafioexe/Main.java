package br.com.codenation.desafioexe;

public class Main {

	public static void main(String[] args) {
		for( int i = 0; i < DesafioApplication.fibonacci().size() ; i++ ) 
			System.out.printf("Posição %d: %d\n", i+1, DesafioApplication.fibonacci().get(i));

//		System.out.println(fibonacci().indexOf(3)+1);
		
		System.out.println(DesafioApplication.isFibonacci(3));
	}

}
