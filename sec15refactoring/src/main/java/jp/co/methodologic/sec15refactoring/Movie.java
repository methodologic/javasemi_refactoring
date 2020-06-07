package jp.co.methodologic.sec15refactoring;

public class Movie {

	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.setPriceCode(priceCode);
	}

	public String getTitle() {
		return this.title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch(priceCode) {
		case Movie.REGULAR:
			this.price = new RegularPrice();
			break;
		case Movie.CHILDREN:
			this.price = new ChildrenPrice();
			break;
		case Movie.NEW_RELEASE:
			this.price = new NewReleasePrice();
			break;
		default:

		}
	}

	public int getCharge(int daysRented) {
		int result = 0;
		switch (this.getPriceCode()) {
		case Movie.REGULAR:
			result += 200;
			if (daysRented > 2) {
				result += (daysRented - 2) * 150;
			}
			break;
		case Movie.NEW_RELEASE:
			result += daysRented * 300;
			break;
		case Movie.CHILDREN:
			result += 150;
			if (daysRented > 3) {
				result += (daysRented - 3) * 150;
			}
			break;
		}
		return result;
	}

}
