package com.jegensomme.votesystem.model;

import java.time.LocalDateTime;

public class Vote {

    private Integer userId;

    private Integer restaurantId;

    private LocalDateTime dateTime;

    public Vote(int userId, int restaurantId, LocalDateTime dateTime) {
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.dateTime = dateTime;
    }
}

