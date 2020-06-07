package jp.co.methodologic.sec15refactoring;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStatement() {
		Customer customer = new Customer("山田太郎");
		Movie movie1 = new Movie("バイオハザード", Movie.REGULAR);
		Movie movie2 = new Movie("アナと雪の女王", Movie.NEW_RELEASE);
		Movie movie3 = new Movie("アンパンマン", Movie.CHILDREN);

		Rental rental1 = new Rental(movie1, 2);
		Rental rental2 = new Rental(movie2, 2);
		Rental rental3 = new Rental(movie3, 2);

		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);

		String expected = "山田太郎のレンタル記録\n" +
				"	バイオハザード	200円\n" +
				"	アナと雪の女王	600円\n" +
				"	アンパンマン	150円\n" +
				"合計\t950円\n" +
				"ポイント\t4";

		String actual = customer.statement();

		System.out.println(actual);

		assertThat(customer.statement(), is("山田太郎のレンタル記録\n" +
				"	バイオハザード	200円\n" +
				"	アナと雪の女王	600円\n" +
				"	アンパンマン	150円\n" +
				"合計\t950円\n" +
				"ポイント\t4"));
//		assertThat(actual, is(expected));

	}

}
