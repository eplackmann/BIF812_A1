
public class TestSB {

	public static void main(String[] args) {
		StringBuilderMiniGenBankSeq test = new StringBuilderMiniGenBankSeq();
		long nanoseconds = test.testConcatenate(100);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating using StringBuilder took " + seconds + " seconds");

	}

}