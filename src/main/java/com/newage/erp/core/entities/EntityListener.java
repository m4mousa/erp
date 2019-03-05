package com.newage.erp.core.entities;

import com.newage.erp.security.entities.SecurityUser;
import java.util.Date;
import javax.faces.context.FacesContext;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author mohammed
 */
public class EntityListener {

    @PrePersist
    public void preCreate(StampedEntity entity) {
        entity.setCreateTime(new Date());
        entity.setCreateUser(new SecurityUser((Long) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userId")));
    }

    @PreUpdate
    public void preUpdate(StampedEntity entity) {
        entity.setUpdateTime(new Date());
        entity.setUpdateUser(new SecurityUser((Long) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userId")));
    }
}
