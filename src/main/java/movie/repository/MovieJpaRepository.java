package movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieJpaRepository extends JpaRepository<MovieEntity,Long> {
    //buradaki long aslında entitiy içindeki idnin tipi ve aynı olmalı
// veri tabanı işlemlerini yapmak için kendi repositoryimize extend ediyoruz interfacei
// controller servisi kullanırken ve servisde repoyu kullanırken interfaceler üzerinden kullanır
}
