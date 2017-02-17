package com.xpanxion.skeleton.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xpanxion.skeleton.dao.UserDao;
import com.xpanxion.skeleton.dto.beans.UserBean;
import com.xpanxion.skeleton.dto.entity.UserEntity;
import com.xpanxion.skeleton.service.UserService;

/**
 * Implementation of the user service interface.
 *
 * @author bobby
 *
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void saveUser(UserBean user) {
        UserEntity entity = new UserEntity();
        entity.setUsername(user.getUsername());
        entity.setPassword(user.getPassword());
        this.userDao.saveUser(entity);
    }

    /*
     * (non-Javadoc)
     *
     * @see com.xpanxion.skeleton.service.UserService#getTestBeans()
     */
    @Override
    public List<UserBean> getUserBeans() {
        List<UserEntity> userItems = this.userDao.getAllUsers();
        List<UserBean> output = new ArrayList<UserBean>();
        for (UserEntity entity : userItems) {
            UserBean bean = new UserBean();
            BeanUtils.copyProperties(entity, bean);
            bean.setUsername(entity.getUsername());
            output.add(bean);
        }
        return output;
    }

    @Override
    public UserBean getUserById(Long id) {
        UserEntity entity = this.userDao.getUserById(id);
        UserBean bean = new UserBean();
        BeanUtils.copyProperties(entity, bean);
        return bean;
    }

    @Override
    public void deleteUser(Long id) {
        UserEntity entity = this.userDao.getUserById(id);
        this.userDao.deleteUser(entity);
    }

    /**
     * Sets the UserDao for this service to use
     *
     * @param dao
     *            the dao for this service to use.
     */
    @Resource
    public void setUserDao(UserDao dao) {
        this.userDao = dao;
    }
}
