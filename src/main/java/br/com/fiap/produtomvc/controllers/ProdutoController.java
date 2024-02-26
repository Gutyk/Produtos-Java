package br.com.fiap.produtomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//URL - localhost:8080/produtos

// -- código omitido --
@Controller // Gerenciado pelo Spring
@RequestMapping("/produtos") //mapeando URL
public class ProdutoController {

    // Método ou verbo HTTP
    @GetMapping
    public String adicionarProduto(){

        // As Views ficam dentro da pasta templates
        //retorna caminho da página cadastro HTML
        return "produto/novo-produto";
    }

// receber dados da View para cadastrar produto
    @PostMapping()
    public String insertProduto(){
        //provisório
        return "redirect:/produtos";
    }
}


