package com.agroall.gessica.relatorios.services;

import com.agroall.gessica.relatorios.dataobjects.RelatorioEstoque;
import com.agroall.gessica.services.ServiceImpl;

public class RelatorioEstoqueService extends ServiceImpl<RelatorioEstoque> {

	@Override
	public RelatorioEstoque factoryNewDataObject() {
		return new RelatorioEstoque();
	}

}
