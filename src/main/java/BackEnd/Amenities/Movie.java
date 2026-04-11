package BackEnd.Amenities;

public class Movie extends Amenity {

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
                "amenityName='" + getAmenityName() + '\'' +
                ", amenityAvailability=" + isAmenityAvailability() +
                ", amenityPrice=" + getAmenityPrice() +
                ", amenityDescription='" + getAmenityDescription() + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieLength=" + movieLength +
                '}';
    }
}
