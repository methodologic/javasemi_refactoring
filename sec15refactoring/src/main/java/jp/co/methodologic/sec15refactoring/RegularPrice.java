package jp.co.methodologic.sec15refactoring;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

}
