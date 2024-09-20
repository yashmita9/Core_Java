package In.com.StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {
		List<String> list  = Arrays.asList(""
				+ "one " , "two", "three", "four", "three");
		Stream<String> stream = list.stream();
		
		stream.forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------------------");
//		
		list.stream().sorted().
		forEach(e -> {
			System.out.println(e);
		});
		
		System.out.println("------------------");
		
		list.stream().map(e -> e.toUpperCase()).forEach(e -> {
			System.out.println(e);
	});
		
		System.out.println("-------------------");
		
		list.stream().filter(e -> e.startsWith("t")).distinct().map(e -> e.toUpperCase()).sorted().forEach(e ->{
			System.out.println(e);
		});
	}
}


