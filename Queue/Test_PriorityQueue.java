package In.com.Queue;

import java.util.PriorityQueue;

public class Test_PriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		
		p.offer("A");
		p.offer("B");
		p.offer("d");
		
		System.out.println(p);
		
		p.offer("1");
		
		
				// in PriorityQueue if You add a data type first then You don't add other data
				// type in this if you add it gives ClassCastException at Runtime

				// Example We add String first in this program so we cannot add other data type
				// If we add int first so we cannot add String or other data type
				PriorityQueue<Integer> q = new PriorityQueue<Integer>();
				
				q.offer(23);
				q.offer(56);
				q.offer(54);
				System.out.println(q);
				
				System.out.println(q.peek());
				System.out.println(q);
				
				System.out.println(q.poll());
				System.out.println(q);
				
				Object ele = q.element();
				
				System.out.println(ele);
				
				System.out.println("----------");
				ele = q.remove();
				System.out.println(q);
				
				System.out.println(ele);
				
	}
	
}
