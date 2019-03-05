package com.newage.erp.accounting.controllers;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.newage.erp.accounting.entities.Currency;
import com.newage.erp.accounting.services.CurrencyService;
import com.newage.erp.core.controllers.SuperCRUDController;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class CurrencyController extends SuperCRUDController<Currency, CurrencyService> {
	private static final long serialVersionUID = 1L;
}
