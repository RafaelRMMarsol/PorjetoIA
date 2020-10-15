package buscas;

import estruturas.*;
import problemas.*;
import java.util.LinkedList;

public interface Busca {


	public LinkedList<No> buscar(Problemas problema, Estado estadoInicial);

	public LinkedList<No> expandir(No no);

	public void mostrarCaminho();

	public LinkedList<No> getBorda();

	public LinkedList<No> getHistorico();
	
}
