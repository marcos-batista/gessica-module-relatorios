package com.agroall.gessica.relatorios.services;

import com.agroall.gessica.relatorios.dataobjects.RelatorioVendas;
import com.agroall.gessica.services.ServiceImpl;

public class RelatorioVendasService extends ServiceImpl<RelatorioVendas> {

	@Override
	public RelatorioVendas factoryNewDataObject() {
		return new RelatorioVendas();
	}

}
