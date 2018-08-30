package com.qa.Morse;
import java.util.HashMap;

import javax.sound.sampled.*;


public class Morse {
	private HashMap<String, String> morse = new HashMap<String, String>();
	
	Morse(){
		
	morse.put("/", " ");
	morse.put(".-", "a");
	morse.put("-...", "b");
	morse.put("-.-.", "c");
	morse.put("-..", "d");
	morse.put(".", "e");
	morse.put("..-.", "f");
	morse.put("--.", "g");
	morse.put("....", "h");
	morse.put("..", "i");
	morse.put(".---", "j");
	morse.put("-.-", "k");
	morse.put(".-..", "l");
	morse.put("--", "m");
	morse.put("-.", "n");
	morse.put("---", "o");
	morse.put(".--.", "p");
	morse.put("--.-", "q");
	morse.put(".-.", "r");
	morse.put("...", "s");
	morse.put("-", "t");
	morse.put("..-", "u");
	morse.put("...-", "v");
	morse.put(".--", "w");
	morse.put("-..-", "x");
	morse.put("-.--", "y");
	morse.put("--..", "z");
	}
	
	public String readMorse(String mors) throws Exception{
		String[] parts = mors.split(" ");
		String out = "";
		for(String i : parts) {
			out += morse.get(i);
			String[] temp = i.split("");
			for (String j : temp) {
				if (j.equals(".")) {
					SoundUtils.tone(1000,100);
				}
				else if (j.equals("-")) {
					SoundUtils.tone(1000,400);
				}


			}
			SoundUtils.tone(1000,700,0);

		}
		return out;
	}
}
