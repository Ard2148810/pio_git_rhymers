package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int NUM = -1;
	private final int NUM2 = 12;

	private int[] numbers = new int[NUM2];

	private int total = NUM;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	boolean callCheck() {
		return total == NUM;
	}
		
	boolean isFull() {
		return total == 11;
	}
		
	int peekaboo() {
		if (callCheck())
			return NUM;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return NUM;
		return numbers[total--];
	}

}
