package com.newage.erp.core.services;

import java.util.List;
import javax.inject.Inject;

import com.newage.erp.core.entities.SuperEntity;

/**
 *
 * @author mohammed
 * @param <T>
 */
public class SuperCRUDService<T extends SuperEntity> {

    protected final Class<T> entityClass;

    @Inject
    protected DataService dataService;

    public SuperCRUDService(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public List<T> find() {
        return dataService.find(entityClass);
    }

    public T find(Long id) {
        return dataService.find(entityClass, id);
    }

    public void create(T entity) {
        dataService.persist(entity);
    }

    public void update(T entity) {
        dataService.merge(entity);
    }

    public void remove(T entity) {
        dataService.remove(entity);
    }

    public Class<T> getEntityClass() {
        return entityClass;
    }
}
