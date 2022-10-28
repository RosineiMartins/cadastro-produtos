package com.produtos.cadastroprodutos.service;

import com.produtos.cadastroprodutos.entity.Produto;
import com.produtos.cadastroprodutos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> list() {
        return produtoRepository.findAll();
    }

    @Override
    public void deletarProd(Long id) {
        produtoRepository.deleteById(id);
    }


}
