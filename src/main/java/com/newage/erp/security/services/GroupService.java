package com.newage.erp.security.services;

import com.newage.erp.core.services.SuperCRUDService;
import com.newage.erp.security.entities.SecurityGroup;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class GroupService extends SuperCRUDService<SecurityGroup> {

    public GroupService() {
        super(SecurityGroup.class);
    }
}
