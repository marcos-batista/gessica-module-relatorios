package com.agroall.gessica.relatorios.dataobjects;

import java.util.Collection;

public class RelatorioVendas {
	
	private Collection<OrdemVenda> vendas;
	
	public Collection<OrdemVenda> getVendas() {
		return vendas;
	}
	
	public void setVendas(Collection<OrdemVenda> vendas) {
		this.vendas = vendas;
	}
	
}
