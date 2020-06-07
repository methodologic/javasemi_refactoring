package jp.co.methodologic.sec15refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentalList = new ArrayList<>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentalList.add(rental);
	}

	public String getName() {
		return this.name;
	}

	public String statement() {
		int totalAmount = 0;
		int frequentRentarPoints = 0;
		String result = this.getName() + "のレンタル記録\n";
		for (Rental eachRental : this.rentalList) {
			result += "\t" + eachRental.getMovie().getTitle() + "\t" + eachRental.getCharge() + "円\n";
			totalAmount += eachRental.getCharge();
			frequentRentarPoints += eachRental.getFreauentRentalPoints();
		}
		result += "合計\t" + totalAmount + "円\n";
		result += "ポイント\t" + frequentRentarPoints;

		return result;
	}

}
