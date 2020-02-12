package br.com.codenation.paymentmethods;

public class Cash implements PriceStrategy {
	
	final static private Double PERCENT = 90.0;

	@Override
	public Double calculate(Double price) {
		return price * (PERCENT/100);
	}
}