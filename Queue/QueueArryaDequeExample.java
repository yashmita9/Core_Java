package In.com.Queue;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArryaDequeExample {

	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer("yash");
		q.offer(4);

		System.out.println(q);
		
		System.out.println(q.peek());
		//System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);

	}
}
