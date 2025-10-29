package com.produto.api.controller;

import com.produto.api.model.ProdutoModel;
import com.produto.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/Listar")
    public Iterable<ProdutoModel> listar(){
        return produtoService.listar();
    }

}
