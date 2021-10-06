package datastructure;

public interface OneTwoThreeDefaultInterface {

	public default int one() {
		return 1;
	}
	public default int two() {
		return 2;
	}
	
	public default int three() {
		return 3;
	}
	
	public int number(int num);
}