package com.newage.erp.accounting.services;

import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;

import com.newage.erp.accounting.entities.Transaction;
import com.newage.erp.core.services.SuperCRUDService;

/**
 *
 * @author mohammed
 */
@Stateless
//@DeclareRoles({"Transaction.create", "Transaction.remove", "Transaction.update", "Transaction.desplay"})
public class TransactionService extends SuperCRUDService<Transaction> {

    public TransactionService() {
        super(Transaction.class);
    }
}
