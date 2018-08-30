package stirngs;

import java.util.ArrayList;

public class Compress {

	public Compress() {
		
	}
	
	public ArrayList<String> ends(String s) {
		ArrayList<String> a = new ArrayList<>();
		for (int i=0; i<s.length(); i++) {
				a.add(s.substring(i));
		}
		return a;
	}
	
	public ArrayList<String> starts(String s) {
		ArrayList<String> a = new ArrayList<>();
		for (int i=1; i<s.length()+1; i++) {
				a.add(s.substring(0, i));
		}
		return a;
	}
	
	public String compress(String s, String t) {
		ArrayList<String> a = ends(s);
		ArrayList<String> b = starts(t);
		int length = 0;
		for (String i : a) {
			for (String j : b) {
				if (i.equals(j)) {
					if (i.length() > length) {
						length = i.length();
					}
				}
			}
		}
		if (length == 0) {
			return (s + " " + t);
		}
		else {
		return (s.substring(0, s.length() - length) + t);
		}
		
	}
	
	public String compressString(String s) {
		String[] words = s.split(" ");
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i<words.length-1; i++) {
			a.add(compress(words[i], words[i+1]));
		}
		while (a.size() > 1) {
			ArrayList<String> b = new ArrayList<String>();
			for (int i = 0; i<a.size()-1; i++) {
				b.add(compress(a.get(i), a.get(i+1)));
			}
			a = b;
		}
		return a.get(0);
	}
}
