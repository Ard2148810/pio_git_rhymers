package edu.kis.vh.nursery;

/**
 * First In First Out
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * Counts out in FIFO order
	 * @return
	 */
	@Override
	public int countOut() {
		while (!callCheck()) {
			temp.countIn(super.countOut());
		}
		int ret = temp.countOut();
		while (!temp.callCheck()) {
			countIn(temp.countOut());
		}
		return ret;
	}
}
