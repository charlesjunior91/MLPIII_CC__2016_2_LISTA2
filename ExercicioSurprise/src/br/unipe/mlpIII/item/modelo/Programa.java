package br.unipe.mlpIII.item.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
	public static void main(String args[]) {

		Item item1 = new Item(5, "Item1", 500.00);
		Item item2 = new Item(15, "Item2", 1500.00);
		Item item3 = new Item(1, "Item3", 100.00);
		Item item4 = new Item(4, "Item4", 400.00);

		List<Item> listaDeItens = new ArrayList<Item>();

		listaDeItens.add(item1);
		listaDeItens.add(item2);
		listaDeItens.add(item3);
		listaDeItens.add(item4);

		Collections.sort(listaDeItens);

		System.out.println("Ordenação crescente: " + listaDeItens);

		Collections.reverse(listaDeItens);

		System.out.println("Ordenação decrescente: " + listaDeItens);
	}
}
