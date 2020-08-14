package com.jegensomme.votesystem.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;
import org.springframework.util.CollectionUtils;

public class User extends AbstractNamedEntity {

    private String email;

    private String password;

    private Date registered;

    private Set<Role> roles;

    private LocalDateTime voted;

    private Restaurant restaurant;

    public User() {
    }

    public User(User user) {
        this(user.id, user.name, user.email, user.password, user.getRegistered(), user.getRoles());
    }

    public User(int id, String name, String email, String password, Role role, Role... roles) {
        this(id, name, email, password, new Date(), EnumSet.of(role, roles));
    }

    public User(int id, String name, String email, String password, Date registered, Collection<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.registered = registered;
        setRoles(roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? EnumSet.noneOf(Role.class) : EnumSet.copyOf(roles);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", email=" + email +
                '}';
    }
}
