package refactoring.chapter01;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    double getCharge() {
        return _movie.getCharge(_daysRented);
    }

    int getFrequentRenterPoints() {
        // 新作を二日以上借りた場合はボーナスポイント
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDaysRented() >1)
            return 2;
        else
            return 1;
    }
}
