package com.agroall.gessica.relatorios.services;

import com.agroall.gessica.relatorios.dataobjects.RelatorioEstoque;

public class RelatorioEstoqueService extends RelatoriosService<RelatorioEstoque> {

	@Override
	public RelatorioEstoque factoryNewDataObject() {
		return new RelatorioEstoque();
	}

}
