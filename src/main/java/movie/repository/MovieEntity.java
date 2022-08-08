package movie.repository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import movie.MovieGenre;
import movie.request.CastRequest;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "movie")
public class MovieEntity {
    // Control dışarıdan aldığı Requesti entitye çevirmek zorunda ç
    // çünkü controller serviceden istek alıyor ve controller serviceden hizmet aldığı için hizmet aldığı dile göre konuşmalı
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private MovieGenre genre;
        private int relaseYear;
        private String director;



}





