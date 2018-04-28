package com.agroall.gessica.relatorios.dataobjects;

import com.agroall.gessica.dataobjects.Venda;
import com.agroall.gessica.dataobjects.aspects.Persistent;

public class OrdemVenda extends Venda implements Persistent {
	
	private Integer id;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
}
