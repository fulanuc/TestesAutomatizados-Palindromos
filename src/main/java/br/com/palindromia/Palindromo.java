package br.com.palindromia;
public class Palindromo {
  public boolean isPalindromo(String phrase) {
	  if( phrase.isEmpty() ) {
		  return false;
	  }
	  
    String filteredPhrase = phrase.toUpperCase().replace(" ", "").replace("-", "");
    for(int i = 0; i < filteredPhrase.length(); i++) {
      if(filteredPhrase.charAt(i) != filteredPhrase.charAt(filteredPhrase.length() -i - 1)) {
        return false;
      }
    }
    
    return true;
  }
}