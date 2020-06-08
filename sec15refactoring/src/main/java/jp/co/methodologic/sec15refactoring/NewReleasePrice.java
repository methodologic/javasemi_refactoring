package jp.co.methodologic.sec15refactoring;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public int getCharge(int daysRented) {
		int result = daysRented * 300;
		return result;
	}

}
