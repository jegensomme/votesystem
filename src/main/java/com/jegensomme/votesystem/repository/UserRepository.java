package com.jegensomme.votesystem.repository;

import com.jegensomme.votesystem.model.User;

import java.util.Collection;

public interface UserRepository {

    User save(User user);

    boolean delete(int id);

    User get(int id);

    Collection<User> getAll();

    Collection<User> getVoted(int restaurantId);
}
