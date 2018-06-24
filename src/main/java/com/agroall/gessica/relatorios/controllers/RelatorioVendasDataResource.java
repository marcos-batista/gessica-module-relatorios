package com.agroall.gessica.relatorios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agroall.gessica.controllers.DataObjectResourceControllerImpl;
import com.agroall.gessica.relatorios.dataobjects.RelatorioVendas;
import com.agroall.gessica.relatorios.services.RelatorioVendasService;
import com.agroall.gessica.services.Service;

@RestController
@RequestMapping("/vendas")
@CrossOrigin
public class RelatorioVendasDataResource extends DataObjectResourceControllerImpl<RelatorioVendas> {
	
	@Autowired private RelatorioVendasService service;
	
	@Override
	protected Service<RelatorioVendas> getService() {
		return this.service;
	}
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public RelatorioVendas doGet() {
		return super.doGet();
	}
	
}
