package com.xpanxion.skeleton.service;

import java.util.List;

import com.xpanxion.skeleton.dto.beans.UserBean;

/**
 * A service dealing with User beans.
 *
 * @author bobby
 *
 */
public interface UserService {

    /**
     * Adds a completely new user.
     *
     */
    void saveUser(UserBean user);

    /**
     * Return all of the available user beans.
     *
     * @return all of the user beans
     */
    List<UserBean> getUserBeans();
    
    /**
     * Return a unique user bean.
     *
     * @return unique user bean
     */
    UserBean getUserById(Long id);
    
    /**
     * Delete a unique user.
     *
     */
    void deleteUser(Long id);


}
