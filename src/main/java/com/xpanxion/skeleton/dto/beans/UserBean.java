package com.xpanxion.skeleton.dto.beans;

/**
 * User Bean Pojo
 *
 * @author bobby
 *
 */
public class UserBean {

    private long id;
    private String username;
    private String password;

    /**
     * Returns the id of this bean
     *
     * @return the id the id of this bean
     */
    public long getId() {
        return this.id;
    }

    /**
     * Returns the username of this bean
     *
     * @return the username the username of this bean
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the password of this bean
     *
     * @return the password the password of this bean
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the id of this bean
     *
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the username of this bean
     *
     * @param username
     *            the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password of this bean
     *
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
