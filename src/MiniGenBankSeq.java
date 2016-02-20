/**
 * @class MiniGenBankSeq.java
 * @author Eric Plackmann
 * @course BIF 724-161
 * @purpose This class creates MiniGenBank objects using varying argument constructors (Part A) and 
 * runs a string concatenation using the standard += method (Part B)
 * @oath I declare that the attached assignment is my own work in accordance with Seneca Academic
 * Policy. No part of this assignment has been copied manually or electronically from any other
 * source (including web sites) or distributed to other students.
 * Name: Eric Plackmann 023 893 159
 **/

public class MiniGenBankSeq extends SequenceLoader{
	
	// Initial declaration of arguments in class
	private String locus;
	private String accession;
	private String definition;
	private String source;
	
	public void setLocus(String newValue){ // sets Locus argument
		locus = newValue;
	}
	
	public String getLocus(){ // prints warning message if void, returns Locus
		if (locus==null) {
			printError("locus");
		}
		return locus;
	}
	
	public void setAccess(String newValue){ // sets Accession argument
		accession = newValue;
	}
	
	public String getAccess(){ // prints warning message if void, returns Accession
		if (accession==null) {
			printError("accession");
		}
		return accession;
	}
	
	public void setDef(String newValue){ // sets Definition argument
		definition = newValue;
	}
	
	public String getDef(){
		if (definition==null) { // prints warning if void, returns Definition
			printError("definition");
		}
		return definition;
	}
	
	public void setSource(String newValue){ // sets Source argument
		source = newValue;
	}
	
	public String getSource(){ // prints warning if void, returns Source
		if (source==null) {
			printError("source");
		}
		return source;
	}
	
	// Prints out warning string depending on method being called
	public void printError(String x){ 
		System.out.printf("WARNING, %s not initialized.\n", x);
	}
	
	// No argument constructor
	public MiniGenBankSeq(){
		
	}
	
	// Four argument constructor
	public MiniGenBankSeq(String newLocus, String newAccess, String newDef, String newSource){
		this.locus = newLocus;
		this.accession = newAccess;
		this.definition = newDef;
		this.source = newSource;
	}
	
	// Two argument constructor
	public MiniGenBankSeq(String newLocus, String newAccess){
		this(newLocus, newAccess, null, null);
	}	
	
	// Displays the informations stored in the object
	@Override
	public String toString(){
		return "Locus:" + getLocus() + "\tAccession: " + getAccess() + "\tDefinition: " + getDef() +
				"\tSource: " + getSource();
	}
	
	//PART B
	// Standard concatenation using += and display of iteration
	@Override
	public void concatenate(String s, int times) {
		
		for( int i=0; i<times; i++ ){
			System.out.println("Concatenating using += ; " + i + "/" + times);
			sequence += s;
		}
	
	}	
}
