package com.github.tobiasmiosczka.discordstats.events;

import com.github.tobiasmiosczka.discordstats.model.platform.User;
import org.springframework.context.ApplicationEvent;

public class OnUserVerifiedEvent extends ApplicationEvent {

    private User user;

    public OnUserVerifiedEvent(User user) {
        super(user);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
