package movie.servcises;

import movie.repository.MovieDao;
import movie.repository.MovieEntity;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Long create(Movie movie){
    MovieEntity movieEntity=new MovieEntity();
    movieEntity.setName(movie.getName());
        return movieDao.save(movie);

    }
}
