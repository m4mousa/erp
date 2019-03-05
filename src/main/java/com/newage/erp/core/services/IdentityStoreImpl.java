package com.newage.erp.core.services;

import com.newage.erp.security.entities.SecurityUser;
import com.newage.erp.security.services.UserService;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.CallerPrincipal;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import static javax.security.enterprise.identitystore.CredentialValidationResult.INVALID_RESULT;
import static javax.security.enterprise.identitystore.CredentialValidationResult.NOT_VALIDATED_RESULT;
import javax.security.enterprise.identitystore.IdentityStore;

/**
 *
 * @author mohammed
 */
@RequestScoped
public class IdentityStoreImpl implements IdentityStore {

    @Inject
    private UserService userService;

    @Override
    public CredentialValidationResult validate(Credential credential) {
        if (credential instanceof UsernamePasswordCredential) {
            return validate((UsernamePasswordCredential) credential);
        }
        return NOT_VALIDATED_RESULT;
    }

    private CredentialValidationResult validate(UsernamePasswordCredential usernamePasswordCredential) {
        SecurityUser user = userService.findByUserNamePassword(usernamePasswordCredential.getCaller(), usernamePasswordCredential.getPasswordAsString());
        if (Objects.nonNull(user)) {
            Set<String> groups = new HashSet<>();
            groups.add("login");
            user.getGroups().forEach((group) -> {
                group.getPermissions().forEach((permission) -> {
                    groups.add(permission.getPermission());
                });
            });
            user.getPermissions().forEach((permission) -> {
                groups.add(permission.getPermission());
            });
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("userId", user.getId());
            return new CredentialValidationResult(new CallerPrincipal(user.getUserName()), groups);
        }
        return INVALID_RESULT;
    }
}
