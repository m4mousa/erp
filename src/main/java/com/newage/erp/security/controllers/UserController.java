package com.newage.erp.security.controllers;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.newage.erp.core.controllers.SuperCRUDController;
import com.newage.erp.security.entities.SecurityUser;
import com.newage.erp.security.services.UserService;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class UserController extends SuperCRUDController<SecurityUser, UserService> {

    private static final long serialVersionUID = 1L;

    @Override
    public void create() {
        item.setPassword("123");
        super.create();
    }
}
