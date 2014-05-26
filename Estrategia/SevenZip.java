package iis1314.designPatterns.strategy;

public class SevenZip implements ICompressor{

	@Override
	public String compress(String data) {
		// TODO Auto-generated method stub
		return ("7ZIP data: -"+data+"-");
	}
	
}
