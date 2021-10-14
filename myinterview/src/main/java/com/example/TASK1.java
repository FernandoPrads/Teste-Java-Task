package com.example;

import com.example.service.TASK1Service;

/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {

	public static void main(String[] args) {

		//instancia da classe de regras
		TASK1Service service = new TASK1Service();
		String nome = "racecar";

		//imprime na tela 
		System.out.println(nome + ": essa String é um palindromo?    " + service.ehPolindromo(nome));

	}
}
