package com.jegensomme.votesystem.repository.inmemory;

import com.jegensomme.votesystem.model.Restaurant;
import com.jegensomme.votesystem.repository.RestaurantRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class InMemoryRestaurantRepository extends InMemoryBaseRepository<Restaurant> implements RestaurantRepository {

    public void init() {
        map.clear();
        map.put(1, new Restaurant(1, Restaurant.TEST_MENU));
    }

    @Override
    public Collection<Restaurant> getAll() {
        return getCollection();
    }
}
