package br.org.fundatec.lp3.designpatterns.factory;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

import br.org.fundatec.lp3.designpatterns.App;
import br.org.fundatec.lp3.designpatterns.MontaPrimeiraArma;
import br.org.fundatec.lp3.designpatterns.MontaSegundaArma;
import br.org.fundatec.lp3.designpatterns.Personagem;
import br.org.fundatec.lp3.designpatterns.TipoPersonagem;

/**
 * Unit test for simple App.
 */
public class AppTest {
   
    
    public  Personagem personagem;
	TipoPersonagem tipo;
	MontaPrimeiraArma primeiraArma;
	MontaSegundaArma segundaArma;
	Scanner scanner = new Scanner(System.in);
	App app = new App();
	
	
	@Test
	public void testaAtaque() throws Exception {
		int primeiraOpcaoArmaPrimeiroJogador = 1;
		int segundaOpcaoArmaPrimeiroJogador = 2;
		int primeiraOpcaoArmaSegundoJogador = 3;
		int segundaOpcaoArmaSegundoJogador = 1;
		
		int primeiroJogador = 1;
		int segundoJogador = 2;
		
		
		Personagem personagem1 = app.montaPersonagem(primeiroJogador);
		
		
		Personagem personagem2 = app.montaPersonagem(segundoJogador);
		
		personagem1.atacar(personagem2);
		
		assertEquals(1,personagem1.getTipoPersonagem());
		
	}
}
