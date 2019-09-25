package br.com.murilofelpeto.OCP_DIP.calculadora;

import br.com.murilofelpeto.OCP_DIP.entity.Compra;
import br.com.murilofelpeto.OCP_DIP.frete.ServicoDeEntrega;
import br.com.murilofelpeto.OCP_DIP.precos.TabelaDePreco;

public class CalculadoraDePrecos {

	private TabelaDePreco tabela;
	private ServicoDeEntrega entrega;

	public CalculadoraDePrecos(TabelaDePreco tabela, ServicoDeEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}

	public double calcula(Compra produto) {
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
