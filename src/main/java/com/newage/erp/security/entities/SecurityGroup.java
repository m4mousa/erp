package com.newage.erp.security.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.newage.erp.core.entities.StampedNamedEntity;

/**
 *
 * @author mohammed
 */
@Entity
@Table(name = "SECURITY_GROUP")
public class SecurityGroup extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @ManyToMany(mappedBy = "groups")
    private List<SecurityUser> users;
    @ManyToMany
    @JoinTable(name = "GROUP_PERMISSION", joinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID"))
    private List<SecurityPermission> permissions;

    public SecurityGroup() {
    }

    public SecurityGroup(Long id) {
        super(id);
    }

    public List<SecurityUser> getUsers() {
        return users;
    }

    public void setUsers(List<SecurityUser> users) {
        this.users = users;
    }

    public List<SecurityPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SecurityPermission> permissions) {
        this.permissions = permissions;
    }
}
