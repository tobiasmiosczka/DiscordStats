package com.github.tobiasmiosczka.discordstats.web.exception;

import java.util.Date;

public class PasswordResetTokenExpiredException extends Throwable {

    public PasswordResetTokenExpiredException(final String token, final Date expiryDate) {
        super(token + " " + expiryDate);
    }
}
