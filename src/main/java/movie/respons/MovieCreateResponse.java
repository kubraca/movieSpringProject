package movie.respons;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MovieCreateResponse {

    private Long id;


    public static Long convertToMovieResponse(Long id) {
        return id;
    }
}
