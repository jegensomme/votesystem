package com.jegensomme.votesystem.model;

import java.util.Map;

public class Restaurant extends AbstractBaseEntity {

    public static final Map<String, Integer> TEST_MENU = Map.of(
            "Котлета с пюре", 10,
            "Оливье", 5,
            "Водка 100г", 2
    );

    private Map<String, Integer> menu;

    public Restaurant() {
    }

    public Restaurant(Restaurant restaurant, Map<String, Integer> menu) {
        this(restaurant.id, restaurant.menu);
    }

    public Restaurant(int id, Map<String, Integer> menu) {
        super(id);
        this.menu = menu;
    }

    public Map<String, Integer> getMenu() {
        return menu;
    }

    public void setMenu(Map<String, Integer> menu) {
        this.menu = menu;
    }
}
