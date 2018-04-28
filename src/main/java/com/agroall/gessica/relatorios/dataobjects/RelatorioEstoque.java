package com.agroall.gessica.relatorios.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class RelatorioEstoque implements Persistent {
	
	private Integer id;

	private Collection<ProdutoEstoque> produtos;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Collection<ProdutoEstoque> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Collection<ProdutoEstoque> produtos) {
		this.produtos = produtos;
	}
	
}
