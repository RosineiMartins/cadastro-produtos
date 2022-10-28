package com.produtos.cadastroprodutos.service;


import com.produtos.cadastroprodutos.entity.Produto;

import java.util.List;

public interface ProdutoService {

Produto salvar(Produto produto);

List<Produto> list();

void deletarProd(Long id);

}

