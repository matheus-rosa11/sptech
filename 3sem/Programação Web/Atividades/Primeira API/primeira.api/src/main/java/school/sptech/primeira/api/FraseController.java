package school.sptech.primeira.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/frases")
public class FraseController {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
    @GetMapping("bom-dia")
    public String bomDia() {
        return "Bom dia!";
    }

    @GetMapping("/bom-dia/{nome}/{sobrenome}")
    public String personalizada(@PathVariable String nome, @PathVariable String sobrenome) {
        return String.format("Bom dia, %s %s! Você está lindo(a) como sempre.", nome, sobrenome);
    }
}
