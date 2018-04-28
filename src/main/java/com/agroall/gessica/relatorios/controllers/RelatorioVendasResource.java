package com.agroall.gessica.relatorios.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.GessicaDataObjectResourceController;
import com.agroall.gessica.relatorios.dataobjects.RelatorioVendas;
import com.agroall.gessica.relatorios.services.RelatorioVendasService;
import com.agroall.gessica.services.Service;

public class RelatorioVendasResource extends GessicaDataObjectResourceController<RelatorioVendas> {
	
	@Autowired private RelatorioVendasService service;
	
	@Override
	protected Service<RelatorioVendas> getService() {
		return this.service;
	}
	
}
