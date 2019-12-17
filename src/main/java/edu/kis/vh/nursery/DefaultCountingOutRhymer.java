package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	final int NUM = -1;
	final int NUM2 = 12;

	private int[] numbers = new int[NUM2];

	public int total = NUM;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == NUM;
	}
		
	public boolean isFull() {
		return total == 11;
	}
		
	protected int peekaboo() {
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
