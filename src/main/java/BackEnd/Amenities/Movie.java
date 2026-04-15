package BackEnd.Amenities;

import BackEnd.Interfaces.Pricable;

public class Movie extends Amenity implements Pricable {

    private String movieName;
    private String movieLength;

    public Movie(String amenityName, boolean amenityAvailability, double amenityPrice, String amenityDescription, String movieName, String movieLength) {
        super(amenityName, amenityAvailability, amenityPrice, amenityDescription);
        this.movieName = movieName;
        this.movieLength = movieLength;
    }

    public Movie(String movieName, String movieLength) {
        this.movieName = movieName;
        this.movieLength = movieLength;
    }

    public Movie() {
        this.movieName = null;
        this.movieLength = "0";
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "\namenityName='" + getAmenityName() + '\'' +
                "\namenityAvailability=" + isAmenityAvailability() +
                "\namenityPrice=" + getAmenityPrice() +
                "\namenityDescription='" + getAmenityDescription() + '\'' +
                "\nmovieName='" + movieName + '\'' +
                "\nmovieLength=" + movieLength +
                '}';
    }


    /**
     * Give you the price of the amenity
     * @return The price of the amenity as a double.
     */
    @Override
    public double getPrice() {
        return getAmenityPrice();
    }
}
