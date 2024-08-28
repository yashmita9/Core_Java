package In.com.corejava;

public class BufferStringFunction {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Yashmita");
		sb.append(" Rathore");
		System.out.println(sb);
		System.out.println("Length of the string : " +sb.length());
		System.out.println("Capacity : " +sb.capacity());
		System.out.println("char at function : " +sb.charAt(1));
		System.out.println("index of : " +sb.indexOf("Rathore"));
		System.out.println("Reverse : "+sb.reverse());
		System.out.println("Replace : "+sb.replace(0, 16, "dharmendra"));
		System.out.println();
	
	}

}
