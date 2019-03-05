package com.newage.erp.accounting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.newage.erp.core.entities.StampedNamedEntity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author mohammed
 */
@Entity
@Table(name = "TRANSACTION_DETAIL")
@NamedQueries({
    @NamedQuery(name = "TransactionDetail.findByTransaction", query = "SELECT q FROM TransactionDetail q WHERE q.transaction.id = :transaction")})
public class TransactionDetail extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "DEBIT_AMOUNT")
    private Double debitAmount;
    @Column(name = "CREDIT_AMOUNT")
    private Double creditAmount;
    @ManyToOne(optional = false)
    @JoinColumn(name = "TRANSACTION", nullable = false)
    private Transaction transaction;
    @ManyToOne(optional = false)
    @JoinColumn(name = "ACCOUNT", nullable = false)
    private Account account;

    public TransactionDetail() {
    }

    public TransactionDetail(Long id) {
        super(id);
    }

    public TransactionDetail(Transaction transaction) {
        this.transaction = transaction;
    }

    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
