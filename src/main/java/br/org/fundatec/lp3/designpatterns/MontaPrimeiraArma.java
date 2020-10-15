package br.org.fundatec.lp3.designpatterns;

import br.org.fundatec.lp3.designpatterns.arma.ArcoEFlecha;
import br.org.fundatec.lp3.designpatterns.arma.EspadaElfo;
import br.org.fundatec.lp3.designpatterns.arma.Machado;
import br.org.fundatec.lp3.designpatterns.arma.Martelo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalDuplo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalElfo;
import br.org.fundatec.lp3.designpatterns.arma.PunhalOrc;

public class MontaPrimeiraArma extends MontaArma {
	
	public TipoArma primeiraArma(Personagem personagem,int primeiraArma) throws Exception {
		
		TipoArma tipoPrimeiraArma = montaArma(personagem, primeiraArma);
		if (personagem.getTipoPersonagem().equals(TipoPersonagem.ELFO)) {

			if (tipoPrimeiraArma.equals(TipoArma.ARCOEFLECHA)) {
				personagem.setPrimeiraArma(new ArcoEFlecha());
			} else if (tipoPrimeiraArma.equals(TipoArma.ESPADA)) {
				personagem.setPrimeiraArma(new EspadaElfo());
			} else if (tipoPrimeiraArma.equals(TipoArma.PUNHAL)) {
				personagem.setPrimeiraArma(new PunhalElfo());
			} else if (tipoPrimeiraArma.equals(TipoArma.PUNHALDUPLO)) {
				personagem.setPrimeiraArma(new PunhalDuplo());
			}
		} else if (personagem.getTipoPersonagem().equals(TipoPersonagem.ORC)) {

			if (tipoPrimeiraArma.equals(TipoArma.MACHADO)) {
				personagem.setPrimeiraArma(new Machado());
			} else if (tipoPrimeiraArma.equals(TipoArma.MARTELO)) {
				personagem.setPrimeiraArma(new Martelo());
			} else if (tipoPrimeiraArma.equals(TipoArma.PUNHAL)) {
				personagem.setPrimeiraArma(new PunhalOrc());
			} else if (tipoPrimeiraArma.equals(TipoArma.ESPADA)) {
				personagem.setPrimeiraArma(new PunhalDuplo());
			}

		}
		return personagem.getPrimeiraArma().getTipoArma();
	}
	
}
