package sptech.school.atividade02sp02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sptech.school.atividade02sp02.domain.Carro;
import sptech.school.atividade02sp02.repositories.CarroRepository;

import java.util.List;

@RestController
@RequestMapping("carros")
public class CarroController {
    @Autowired
    private CarroRepository carroRepository;

    @PostMapping
    public ResponseEntity<Carro> cadastrar(@RequestBody Carro carro) {
        carroRepository.save(carro);
        return ResponseEntity.status(201).body(carro);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> listar() {
        List<Carro> carros = carroRepository.findAll();
        return carros.isEmpty() ?
                ResponseEntity.status(200).body(carros) :
                ResponseEntity.status(204).build();
    }

    @GetMapping("/{id}")

}
