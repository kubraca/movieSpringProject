package movie.servcises;

import lombok.Builder;
import lombok.Getter;
import movie.MovieGenre;
import movie.request.CastRequest;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
@Getter
@Builder
public class Movie {// servisin data sınıfı


    private String name;

    private MovieGenre genre;
     int relaseYear;

    private String director;


    private List<CastRequest> castList;
}
