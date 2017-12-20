package pl.poznan.put.cs.si.puttalky;

import java.util.HashSet;
import java.util.Set;

import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResultsRow;



/** Author: agalawrynowicz<br>
 * Date: 19-Dec-2016 */

public class Zamowienie {
	
	private String ciasto;
	private Set<String> dodatki;
	private int iloscDodatkow;
	private Pizza pizza;

	
	public Zamowienie(){

	}
	

	public void powitanie()
	{
		System.out.println("Witaj, nazywam sie Puttalky. Pomoge Tobie zamowic pizze.");
	}
	
	public void pozegnanie()
	{
		System.out.println("Dziekuje za skorzystanie z moich uslug. \n zycze smacznego!\n");
	}
	
	public String getCiasto()
	{
		return this.ciasto;
	}
	public void setCiasto(String ciasto)
	{
		this.ciasto=ciasto;
	}

	public Pizza getPizza()
	{
		return this.pizza;
	}
	public void setPizza(Pizza pizza)
	{
		this.pizza=pizza;
	}
	
	public int getIloscDodatkow()
	{
		return this.iloscDodatkow;
	}
	public void setIloscDodatkow(int iloscDodatkow)
	{
		this.iloscDodatkow=iloscDodatkow;
	}
	
	public Set<String> getDodatki(){

		return this.dodatki;
	}
	
	public void setDodatki(Set<String> dodatki)
	{
		this.dodatki=dodatki;
	}
	
}
