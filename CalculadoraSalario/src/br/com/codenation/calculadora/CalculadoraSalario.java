package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public static void main(String[] args) {
		System.out.print(calcularSalarioLiquido(100000));
	}
	
	public static int calcularSalarioLiquido(double salarioBase) {
		if (salarioBase < 1032)
			return 0;
		
		double valorINSS = calcularINSS(salarioBase);
				
		if (salarioBase - valorINSS <= 3000)
			return (int) Math.round(salarioBase-valorINSS);
		else
			return (int) Math.round(salarioBase-valorINSS-calcularIRPF(salarioBase,valorINSS));
	}
	
	private static double calcularINSS(double salarioBase) {
		if (salarioBase <= 1500) 	
			return (salarioBase*8)/100;
		else if (salarioBase  > 1500 & salarioBase <= 4000) 
			return (salarioBase*9)/100;
		else
			return (salarioBase*11)/100;
	}
	
	private static double calcularIRPF(double salarioBase, double valorINSS) {
		if (salarioBase-valorINSS <= 3000)
			return 0;
		else if (salarioBase-valorINSS  > 3000 & salarioBase-valorINSS <= 6000)
			return ((salarioBase-valorINSS)*7.5)/100;
		else
			return ((salarioBase-valorINSS)*15)/100;	
	}
}
