package com.newage.erp.accounting.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.newage.erp.core.entities.StampedNamedEntity;

/**
 *
 * @author mohammed
 */
@Entity
@Table(name = "ACCOUNT")
@NamedQueries(
        @NamedQuery(name = "Account.findNotInTransaction", query = "SELECT q FROM Account q"))
public class Account extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "CODE", unique = true, nullable = false)
    private String code;
    @Column(name = "ACTIVE", nullable = false)
    private Boolean active;
    @ManyToOne
    @JoinColumn(name = "CURRENCY")
    private Currency currency;
    @ManyToOne
    @JoinColumn(name = "PARINT")
    private Account parint;

    public Account() {
    }

    public Account(Long id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Account getParint() {
        return parint;
    }

    public void setParint(Account parint) {
        this.parint = parint;
    }
}
