package com.newage.erp.accounting.services;

import java.util.List;

import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;

import com.newage.erp.accounting.entities.Account;
import com.newage.erp.core.services.SuperCRUDService;

/**
 *
 * @author mohammed
 */
@Stateless
//@DeclareRoles({"Account.create", "Account.remove", "Account.update", "Account.desplay"})
public class AccountService extends SuperCRUDService<Account> {

    public AccountService() {
        super(Account.class);
    }
    
    public List<Account> getParints() {
		return dataService.find("Account.findNotInTransaction", Account.class);
	}
}
