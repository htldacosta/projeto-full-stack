package com.produto.api.controller;

import com.produto.api.model.ProdutoModel;
import com.produto.api.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel produtoModel) {
        return produtoService.cadastrar(produtoModel);
    }

    @GetMapping("/Listar")
    public Iterable<ProdutoModel> listar(){
        return produtoService.listar();
    }

}
