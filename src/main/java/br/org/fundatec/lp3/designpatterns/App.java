package br.org.fundatec.lp3.designpatterns;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {

		App app = new App();

		Scanner scanner = new Scanner(System.in);
		int opcaoPersonagemUm;
		int opcaoPersonagemDois;
		
		System.out.println("|-- Batalha de personagens --|");
		System.out.println("> Escolha o primeiro personagem: 1 - Elfo 2 - Orc");
		Personagem personagem1 = app.montaPersonagem(opcaoPersonagemUm = scanner.nextInt());
		System.out.println("> Escolha o segundo personagem: 1 - Elfo 2 - Orc");
		Personagem personagem2 = app.montaPersonagem(opcaoPersonagemDois = scanner.nextInt());
		
		
		int turno = 1;
		Personagem atacante = personagem1;
		Personagem atacado = personagem2;
		int dano;
		
		do {
			imprimirPlacar(personagem1, personagem2);
			dano = atacante.atacar(atacado);
			imprimirMensagemDeAtaque(atacante, atacado, dano);

			if (turno == 1) {
				atacante = personagem2;
				atacado = personagem1;
				turno = 2;
			} else {
				atacante = personagem1;
				atacado = personagem2;
				turno = 1;
			}
		}
			while  (personagem1.getVida() > 0 && personagem2.getVida() > 0);
				imprimirPlacar(personagem1, personagem2);
				
			if (personagem1.getVida() > 0) {
				System.out.println(personagem1.getTipoPersonagem().name() + " venceu!");
			} else {
				System.out.println(personagem2.getTipoPersonagem().name() + " venceu!");
			}
		}
		

	private static void imprimirMensagemDeAtaque(Personagem atacante, Personagem atacado, int dano) {
		
		System.out.println(String.format(
			"> %s ataca %s com %s! Dano: %d",
			atacante.getTipoPersonagem().name(),
			atacado.getTipoPersonagem().name(),
			atacante.getUltimaArma().toString(),
			dano
		
		));
	}

	private static void imprimirPlacar(Personagem personagem1, Personagem personagem2) {
		System.out.println(String.format(
			"> %s %d x %d %s",
			personagem1.getTipoPersonagem().name(),
			personagem1.getVida(),
			personagem2.getVida(),
			personagem2.getTipoPersonagem().name()
		));
		
	}
	
	public Personagem montaPersonagem(int opcaoPersonagem) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Personagem personagem;
		
		System.out.print("> ");
		
		if (opcaoPersonagem == TipoPersonagem.ELFO.getOpcao()) {
			personagem = new Elfo();
		} else if (opcaoPersonagem == TipoPersonagem.ORC.getOpcao()) {
			personagem = new Orc();
		} else {
			return null;
		}
		
		System.out.println("> Primeira Arma: " + personagem.armasDisponiveis);
		
		MontaPrimeiraArma primeiraArma = new MontaPrimeiraArma();
		int opcaoArma; 
		primeiraArma.primeiraArma(personagem, opcaoArma = scanner.nextInt());
		//primeiraArma.montaArma(personagem, opcaoArma = scanner.nextInt());
	
		

		System.out.println("> Segunda Arma: " + personagem.armasDisponiveis);
		MontaSegundaArma segundaArma = new MontaSegundaArma();
		segundaArma.segundaArma(personagem, opcaoArma = scanner.nextInt());
		//segundaArma.montaArma(personagem, opcaoArma = scanner.nextInt());
		
		return personagem;
		
		}

	
}