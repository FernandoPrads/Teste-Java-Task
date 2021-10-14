package com.example.service;

import java.util.List;

public class TASK2Service {

	public void mostraList(List<String> list) {

		for (int i = 0; i < list.size(); i++) {

			//faz a leitura da lista com os seus nomes e a posição de cada um
			System.out.println("ATUAL: " + list.get(i));

			if (i - 1 >= 0) {
				System.out.println("ANTERIOR: " + list.get(i - 1));
			}

			if (i + 1 < list.size()) {
				System.out.println("PROXIMO: " + list.get(i + 1));
			}

			System.out.println("----------------");
		}

	}
	
	//define o item que esta no meio da lista e o remove
	public void removeItemMeio(List<String> list) {
		int indexMedia = list.size() / 2;
		list.remove(indexMedia);
	}
}
