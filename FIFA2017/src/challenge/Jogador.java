package challenge;

import java.util.Date;

public class Jogador {
	String full_name;
	Date bith_date;
	Double eur_wage;
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public Date getBith_date() {
		return bith_date;
	}
	public void setBith_date(Date bith_date) {
		this.bith_date = bith_date;
	}
	public Double getEur_wage() {
		return eur_wage;
	}
	public void setEur_wage(double d) {
		this.eur_wage = d;
	}
	public Jogador() {

		
	}

}
