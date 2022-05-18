package com.day3;

public class VowelConsonant {

	public void checkChar(char args) {
		byte b = (byte)args;
		
		if((b>=65 && b<=90) || (b>=97 && b<=122)) {
			if(args == 'a'|| args == 'e'||args == 'i'||args == 'o'||args == 'u'||args == 'A'||args == 'E'||args == 'I'||args == 'O'||args == 'U') {
				System.out.println("Character is a vowel");
			}
			else {
				System.out.println("Character is a consonant");
			}
		}
		else {
			System.out.println("Invalid character");
		}
	}
	
	public static void main(String[] args) {
		VowelConsonant obj = new VowelConsonant();
		obj.checkChar('e');
		obj.checkChar('b');
		obj.checkChar('9');

	}

}
