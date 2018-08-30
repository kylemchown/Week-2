package stirngs;

public class Runner {


	public static void main(String[] args) {
		Compress comp = new Compress();
		Manipulation man = new Manipulation();
		System.out.println(man.commonString("124fgabcgewiufe134", "1234sahdgwuabecyqwedfy"));
	
		System.out.println(Manipulation.distance("abcde", "habec"));
		
		
		System.out.println(comp.compressString("Digital alarm clocks scare area children."));
		System.out.println(comp.compressString("Animal malcontents send death threats"));
		System.out.println(comp.compressString("abba baby Yamm mmann nnatt"));
	}
	
}
