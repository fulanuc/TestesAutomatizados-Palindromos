package br.com.palindromia;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.palindromia.Palindromo;

public class PalindromoTest {

	@Test
	public void test() {
		Palindromo palindromo = new Palindromo();
		
		String text1 = "Socorram-me subi no onibus em Marrocos";
		String text2 = "Anotaram a data da maratona";
		String textCharacter = "A";
		String textVoid = "";
		String textNaoPalindromo = "GirafariGue";
		
		assertTrue(palindromo.isPalindromo(text1));
		assertTrue(palindromo.isPalindromo(text2));
		assertTrue(palindromo.isPalindromo(textCharacter));
		assertFalse(palindromo.isPalindromo(textVoid));
		assertFalse(palindromo.isPalindromo(textNaoPalindromo));
	}

}