package jp.co.methodologic.sec15refactoring;

public class ChildrenPrice extends Price{

	@Override
	public int getPriceCode() {
		return Movie.CHILDREN;
	}

}
