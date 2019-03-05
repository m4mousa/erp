package com.newage.erp.security.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.newage.erp.core.entities.StampedNamedEntity;
import javax.persistence.FetchType;

/**
 *
 * @author mohammed
 */
@Entity
@Table(name = "SECURITY_USER")
@NamedQuery(name = "SecurityUser.findByUserNamePassword", query = "SELECT u FROM SecurityUser u WHERE u.userName = :userName AND u.password = :password")
public class SecurityUser extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "USER_NAME", unique = true, nullable = false)
    private String userName;
    @Column(name = "PASSWORD")
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_GROUP",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "GROUP_ID", referencedColumnName = "ID"))
    List<SecurityGroup> groups;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_PERMISSION",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "ID"))
    List<SecurityPermission> permissions;

    public SecurityUser() {
    }

    public SecurityUser(Long id) {
        super(id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SecurityGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<SecurityGroup> groups) {
        this.groups = groups;
    }

    public List<SecurityPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SecurityPermission> permissions) {
        this.permissions = permissions;
    }

}
