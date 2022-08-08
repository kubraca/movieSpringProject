package movie.controller;

import lombok.RequiredArgsConstructor;
import movie.request.MovieRequest;
import movie.respons.MovieCreateResponse;
import movie.respons.MovieResponse;
import movie.servcises.Movie;
import movie.servcises.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;


    @PostMapping("/movies")
    @ResponseStatus(HttpStatus.CREATED)
    public Long create (@RequestBody @Valid MovieRequest request){
        Movie movie=request.convertToMovie();
        Long id= movieService.create(movie);
//servisin anladığı dil entity olduğu için requesti alıp entitye çevirdik ayrıca servis repo kullanır

    return MovieCreateResponse.convertToMovieResponse(id);
    }

    @GetMapping("/movies/{id}")
    public MovieResponse retrieve (@PathVariable Long id){

        return MovieResponse.builder().build();
    }
}
