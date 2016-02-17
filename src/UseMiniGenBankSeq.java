/**
 * Main method for running the MiniGenBankSeq class.
 * Provides varying set argument levels to run different constructors,
 * followed by full instantiation of objects for comparison of output display (ie. warnings)
 * GenBank homo sapien data obtained from NCBI website http://www.ncbi.nlm.nih.gov/genome/?term=homo+sapien
 * @author Eric Plackmann
 *
 */
public class UseMiniGenBankSeq{

	public static void main(String[] args) {
		
		// Initialize and display uninitialized object
		System.out.println("Displaying 'uninitialized' object with no-arguments constructor:");
		MiniGenBankSeq uninitialized = new MiniGenBankSeq();
		System.out.println(uninitialized.toString());
		System.out.println("");
		
		// Setting arguments of uninitialized object
		System.out.println("Displaying 'uninitialized' object after setting arguments:");
		uninitialized.setLocus("NC_000001");
		uninitialized.setAccess("NC_000001 GPC_000001293");
		uninitialized.setDef("Homo sapiens chromosome 1, GRCh38.p2 Primary Assembly.");
		uninitialized.setSource("Homo sapiens (human)");
		System.out.println(uninitialized.toString());
		System.out.println("");
		
		// Initializing object with two argument constructor
		System.out.println("Displaying 'twoarg' object using two argument constructor:");
		MiniGenBankSeq twoargs = new MiniGenBankSeq("NC_000003", "NC_000003 GPC_000001295");
		System.out.println(twoargs.toString());
		System.out.println("");
		
		//Setting remaining arguments in twoarg object
		System.out.println("Displaying 'twoarg' object after setting arguments:");
		uninitialized.setDef("Homo sapiens chromosome 3, GRCh38.p2 Primary Assembly.");
		uninitialized.setSource("Homo sapiens (human)");
		System.out.println(uninitialized.toString());
		System.out.println("");
		
		// Initializing object with all arguments set
		System.out.println("Displaying 'fourarg' object using four argument constructor:");
		MiniGenBankSeq fourargs = new MiniGenBankSeq("NC_000002", "NC_000002 GPC_000001294", "Homo sapiens chromosome 2, GRCh38.p2 Primary Assembly", "Homo sapiens (human)");
		System.out.println(fourargs.toString());
		System.out.println("");
		
	}

}
