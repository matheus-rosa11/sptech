package sptech.school.atividadefutebol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sptech.school.atividadefutebol.domain.Clube;
import sptech.school.atividadefutebol.dto.ClubeDto;

import java.util.List;

@Repository
public interface ClubeRepository extends JpaRepository<Clube, Long> {
    @Query("SELECT new sptech.school.atividadefutebol.dto.ClubeDto(" +
            "c.nome, " +
            "c.qtdTitulos, " +
            "c.localidade, " +
            "c.qtdTorcedores, " +
            "c.verba) FROM Clube c")
    List<ClubeDto> listarClubes();


}
