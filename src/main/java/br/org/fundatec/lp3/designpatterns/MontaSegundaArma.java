package br.org.fundatec.lp3.designpatterns;

import br.org.fundatec.lp3.designpatterns.arma.ArcoEFlecha;
import br.org.fundatec.lp3.designpatterns.arma.EspadaElfo;
import br.org.fundatec.lp3.designpatterns.arma.Machado;
import br.org.fundatec.lp3.designpatterns.arma.Martelo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalDuplo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalElfo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalOrc;

public class MontaSegundaArma extends MontaArma {
	
	public TipoArma segundaArma(Personagem personagem,int segundaArma) throws Exception {
		
		TipoArma tipoSegundaArma = montaArma(personagem, segundaArma);

		if (personagem.getTipoPersonagem().equals(TipoPersonagem.ELFO)) {

			if (tipoSegundaArma.equals(TipoArma.ARCOEFLECHA)) {
				personagem.setSegundaArma(new ArcoEFlecha());
			} else if (tipoSegundaArma.equals(TipoArma.ESPADA)) {
				personagem.setSegundaArma(new EspadaElfo());
			} else if (tipoSegundaArma.equals(TipoArma.PUNHAL)) {
				personagem.setSegundaArma(new PunhalElfo());
			} else if (tipoSegundaArma.equals(TipoArma.PUNHALDUPLO)) {
				personagem.setSegundaArma(new PunhalDuplo());
			}

		} else if (personagem.getTipoPersonagem().equals(TipoPersonagem.ORC)) {

			if (tipoSegundaArma.equals(TipoArma.MACHADO)) {
				personagem.setSegundaArma(new Machado());
			} else if (tipoSegundaArma.equals(TipoArma.MARTELO)) {
				personagem.setSegundaArma(new Martelo());
			} else if (tipoSegundaArma.equals(TipoArma.PUNHAL)) {
				personagem.setSegundaArma(new PunhalOrc());
			} else if (tipoSegundaArma.equals(TipoArma.ESPADA)) {
				personagem.setSegundaArma(new PunhalDuplo());
			}

		}

		return personagem.getSegundaArma().getTipoArma();

	}

}
