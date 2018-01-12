package com.github.tobiasmiosczka.discordstats.persistence.model;

import javax.persistence.Entity;

@Entity
public class DiscordUser extends DiscordEntity {

    private String name;
    private String avatarUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
