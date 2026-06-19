package sp.senai.br.cafe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class EstoqueController {

    private static final String ROTA_ESTOQUE = "/estoque";
    private static final String ROTA_MOVIMENTACAO = "/movimentacao";
    private static final String VIEW_MOVIMENTACAO_ESTOQUE = "estoque/movimentacao";

    @GetMapping(ROTA_ESTOQUE)
    public String exibirEstoque() {
        return VIEW_MOVIMENTACAO_ESTOQUE;
    }

    @GetMapping(ROTA_MOVIMENTACAO)
    public String exibirFormularioMovimentacao() {
        return VIEW_MOVIMENTACAO_ESTOQUE;
    }
}