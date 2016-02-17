
public class MiniGenBankSeq {
	
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
	
	@Override
	public String toString(){
		return "Locus:" + getLocus() + "\tAccession: " + getAccess() + "\tDefinition: " + getDef() +
				"\tSource: " + getSource();
	}
}
