package com.jegensomme.votesystem.repository;

import com.jegensomme.votesystem.model.Restaurant;

import java.util.Collection;

public interface RestaurantRepository {

    Restaurant save(Restaurant restaurant);

    boolean delete(int id);

    Restaurant get(int id);

    Collection<Restaurant> getAll();
}
