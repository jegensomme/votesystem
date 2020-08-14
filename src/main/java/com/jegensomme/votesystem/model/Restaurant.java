package com.jegensomme.votesystem.model;

import java.util.Map;

public class Restaurant extends AbstractNamedEntity {

    private Map<String, Integer> menu;

    public Restaurant() {
    }

    public Restaurant(int id, String name) {
        super(id, name);
    }

    public Map<String, Integer> getMenu() {
        return menu;
    }

    public void setMenu(Map<String, Integer> menu) {
        this.menu = menu;
    }
}
