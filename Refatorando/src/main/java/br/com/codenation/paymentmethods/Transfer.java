package br.com.codenation.paymentmethods;

public class Transfer implements PriceStrategy {
	
	final static private Double PERCENT = 92.0;

	@Override
	public Double calculate(Double price) {
		return price * (PERCENT/100);
	}

}
