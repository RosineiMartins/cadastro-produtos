package com.produtos.cadastroprodutos.repository;

import com.produtos.cadastroprodutos.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
