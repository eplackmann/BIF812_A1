
public class StringBuilderMiniGenBankSeq extends SequenceLoader{
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder sb = new StringBuilder(sequence);
		for(int i=0;i<times;i++){
			System.out.println("Concatenating using Stringbuilder; time "+ i + " of "+times);
			sb.append(s);
		}
		sequence = sb.toString();
	
	}
	
	@Override
	public String toString(){
		return super.toString() + " Sequence: " + sequence;
	}
}
