package com.chargelab.priorityqueue;

public class CustomQueueTest {
	public static void main(String[] args) {
		testCase1();
		testCase2();
		testCase3();
	}
	
	
	private static void testCase1() {
		int queueSize = 10;
		CustomPriorityQueue<Integer> queue = new CustomPriorityQueue<>(queueSize);
		queue.add(8, 8);
		queue.add(2, 2);
		queue.add(6, 6);
		queue.add(5, 5);
		queue.add(2, 2);
		queue.add(5, 5);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		queue.add(2, 2);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	
	
	private static void testCase2() {
		//: 8 2 6 5 5
		int queueSize = 10;
		CustomPriorityQueue<Integer> queue = new CustomPriorityQueue<>(queueSize);
		queue.add(8, 8);
		queue.add(2, 2);
		queue.add(6, 6);
		queue.add(5, 5);
		queue.add(5, 5);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		queue.add(2, 2);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
	public static void testCase3() {
		//5143 1534 3514 4731 4913 5351 4317 3113 411
		int queueSize = 100;
		CustomPriorityQueue<Integer> queue = new CustomPriorityQueue<>(queueSize);
		queue.add(5, 5);
		queue.add(1, 1);
		queue.add(4, 4);
		queue.add(3, 3);
		
		queue.add(1, 1);
		queue.add(5, 5);
		queue.add(3, 3);
		queue.add(4, 4);
		
		queue.add(3, 3);
		queue.add(5, 5);
		queue.add(1, 1);
		queue.add(4, 4);
		
		queue.add(4, 4);
		queue.add(7, 7);
		queue.add(3, 3);
		queue.add(1, 1);
		
		queue.add(4, 4);
		queue.add(9, 9);
		queue.add(1, 1);
		queue.add(3, 3);
		
		queue.add(5, 5);
		queue.add(3, 3);
		queue.add(5, 5);
		queue.add(1, 1);
		
		queue.add(4, 4);
		queue.add(3, 3);
		queue.add(1, 1);
		queue.add(7, 7);
		
		queue.add(3, 3);
		queue.add(1, 1);
		queue.add(1, 1);
		queue.add(3, 3);
		
		queue.add(4, 4);
		queue.add(1, 1);
		queue.add(1, 1);
		
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll() + "" + queue.poll());
		System.out.println(queue.poll() + ""+ queue.poll() + "" + queue.poll()+ "" + queue.poll());
	}
	
}
