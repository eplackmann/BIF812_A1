/**
 * @class StringBuilderMiniGenBankSeq.java
 * @author Eric Plackmann
 * @course BIF 724-161
 * @purpose This class runs a string concatenation using the StringBuilder method
 * @oath I declare that the attached assignment is my own work in accordance with Seneca Academic
 * Policy. No part of this assignment has been copied manually or electronically from any other
 * source (including web sites) or distributed to other students.
 * Name: Eric Plackmann 023 893 159
 **/

public class StringBuilderMiniGenBankSeq extends SequenceLoader{
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder stringb = new StringBuilder(); //New string builder instance stringb
		for( int i=0; i<times; i++ ){
			System.out.println("Concatenating using StringBuilder method ; " + i + "/" + times);
			stringb.append(s); // stringbuilder specific concatenation method
		}
	
	}

}
