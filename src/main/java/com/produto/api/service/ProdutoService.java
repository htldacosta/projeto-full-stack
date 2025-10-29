package com.produto.api.service;

import com.produto.api.model.ProdutoModel;
import com.produto.api.model.ResponseModel;
import com.produto.api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ResponseModel responseModel;

    public Iterable<ProdutoModel> listar(){
        return produtoRepository.findAll();
    }

    public ResponseEntity<?> cadastrar(ProdutoModel produtoModel){
        if (produtoModel.getNome().equals("")) {
            responseModel.setMensagem("O nome do produto é obrigatório!");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        }else if (produtoModel.getMarca().equals("")){
            responseModel.setMensagem("O nome da marca é obrigatório!");
            return new ResponseEntity<ResponseModel>(responseModel, HttpStatus.BAD_REQUEST);
        }else {
            return new ResponseEntity<ProdutoModel>(produtoRepository.save(produtoModel), HttpStatus.CREATED);
        }

    }
}
