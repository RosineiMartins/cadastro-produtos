package com.produtos.cadastroprodutos.controller;

import com.produtos.cadastroprodutos.entity.Produto;
import com.produtos.cadastroprodutos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(produtoService.salvar(produto));
    }
    @GetMapping
    public ResponseEntity<List<Produto>> produtoList() {
        return ResponseEntity.ok(produtoService.list());

    }
    @DeleteMapping("{id}")
    public String deletarProd(@PathVariable Long id) {
        produtoService.deletarProd(id);
        return "Produto excluido com Sucesso";
    }


}