package stirngs;

import java.util.ArrayList;

public class Manipulation {
	private ArrayList<String> first = new ArrayList<>();
	private ArrayList<String> second = new ArrayList<>();
	
	public ArrayList<String> subs(String s) {
		ArrayList<String> a = new ArrayList<>();
		for (int i=0; i<s.length()+1; i++) {
			for (int j=i+1; j<s.length()+1; j++) {
				a.add(s.substring(i, j));
			}
		}
		return a;
	}
	
	public String commonString(String s, String t) {
		ArrayList<String> a = subs(s);
		ArrayList<String> b = subs(t);
		int length = 0;
		int position = -1;
		for (String i : a) {
			for (String j : b) {
				if (i.equals(j)) {
					if (i.length() > length) {
						length = i.length();
						position = a.indexOf(i);
					}
				}
			}
		}
		return a.get(position);
	}
	
	
	
	
	public static int distance(String s1, String s2){
	     int edits[][]=new int[s1.length()+1][s2.length()+1];
	     for(int i=0;i<=s1.length();i++)
	         edits[i][0]=i;
	     for(int j=1;j<=s2.length();j++)
	         edits[0][j]=j;
	     for(int i=1;i<=s1.length();i++){
	         for(int j=1;j<=s2.length();j++){
	             int u=(s1.charAt(i-1)==s2.charAt(j-1)?0:1);
	             edits[i][j]=Math.min(
	                             edits[i-1][j]+1,
	                             Math.min(
	                                edits[i][j-1]+1,
	                                edits[i-1][j-1]+u
	                             )
	                         );
	         }
	     }
	     return edits[s1.length()][s2.length()];
	}
}
