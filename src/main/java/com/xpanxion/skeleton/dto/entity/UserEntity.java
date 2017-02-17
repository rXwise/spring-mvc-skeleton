package com.xpanxion.skeleton.dto.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * UserEntity pojo
 *
 * Represents items from the users table. Exposes one named query that returns all entities from the table
 *
 * @author bobby
 *
 */
@Entity
@Table(name = "users")
@NamedQueries({
    @NamedQuery(name = "users.getAll", query = "from UserEntity"),
    @NamedQuery(name = "users.findById", query = "from UserEntity u where u.id = :id")
})
public class UserEntity {

    private long id;
    private String username;
    private String password;

    /**
     * Returns the Id of the entity. This is the primary key.
     *
     * @return the id of the entity
     */
    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    /**
     * Returns the entities username field
     *
     * @return the username field.
     */
    @Column(name = "username")
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns the entities password field
     *
     * @return the password field.
     */
    @Column(name = "passwrd")
    public String getPassword() {
        return this.password;
    }

    /**
     * Sets the entity's id.
     *
     * @param id
     *            the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the entity's username.
     *
     * @param username
     *            the username to set
     */
    public void setUsername(String name) {
        this.username = name;
    }

    /**
     * Sets the entity's password.
     *
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
