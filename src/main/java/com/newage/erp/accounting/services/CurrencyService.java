package com.newage.erp.accounting.services;

import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;

import com.newage.erp.accounting.entities.Currency;
import com.newage.erp.core.services.SuperCRUDService;

/**
 *
 * @author mohammed
 */
@Stateless
//@DeclareRoles({"Currency.create", "Currency.remove", "Currency.update", "Currency.desplay"})
public class CurrencyService extends SuperCRUDService<Currency> {

    public CurrencyService() {
        super(Currency.class);
    }
}
