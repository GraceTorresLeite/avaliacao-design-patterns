package br.org.fundatec.lp3.designpatterns;

import java.util.List;

public class MontaArma {

	public TipoArma montaArma(Personagem personagem, int opcaoArma) throws Exception {
	
		List<TipoArma> tiposDeArmaDisponiveis = personagem.tiposDeArmaDisponiveis();

		for (TipoArma tipoArma : tiposDeArmaDisponiveis) {
			System.out.println(tipoArma.getOpcao() + " - " + tipoArma.getTitulo() + " ");
		}

		System.out.print("> ");
		
		TipoArma tipoArma = TipoArma.buscaPorOpcao(opcaoArma);

		if (tipoArma == null) {
			throw new Exception("Opcao de arma invalida");
		}

		return tipoArma;

	}

}
