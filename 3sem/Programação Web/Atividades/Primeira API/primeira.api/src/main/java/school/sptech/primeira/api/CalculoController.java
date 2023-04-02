package school.sptech.primeira.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculoController {
    private int contador;
    @GetMapping("/contador")
    public int contador() {
        return ++contador;
    }
}
