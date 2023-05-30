package fatec.eng.eng3Mvc.Controller;

import fatec.eng.eng3Mvc.Model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoController()
    {
        produtos.add(new Produto("Caixa de Leite", 5, 9.99f));
        produtos.add(new Produto("Pão", 20, 4.99f));
        produtos.add(new Produto("Suco de uva 500ML", 8, 12.35f));
    }

    @GetMapping
    public String produtos(Model model){
        model.addAttribute("produtos",produtos);
        return "Produtos";
    }

}
