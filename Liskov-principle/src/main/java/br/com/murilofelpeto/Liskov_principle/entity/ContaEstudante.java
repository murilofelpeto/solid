package br.com.murilofelpeto.Liskov_principle.entity;

public class ContaEstudante {

	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaEstudante() {
		manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return this.milhas;
	}

	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
