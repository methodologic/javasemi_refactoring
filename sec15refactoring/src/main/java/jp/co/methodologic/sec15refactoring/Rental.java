package jp.co.methodologic.sec15refactoring;

public class Rental {
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return this.movie;
	}

	public int getDaysRented() {
		return this.daysRented;
	}

	public int getCharge() {
		return this.movie.getCharge(this.daysRented);
	}

	public int getFreauentRentalPoints() {
		int frequentRentarPoints = 1;

		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE)
				&& getDaysRented() > 1) {
			frequentRentarPoints++;
		}
		return frequentRentarPoints;
	}


}
