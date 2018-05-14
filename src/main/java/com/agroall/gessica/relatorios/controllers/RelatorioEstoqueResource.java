package com.agroall.gessica.relatorios.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.relatorios.dataobjects.RelatorioEstoque;
import com.agroall.gessica.relatorios.services.RelatorioEstoqueService;
import com.agroall.gessica.services.Service;

public class RelatorioEstoqueResource extends DataObjectResourceControllerImpl<RelatorioEstoque> {

	@Autowired private RelatorioEstoqueService service;
	
	@Override
	protected Service<RelatorioEstoque> getService() {
		return this.service;
	}

}
