package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private final int NUM = -1;
	private final int NUM2 = 12;

	private int[] numbers = new int[getNUM2()];

	public int getTotal() {
		return total;
	}

	private int total = getNUM();

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	boolean callCheck() {
		return total == getNUM();
	}
		
	boolean isFull() {
		return total == 11;
	}
		
	int peekaboo() {
		if (callCheck())
			return getNUM();
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return getNUM();
		return numbers[total--];
	}

	public int getNUM() {
		return NUM;
	}

	public int getNUM2() {
		return NUM2;
	}
}
