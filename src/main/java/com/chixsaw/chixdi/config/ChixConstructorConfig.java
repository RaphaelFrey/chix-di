package com.chixsaw.chixdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * Created by Raphael Frey on 26.11.2022
 */
@ConstructorBinding
@ConfigurationProperties("chixsaw")
public class ChixConstructorConfig {

    private final String username;
    private final String password;
    private final String jdbcUrl;

    public ChixConstructorConfig(String username, String password, String jdbcUrl) {
        this.username = username;
        this.password = password;
        this.jdbcUrl = jdbcUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
