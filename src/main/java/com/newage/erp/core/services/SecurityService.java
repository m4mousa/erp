package com.newage.erp.core.services;

import java.util.Objects;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;

/**
 *
 * @author mohammed
 */
@Stateless
public class SecurityService {

    @Inject
    private SecurityContext securityContext;

    public boolean hasPermission(String permission) {
        if (Objects.equals(securityContext.getCallerPrincipal().getName(), "admin")) {
            return true;
        }
        return securityContext.isCallerInRole(permission);
    }
}
