package com.agroall.gessica.relatorios.services;

import com.agroall.gessica.relatorios.dataobjects.RelatorioVendas;

public class RelatorioVendasService extends RelatoriosService<RelatorioVendas> {

	@Override
	public RelatorioVendas factoryNewDataObject() {
		return new RelatorioVendas();
	}

}
