
public class Test {

	public static void main(String[] args) {
		MiniGenBankSeq test = new MiniGenBankSeq();
		long nanoseconds = test.testConcatenate(100);
		double seconds = nanoseconds / (double)1000000000; 
		System.out.println("Concatenating using standard concatenation took " + seconds + " seconds");

	}

}
