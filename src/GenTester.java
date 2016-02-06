
public class GenTester {

	public static void main(String[] args) {
		MiniGenBankSeq noargs = new MiniGenBankSeq();
		System.out.println(noargs.toString());
		MiniGenBankSeq fourargs = new MiniGenBankSeq("one", "two", "three", "four");
		System.out.println(fourargs.toString());
		MiniGenBankSeq twoargs = new MiniGenBankSeq("one", "two");
		System.out.println(twoargs.toString());
	}

}
