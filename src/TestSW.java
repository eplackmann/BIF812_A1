
public class TestSW {


	public static void main(String[] args) {
		StringWriterMiniGenBankSeq test = new StringWriterMiniGenBankSeq();
		long nanoseconds = test.testConcatenate(100);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("concatenating using StringBuilder took " + seconds + " seconds");

	}

}