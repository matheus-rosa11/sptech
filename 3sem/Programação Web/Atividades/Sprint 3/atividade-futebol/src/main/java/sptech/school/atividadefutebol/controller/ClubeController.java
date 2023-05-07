package sptech.school.atividadefutebol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.atividadefutebol.dto.ClubeDto;
import sptech.school.atividadefutebol.repository.ClubeRepository;

import java.util.List;

@RestController
@RequestMapping("campeonatos")
public class ClubeController {
    @Autowired
    private ClubeRepository clubeRepository;

    @GetMapping
    public ResponseEntity<List<ClubeDto>> listar() {
        return ResponseEntity.status(200).body(clubeRepository.listarClubes());
    }
}
