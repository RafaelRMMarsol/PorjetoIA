package buscas;

import problemas.*;

public class AprofundamentoIterativo {
	
	public int profundidade = 0;
	Problemas problema;
	
	public void DFS_aprof_iter (Problemas problema) {
		
		ProfundidadeLimitada agente = new ProfundidadeLimitada();
		
		agente.problema = problema;
		agente.buscaEmProfundidadeLimitada(problema, this.profundidade);
		
		boolean encontrou = agente.encontrou;
		
		while (!encontrou) {
			
			System.out.println("\n######################\n");
			ProfundidadeLimitada bAux = new ProfundidadeLimitada();
			bAux.buscaEmProfundidadeLimitada(problema, ++this.profundidade);
			encontrou = bAux.encontrou;
			System.gc(); // Executando o Garbage Collector
		}
	}
	
	/*
	 * public static void main (String[] args) {
	 * 
	 * AprofundamentoIterativo agente = new BuscaAprofundamentoIterativo();
	 * ProblemaMapaRomenia problema = new ProblemaMapaRomenia("Oradea", "Iasi");
	 * 
	 * agente.DFS_aprof_iter(problema);
	 * 
	 * }
	 */
}
