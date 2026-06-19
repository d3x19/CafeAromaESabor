package sp.senai.br.cafe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sp.senai.br.cafe.Model.Produto;
import sp.senai.br.cafe.Repository.ProdutoRepository;

@Controller
@RequestMapping(ProdutoController.ROTA_PRODUTO)
public final class ProdutoController {

    public static final String ROTA_PRODUTO = "/produto";
    public static final String ROTA_CADASTRAR = "/cadastrar";

    private static final String DIRETORIO_VIEWS_PRODUTO = "produto";
    private static final String VIEW_LISTAGEM = DIRETORIO_VIEWS_PRODUTO + "/listagem";
    private static final String VIEW_FORMULARIO_CADASTRO = DIRETORIO_VIEWS_PRODUTO + "/form-inserir";
    private static final String VIEW_FORMULARIO_ALTERAR = DIRETORIO_VIEWS_PRODUTO + "/form-alterar";

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProdutos(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        return VIEW_LISTAGEM;
    }

    @GetMapping(ROTA_CADASTRAR)
    public String exibirFormularioCadastro() {
        return VIEW_FORMULARIO_CADASTRO;
    }

    @PostMapping(ROTA_CADASTRAR)
    public String processarFormularioCadastro(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:" + ROTA_PRODUTO;
    }

    @GetMapping("/alterar/{id}")
    public String exibirFormularioAlterar(@PathVariable Long id, Model model) {
        Produto produto = produtoRepository.findById(id).orElseThrow();
        model.addAttribute("produto", produto);
        return VIEW_FORMULARIO_ALTERAR;
    }

    @PostMapping("/alterar/{id}")
    public String processarFormularioAlterar(@PathVariable Long id, Produto produto) {
        Produto existente = produtoRepository.findById(id).orElseThrow();
        existente.setNome(produto.getNome());
        existente.setPreco(produto.getPreco());
        existente.setQuantidade(produto.getQuantidade());
        produtoRepository.save(existente);
        return "redirect:" + ROTA_PRODUTO;
    }

    @GetMapping("/excluir/{id}")
    public String excluirProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:" + ROTA_PRODUTO;
    }
}