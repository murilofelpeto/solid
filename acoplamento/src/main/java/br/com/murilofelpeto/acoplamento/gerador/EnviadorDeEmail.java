package br.com.murilofelpeto.acoplamento.gerador;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Email enviado");

	}

}
