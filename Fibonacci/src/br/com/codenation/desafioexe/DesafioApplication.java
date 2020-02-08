package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	
	public static List<Integer> fibonacci() {
		List<Integer> fib = new ArrayList<Integer>();
		fib.add(0);
		fib.add(1);
		
		for (int i = 2; fib.get(i-1) < 350 ; i++)
			fib.add(fib.get(i-1)+fib.get(i-2));
				
		return fib;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}
}
