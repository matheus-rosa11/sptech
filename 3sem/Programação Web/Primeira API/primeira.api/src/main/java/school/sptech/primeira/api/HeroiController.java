package school.sptech.primeira.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {
    private List<Heroi> herois = new ArrayList<Heroi>();
    @GetMapping ("/favorito")
    public Heroi favorito() {
        Heroi heroi = new Heroi("Batman", 17, "Rico", 8000.01, true);
        return heroi;
    }

    @GetMapping
    public List<Heroi> listar() {
        herois.add(new Heroi("Batman", 17, "Rico", 8000.01, true));
        return herois;
    }


}
