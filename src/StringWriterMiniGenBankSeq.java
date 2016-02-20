/**
 * @class StringWriterMiniGenBankSeq.java
 * @author Eric Plackmann
 * @course BIF 724-161
 * @purpose This class runs a string concatenation using the StringWriter method
 * @oath I declare that the attached assignment is my own work in accordance with Seneca Academic
 * Policy. No part of this assignment has been copied manually or electronically from any other
 * source (including web sites) or distributed to other students.
 * Name: Eric Plackmann 023 893 159
 **/

import java.io.StringWriter; //imports required StringWriter method

public class StringWriterMiniGenBankSeq extends SequenceLoader{
	
	@Override
	public void concatenate(String s, int times) {
		StringWriter stringw = new StringWriter(); // New stringwriter instance stringw
		for( int i=0; i<times; i++ ){
			System.out.println("Concatenating using StringWriter method ; " + i + "/" + times);
			stringw.append(s); // stringwriter specific concatenation method
		}
	
	}

}