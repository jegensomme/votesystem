package com.jegensomme.votesystem.repository.inmemory;

import com.jegensomme.votesystem.model.Restaurant;
import com.jegensomme.votesystem.model.User;
import com.jegensomme.votesystem.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Repository
public class InMemoryUserRepository extends InMemoryBaseRepository<User> implements UserRepository {

    @Override
    public Collection<User> getAll() {
        return filterByPredicate(u -> true);
    }

    @Override
    public Collection<User> getVoted(int restaurantId) {
        return filterByPredicate(u -> {
            Restaurant voted = u.getRestaurant();
            return voted == null ? false : voted.getId() == restaurantId;
        });
    }

    private List<User> filterByPredicate(Predicate<User> filter) {
        return getCollection().stream()
                        .filter(filter)
                        .sorted(Comparator.comparing(User::getName).thenComparing(User::getEmail).reversed())
                        .collect(Collectors.toList());
    }
}
