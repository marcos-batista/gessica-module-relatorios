package com.agroall.gessica.relatorios.dataobjects;

import java.util.Collection;

import com.agroall.gessica.dataobjects.aspects.Persistent;

public class RelatorioVendas implements Persistent {
	
	private Integer id;
	private Collection<OrdemVenda> vendas;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Collection<OrdemVenda> getVendas() {
		return vendas;
	}
	
	public void setVendas(Collection<OrdemVenda> vendas) {
		this.vendas = vendas;
	}
	
}
