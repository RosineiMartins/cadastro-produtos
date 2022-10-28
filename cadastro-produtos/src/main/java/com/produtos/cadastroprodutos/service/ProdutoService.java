package com.produtos.cadastroprodutos.service;


import com.produtos.cadastroprodutos.entity.Produto;

import java.util.List;

public interface ProdutoService {

public Produto salvar(Produto produto);

public List<Produto> list();

}
