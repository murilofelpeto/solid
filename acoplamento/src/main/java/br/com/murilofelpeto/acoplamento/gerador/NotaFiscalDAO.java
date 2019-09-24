package br.com.murilofelpeto.acoplamento.gerador;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Salvou no banco!");		
	}

}
