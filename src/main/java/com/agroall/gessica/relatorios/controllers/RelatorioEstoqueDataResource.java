package com.agroall.gessica.relatorios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.relatorios.dataobjects.RelatorioEstoque;
import com.agroall.gessica.relatorios.services.RelatorioEstoqueService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/estoque")
@CrossOrigin
public class RelatorioEstoqueDataResource extends DataObjectResourceControllerImpl<RelatorioEstoque> {

	@Autowired private RelatorioEstoqueService service;
	
	@Override
	protected Service<RelatorioEstoque> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public RelatorioEstoque doGet() {
		return super.doGet();
	}
	
}
