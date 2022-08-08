package movie.request;

import movie.MovieGenre;
import lombok.Getter;
import lombok.Setter;
import movie.repository.MovieEntity;
import movie.servcises.Movie;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class MovieRequest {
    @NotBlank
    private String name;
    @NotNull
    private MovieGenre genre;
    @NotNull
    private int relaseYear;
    @NotNull
    private String director;
   // private List<CastRequest> castList;

    public Movie convertToMovie(){
        return Movie.builder()
                .name(name)
                .genre(genre)
                .relaseYear(relaseYear)
                .director(director)
                .build();
    }
}
