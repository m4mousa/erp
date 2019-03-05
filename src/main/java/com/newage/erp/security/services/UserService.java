package com.newage.erp.security.services;

import com.newage.erp.core.services.SuperCRUDService;
import com.newage.erp.security.entities.SecurityUser;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class UserService extends SuperCRUDService<SecurityUser> {

    public UserService() {
        super(SecurityUser.class);
    }

    public SecurityUser findByUserNamePassword(String userName, String password) {
        return dataService.findOne("SecurityUser.findByUserNamePassword", SecurityUser.class, "userName", userName, "password", password);
    }
}
