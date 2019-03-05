package com.newage.erp.accounting.controllers;

import java.util.List;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.newage.erp.accounting.entities.Account;
import com.newage.erp.accounting.entities.Currency;
import com.newage.erp.accounting.entities.Transaction;
import com.newage.erp.accounting.entities.TransactionDetail;
import com.newage.erp.accounting.services.AccountService;
import com.newage.erp.accounting.services.CurrencyService;
import com.newage.erp.accounting.services.TransactionService;
import com.newage.erp.core.controllers.SuperCRUDController;
import java.util.ArrayList;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class TransactionController extends SuperCRUDController<Transaction, TransactionService> {

    private static final long serialVersionUID = 1L;

    @Inject
    private CurrencyService currencyService;
    @Inject
    private AccountService accountService;

    @Override
    public void prepareCreate() {
        super.prepareCreate();
        item.setType(1);
        item.setTransactionDetails(new ArrayList<>());
        addTransactiondetail();
        addTransactiondetail();
    }

    public void addTransactiondetail() {
        item.getTransactionDetails().add(new TransactionDetail(item));
    }

    public List<Currency> getCurrencies() {
        return currencyService.find();
    }

    public List<Account> getAccounts() {
        return accountService.find();
    }
}
