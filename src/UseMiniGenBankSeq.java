
public class UseMiniGenBankSeq {

	public static void main(String[] args) {
		//prints out the different class objects
		System.out.println("Object with no arguments initialized:");
		MiniGenBankSeq noargs = new MiniGenBankSeq();
		System.out.println(noargs.toString());
		System.out.println("Object with all arguments initialized:");
		MiniGenBankSeq fourargs = new MiniGenBankSeq("one", "two", "three", "four");
		System.out.println(fourargs.toString());
		System.out.println("Object with two arguments initialized:");
		MiniGenBankSeq twoargs = new MiniGenBankSeq("one", "two");
		System.out.println(twoargs.toString());
	}

}
