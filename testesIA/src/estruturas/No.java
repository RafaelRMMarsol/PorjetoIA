package estruturas;


public class No {
	
	/* Nao ha encapsulamento para alcancar certa semelhance com o livro */
	
	public Estado estado;
	public Estado acao;
	public No pai;
	public Integer profundidade;
	public Integer custoCaminho;
	
	public No(Estado estado) {
		super();
		this.estado = estado;
		/* Os outros campos s�o inicializados com valor nil */
	}
	
		
}
