package datastructure;

public class TryToInher /*extends OnlyStaticFactoryMethod*/ implements OneTwoThreeDefaultInterface {

	private final int ONE ;

	public TryToInher(int oNE) {
		super();
		ONE = oNE;
	}
	
//	public TryToInher() {
//		super();
//	}


	public int getONE() {
		return ONE;
	}

	@Override
	public int number(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
