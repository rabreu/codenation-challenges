package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {
	
	final static private Double PERCENT = 95.0;

	@Override
	public Double calculate(Double price) {
		return price * (PERCENT/100);
	}

}
