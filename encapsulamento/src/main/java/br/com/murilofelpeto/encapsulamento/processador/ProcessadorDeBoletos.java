package br.com.murilofelpeto.encapsulamento.processador;

import java.util.List;

import br.com.murilofelpeto.encapsulamento.entity.Boleto;
import br.com.murilofelpeto.encapsulamento.entity.Fatura;
import br.com.murilofelpeto.encapsulamento.entity.Pagamento;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
			fatura.adicionaPagamento(pagamento);
		}
	}

}
