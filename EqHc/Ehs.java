package EqHc;

public class Ehs {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s2.hashCode() == s1.hashCode());
	}
}
