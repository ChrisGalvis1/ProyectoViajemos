package com.utils;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.util.EnvironmentVariables;

public class LoginConfig {

    private static final EnvironmentVariables environmentVariables = Serenity.environmentVariables();

    public static String getBaseUrl() {
        return environmentVariables.optionalProperty("serenity.webdriver.baseUrl").orElse("defaultBaseUrl");
    }

    public static String getUsername() {
        return environmentVariables.optionalProperty("serenity.login.username").orElse("defaultUsername");
    }

    public static String getPassword() {
        return environmentVariables.optionalProperty("serenity.login.password").orElse("defaultPassword");
    }
}
