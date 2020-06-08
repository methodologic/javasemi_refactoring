package jp.co.methodologic.sec15refactoring;

public class ChildrenPrice extends Price{

	@Override
	public int getPriceCode() {
		return Movie.CHILDREN;
	}

	@Override
	public int getCharge(int daysRented) {
		int result = 150;
		if (daysRented > 3) {
			result += (daysRented - 3) * 150;
		}
		return result;
	}

}
