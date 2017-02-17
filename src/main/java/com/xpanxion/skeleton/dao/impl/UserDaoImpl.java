package com.xpanxion.skeleton.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.skeleton.dao.UserDao;
import com.xpanxion.skeleton.dto.entity.UserEntity;

/**
 * Implementation of the UserDao interface.
 *
 * @author bobby
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void saveUser(UserEntity user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<UserEntity> getAllUsers() {
        return this.sessionFactory.getCurrentSession().getNamedQuery("users.getAll").list();
    }

    @Override
    public UserEntity getUserById(Long id) {
        return (UserEntity) this.sessionFactory.getCurrentSession().getNamedQuery("users.findById").setLong("id", id).uniqueResult();
    }

    @Override
    @Transactional
    public void deleteUser(UserEntity user) {
        this.sessionFactory.getCurrentSession().delete(user);
    }

    /**
     * Sets the session factory for this dao to use.
     *
     * @param factory
     *            the session factory for this dao.
     */
    @Resource
    public void setSessionFactory(SessionFactory factory) {
        this.sessionFactory = factory;
    }

}
