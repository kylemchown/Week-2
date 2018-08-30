package com.qa.Morse;

public class Runner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Morse morse = new Morse();
		
		System.out.println(morse.readMorse(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));
		System.out.println(morse.readMorse("... --- ..."));
	
	
	}

}
