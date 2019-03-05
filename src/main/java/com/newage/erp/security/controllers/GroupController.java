package com.newage.erp.security.controllers;

import com.newage.erp.core.controllers.SuperCRUDController;
import com.newage.erp.security.entities.SecurityGroup;
import com.newage.erp.security.services.GroupService;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class GroupController extends SuperCRUDController<SecurityGroup, GroupService> {
	private static final long serialVersionUID = 1L;
}
