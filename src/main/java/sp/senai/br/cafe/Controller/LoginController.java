package sp.senai.br.cafe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class LoginController {

    @GetMapping("/login")
    public String exibirFormularioLogin() {
        return "login";
    }
}