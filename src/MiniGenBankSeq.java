
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
			System.out.println("Error, locus not initialized.");
		} else {
		return locus;
		}
	}
	
	public void setAccess(String newValue){
		accession = newValue;
	}
	
	public String getAccess(){
		if (accession==null) {
			System.out.println("Error, accession not initialized.");
		} else {
		return accession;
		}
	}
	
	public void setDef(String newValue){
		definition = newValue;
	}
	
	public String getDef(){
		return definition;
	}
	
	public void setSource(String newValue){
		source = newValue;
	}
	
	public String getSource(){
		return source;
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
