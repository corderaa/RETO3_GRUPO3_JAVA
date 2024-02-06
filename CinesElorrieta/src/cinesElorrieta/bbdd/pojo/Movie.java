package cinesElorrieta.bbdd.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Object of the t_pelis from the DB. It represents a Movie.
 */
public class Movie implements Serializable {

	private static final long serialVersionUID = 5115264711006430061L;

	int movieId = 0;
	String movieDuration = null;
	String movieKind = null;
	String movieName = null;
	Double moviePrice = 0.0;

	List<Session> SessionIDs = null;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieKind() {
		return movieKind;
	}

	public void setMovieKind(String movieKind) {
		this.movieKind = movieKind;
	}

	public Double getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(Double moviePrice) {
		this.moviePrice = moviePrice;
	}

	public List<Session> getSessionIDs() {
		return SessionIDs;
	}

	public void setSessionIDs(List<Session> sessionIDs) {
		SessionIDs = sessionIDs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(SessionIDs, movieDuration, movieId, movieKind, movieName, moviePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(SessionIDs, other.SessionIDs) && Objects.equals(movieDuration, other.movieDuration)
				&& movieId == other.movieId && Objects.equals(movieKind, other.movieKind)
				&& Objects.equals(movieName, other.movieName) && Objects.equals(moviePrice, other.moviePrice);
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieDuration=" + movieDuration + ", movieKind=" + movieKind
				+ ", movieName=" + movieName + ", moviePrice=" + moviePrice + ", SessionIDs=" + SessionIDs + "]";
	}

}