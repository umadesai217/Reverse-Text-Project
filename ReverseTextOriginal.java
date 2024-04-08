// Uma Desai
// COMP 182
// 1/29/24
// Project 01: ReverseTextOriginal

// The following are not used and hence commented:
//import java.util.Arrays;
//import java.util.Scanner;

public class ReverseTextOriginal {

    // DO NOT MODIFY main!
	public static void main(String[] args) {
      String S = "";
      for (int i=0; i < args.length; i++){
         S = S + args[i] + " ";
         
      }
      
		System.out.print(reverseText(S));

	}

	// Reverses each word in the string and outputs the new string
	private static String reverseText(String userString) {
        // Splits the input string by a space and create an array of words
		String reversedString="";
        String[] arrayStrings = userString.split("\s");
        // Traverse the array and reverse each word of the array
        for (int i = 0; i < arrayStrings.length; i++) {
        	arrayStrings[i] = reverseWord(arrayStrings[i]);
        }
        // Uses the reversed array to create the return string
        for (int i = 0; i < arrayStrings.length; i++) {
        	reversedString= reversedString.concat(arrayStrings[i]) + " ";
        }
        // Returns the string with reversed words
        return reversedString.trim();
	}
	
	// Reverses each word
	private static String reverseWord(String normalWord) {        
		String reversedWord=""; 
        // Walks through each word backwards and creates a new word with reversed characters
        for (int i = (normalWord.length()-1); i >= 0; i--) {
        	reversedWord = reversedWord.concat(String.valueOf(normalWord.charAt(i))) ;
        }        
        return reversedWord;
	}
}
