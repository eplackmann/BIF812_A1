
public class MiniGenBankSeq {
	private String locus;
	private String accession;
	private String definition;
	private String source;
	
	public void setLocus(String newValue){
		locus = newValue;
	}
	
	public String getLocus(){
		if (locus==null) {
			printError("locus");
		}
		return locus;
	}
	
	public void setAccess(String newValue){
		accession = newValue;
	}
	
	public String getAccess(){
		if (accession==null) {
			printError("accession");
		}
		return accession;
	}
	
	public void setDef(String newValue){
		definition = newValue;
	}
	
	public String getDef(){
		if (definition==null) {
			printError("definition");
		}
		return definition;
	}
	
	public void setSource(String newValue){
		source = newValue;
	}
	
	public String getSource(){
		if (source==null) {
			printError("source");
		}
		return source;
	}
	
	public void printError(String x){
		System.out.println("WARNING, " + x + " not initialized.");
	}
	
	public MiniGenBankSeq(){
		
	}
	
	public MiniGenBankSeq(String newLocus, String newAccess, String newDef, String newSource){
		this.locus = newLocus;
		this.accession = newAccess;
		this.definition = newDef;
		this.source = newSource;
	}
	
	public MiniGenBankSeq(String newLocus, String newAccess){
		this(newLocus, newAccess, null, null);
	}	
	
	@Override
	public String toString(){
		return "Locus:" + getLocus() + "\tAccession: " + getAccess() + "\tDefinition: " + getDef() +
				"\tSource: " + getSource();
	}
}
