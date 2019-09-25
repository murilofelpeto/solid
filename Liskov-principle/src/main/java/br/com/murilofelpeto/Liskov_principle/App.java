package br.com.murilofelpeto.Liskov_principle;

import java.util.ArrayList;
import java.util.List;

import br.com.murilofelpeto.Liskov_principle.entity.ContaComum;

public class App {
	public static void main(String[] args) {
		List<ContaComum> contasDoBanco = new ArrayList<>();
		for (ContaComum conta : contasDoBanco) {
			conta.rende();

			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}
	}
}
