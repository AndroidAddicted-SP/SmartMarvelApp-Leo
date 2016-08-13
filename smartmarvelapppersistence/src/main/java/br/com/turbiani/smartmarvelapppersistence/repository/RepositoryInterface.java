package br.com.turbiani.smartmarvelapppersistence.repository;

import java.util.List;

/**
 * Created by lcunha on 30/07/16.
 */
public interface RepositoryInterface<T> {
    List<T> findAll();
    T findByEntity(T entity);
}
