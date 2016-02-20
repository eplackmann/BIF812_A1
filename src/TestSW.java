/**
 * @class TestSW.java
 * @author Eric Plackmann
 * @course BIF 724-161
 * @purpose This class contains the main method required to call the concatenation method in 
 * StringWriterMiniGenBankSeq.java
 * @oath I declare that the attached assignment is my own work in accordance with Seneca Academic
 * Policy. No part of this assignment has been copied manually or electronically from any other
 * source (including web sites) or distributed to other students.
 * Name: Eric Plackmann 023 893 159
 **/

public class TestSW {

	public static void main(String[] args) {
		StringWriterMiniGenBankSeq test = new StringWriterMiniGenBankSeq(); //instantiates new object
		long nseconds = test.testConcatenate(10); // gets runtime returned from SequenceLoader testConcatenate method(x times)
		double seconds = nseconds / (double)1000000000; // converts runtime to seconds
		System.out.printf("concatenating using StringBuilder took %f seconds.\n", seconds);
	}

}