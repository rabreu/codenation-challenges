package br.com.codenation.paymentmethods;

public class CreditCard implements PriceStrategy {
	
	final static private Double PERCENT = 98.0;

	@Override
	public Double calculate(Double price) {
		return price * (PERCENT/100);
	}

}
