package br.com.murilofelpeto.SRP.enums;

import br.com.murilofelpeto.SRP.calculos.DezOuVintePorCento;
import br.com.murilofelpeto.SRP.calculos.QuinzeOuVinteECincoPorCento;
import br.com.murilofelpeto.SRP.calculos.RegraDeCalculo;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteECincoPorCento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
