package jp.co.methodologic.sec15refactoring;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public int getCharge(int daysRented) {
		int result = 200;
		if (daysRented > 2) {
			result += (daysRented - 2) * 150;
		}

		return result;
	}

}
