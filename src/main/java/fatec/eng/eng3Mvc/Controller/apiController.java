package fatec.eng.eng3Mvc.Controller;

import fatec.eng.eng3Mvc.Model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class apiController {
    private List<Produto> produtos = new ArrayList<Produto>();

    public apiController()
    {
        produtos.add(new Produto("Caixa de Leite", 5, 9.99f));
        produtos.add(new Produto("Pão", 20, 4.99f));
        produtos.add(new Produto("Suco de uva 500ML", 8, 12.35f));
    }

    @GetMapping
    public List<Produto> apiProdutos(){
        return produtos;
    }
}
