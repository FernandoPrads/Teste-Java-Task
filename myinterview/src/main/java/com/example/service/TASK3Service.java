package com.example.service;

import java.util.List;

public class TASK3Service {
	
		//faz a leitura dos itens da lista e define cada item
		public int retornaItensDestintos(List<String> lista) {
			return (int) lista.stream().distinct().count();
		}
	
}
