package br.org.fundatec.lp3.designpatterns;

public enum TipoArma {

	PUNHAL(1, "Punhal"),
	ESPADA(2, "Espada"),
	MACHADO(3, "Machado"),
	MARTELO(4, "Martelo"),
	ARCOEFLECHA(5, "Arco e flecha"),
	PUNHALDUPLO(6, "Punhal Duplo");

	private int opcao;
	private String titulo;

	TipoArma(int opcao, String title) {
		this.opcao = opcao;
		this.titulo = title;
	}

	public int getOpcao() {
		return opcao;
	}

	public String getTitulo() {
		return titulo;
	}

	public static TipoArma buscaPorOpcao(int opcao) {
		
		for (TipoArma tipoArma : values()) {
			if (tipoArma.getOpcao() == opcao) {
				return tipoArma;
			}
		}
		return null;

	}

	@Override
	public String toString() {
		return opcao + " " + titulo;
	}

}
