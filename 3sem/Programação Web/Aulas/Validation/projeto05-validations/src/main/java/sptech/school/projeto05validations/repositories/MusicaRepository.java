package sptech.school.projeto05validations.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sptech.school.projeto05validations.domain.Musica;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer> {
}
