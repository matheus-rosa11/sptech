package sptech.school.atividade02sp02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sptech.school.atividade02sp02.domain.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}
