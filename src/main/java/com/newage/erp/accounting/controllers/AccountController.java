package com.newage.erp.accounting.controllers;

import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.newage.erp.accounting.entities.Account;
import com.newage.erp.accounting.entities.Currency;
import com.newage.erp.accounting.services.AccountService;
import com.newage.erp.accounting.services.CurrencyService;
import com.newage.erp.core.controllers.SuperCRUDController;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class AccountController extends SuperCRUDController<Account, AccountService> {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CurrencyService currencyService;
	
	public List<Currency> getCurrencies() {
		return currencyService.find();
	}
	
	public List<Account> getParints() {
		return service.getParints();
	}
}
