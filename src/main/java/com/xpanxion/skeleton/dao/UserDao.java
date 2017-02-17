package com.xpanxion.skeleton.dao;

import java.util.List;

import com.xpanxion.skeleton.dto.entity.UserEntity;

/**
 * Interface for the User Dao
 *
 * @author bobby
 *
 */
public interface UserDao {

    void saveUser(UserEntity user);

    /**
     * Returns all of the user entities.
     *
     * @return all of the user entities.
     */
    List<UserEntity> getAllUsers();
    
    UserEntity getUserById(Long id);
    
    void deleteUser(UserEntity user);

}
