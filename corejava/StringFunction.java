package In.com.corejava;

public class StringFunction {
	
	public static void main(String[] args) {
		
		String name = "Yashmita Rathore";
		System.out.println(" String Length : " +name.length());
		System.out.println(" 7th character is : " +name.charAt(6));
		System.out.println(" Yash index is : "+name.indexOf("Yash"));
		System.out.println(" First a position : " +name.indexOf("a"));
		System.out.println(" Last a position : " +name.lastIndexOf("a"));
		System.out.println(" a is replace by b :" +name.replace("a","b"));
		System.out.println(" Lower case : " +name.toLowerCase());
		System.out.println(" uper case : " +name.toUpperCase());
		System.out.println(" Start with Yash : " +name.startsWith("Yash")); // this function is check only and give output only true or false.
		System.out.println(" End with mita : " +name.endsWith("mita"));
		System.out.println(" Substring : " +name.substring(9)); // this function start print (the number you will give in the index...
		
	}

}
