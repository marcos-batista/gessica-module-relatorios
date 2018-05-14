package com.agroall.gessica.relatorios.dataobjects;

import java.util.Collection;

public class RelatorioEstoque {
	
	private Collection<ProdutoEstoque> produtos;
	
	public Collection<ProdutoEstoque> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(Collection<ProdutoEstoque> produtos) {
		this.produtos = produtos;
	}
	
}
