package movie.respons;

import movie.MovieGenre;
import lombok.Builder;
import lombok.Getter;
import movie.repository.MovieEntity;
import movie.servcises.Movie;

import java.util.List;
@Getter
@Builder
public class MovieResponse { //

    public class MovieRequest {

        private String name;

        private MovieGenre genre;

        private int relaseYear;

        private String director;

        private List<CastResponse> castList;
        public MovieCreateResponse convertToMovieResponse(Long id){
            return MovieCreateResponse.builder().build();
        }
        public Movie convertToMovie() {
            return Movie.builder().
                    director(director).build();
        }
    }

}
