package com.newage.erp.security.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.newage.erp.core.entities.StampedNamedEntity;

/**
 *
 * @author mohammed
 */
@Entity
@Table(name = "SECURITY_PERMISSION")
public class SecurityPermission extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "PERMISSION", unique = true, nullable = false)
    private String permission;

    public SecurityPermission() {
    }

    public SecurityPermission(Long id) {
        super(id);
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
