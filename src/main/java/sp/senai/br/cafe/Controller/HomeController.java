package sp.senai.br.cafe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sp.senai.br.cafe.Repository.ProdutoRepository;

@Controller
public class HomeController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("totalProdutos", produtoRepository.count());
        return "home";
    }
}
