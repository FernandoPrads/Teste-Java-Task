package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.service.TASK2Service;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 * 
 */
public class TASK2 {
	public static class LinkedTeste {

		public static void main(String[] args) {
			
			//instancia da classe de regras
			TASK2Service service = new TASK2Service();

			// lista de nomes
			List<String> list = new ArrayList<String>();
			list.add("Guilherme");
			list.add("Noah");
			list.add("Barbara");

			// lista inteira, mostrando itens ANTERIOR e DEPOIS
			System.out.println("--------LIST INTEIRA------");
			service.mostraList(list);
			
			//método que remove o item do meio
			service.removeItemMeio(list);

			// lista inteira, após remover o item do meio
			System.out.println("--------LIST APOS RETIRAR O DO MEIO------");
			service.mostraList(list);
		}

	}
}
