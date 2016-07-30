package br.com.turbiani.smartmarvelapppersistence.repository;

import java.util.List;

/**
 * Created by lcunha on 30/07/16.
 */
public abstract class AbstractRepository<T> {
    public abstract void delete (T entity);
    public abstract void insert (T entity);
    public abstract void update (T entity);
    public abstract List<T> selectAll();
}
