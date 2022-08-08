package movie.repository;

import lombok.RequiredArgsConstructor;
import movie.servcises.Movie;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieDaoImp implements MovieDao {
    private final MovieDao movieDao;
    //private final MovieJpaRepository movieJpaRepository;

    @Override
    public Long create(Movie movie) {
        MovieEntity movieEntity=movie.convertToMovieEntity();
        return movieDao.save(movieEntity);
    }


    public MovieEntity convertToMovieEntity(Movie movie){
        MovieEntity movieEntity=new MovieEntity();
        movieEntity.setName(movie.getName());
        movieEntity.setDirector(movieEntity.getDirector());
        movieEntity.setRelaseYear(movie.getRelaseYear());
        movieEntity.setGenre(movie.getGenre());
        return movieEntity;
    }
}
