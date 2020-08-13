package refactoring.chapter01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private Customer sut;

    @BeforeEach
    public void setUp() {
        sut = new Customer("Taro");
    }

    @Test
    public void no_rental() {
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_regular_movie_for_one_day() {
        Rental rental = new Rental(new Movie("Regular Movie", Movie.REGULAR), 1);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tRegular Movie\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_regular_movie_for_one_day_html_statement() {
        Rental rental = new Rental(new Movie("Regular Movie", Movie.REGULAR), 1);
        sut.addRental(rental);
        String actual = sut.htmlStatement();
        String expected = "<H1>Rentals for <EM>Taro</EM></H1><P>\n" +
                "Regular Movie: 2.0<BR>\n" +
                "<P>You owe <EM>2.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_regular_movie_for_three_days() {
        Rental rental = new Rental(new Movie("Regular Movie", Movie.REGULAR), 3);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tRegular Movie\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_new_release_movie_for_one_day() {
        Rental rental = new Rental(new Movie("New Release Movie", Movie.NEW_RELEASE), 1);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tNew Release Movie\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_new_release_movie_for_two_day() {
        Rental rental = new Rental(new Movie("New Release Movie", Movie.NEW_RELEASE), 2);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tNew Release Movie\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_childrens_movie_for_one_day() {
        Rental rental = new Rental(new Movie("Childrens Movie", Movie.CHILDRENS), 1);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tChildrens Movie\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, actual);
    }

    @Test
    public void rent_a_childrens_movie_for_four_day() {
        Rental rental = new Rental(new Movie("Childrens Movie", Movie.CHILDRENS), 4);
        sut.addRental(rental);
        String actual = sut.statement();
        String expected = "Rental Record for Taro\n" +
                "\tChildrens Movie\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";
        assertEquals(expected, actual);
    }

}
