package com.newage.erp.accounting.services;

import javax.annotation.security.DeclareRoles;
import javax.ejb.Stateless;

import com.newage.erp.accounting.entities.TransactionDetail;
import com.newage.erp.core.services.SuperCRUDService;
import java.util.List;

/**
 *
 * @author mohammed
 */
@Stateless
//@DeclareRoles({"TransactionDetail.create", "TransactionDetail.remove", "TransactionDetail.update", "TransactionDetail.desplay"})
public class TransactionDetailService extends SuperCRUDService<TransactionDetail> {

    public TransactionDetailService() {
        super(TransactionDetail.class);
    }

    public List<TransactionDetail> findByTransaction(Long transaction) {
        return dataService.find("TransactionDetail.findByTransaction", TransactionDetail.class, "transaction", transaction);
    }
}
