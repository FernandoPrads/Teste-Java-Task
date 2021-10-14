package com.example.service;

public class TASK1Service {

	public boolean ehPolindromo(String nome) {

		String str = nome;
		String reverseStr = "";

		int strLength = str.length();

		//faz a leitura da String, e de forma revesa
		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		//faz a comparação das leituras e define o resultado
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			return true;
		}
		return false;
	}

}
