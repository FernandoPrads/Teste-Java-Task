package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.service.TASK3Service;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {
	public static void main(String[] args) {
		
		//instancia da classe de regras
		TASK3Service service = new TASK3Service();
		
		//criação de uma lista de nomes
		List<String> listNomes = new ArrayList<String>();
		listNomes.add("Barbara");
		listNomes.add("Barbara");
		listNomes.add("Guilherme");
		listNomes.add("Barbara");
		listNomes.add("Barbara");
		listNomes.add("Guilherme");
		listNomes.add("Noah");
		listNomes.add("Noah");
		listNomes.add("Noah");
		listNomes.add("Guilherme");
		listNomes.add("Guilherme");
		listNomes.add("Noah");
		listNomes.add("Barbara");

		//imprime na tela o resultado
		System.out.println("Existem " + service.retornaItensDestintos(listNomes) + " tipos de nomes distintos na lista");
	}
}
