package dev.stanuch.keycloak.spi.impl;

import dev.stanuch.keycloak.spi.ExampleProvider;
import dev.stanuch.keycloak.spi.ExampleProviderFactory;
import org.keycloak.Config;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class ExampleProviderFactoryImpl implements ExampleProviderFactory {
    @Override
    public ExampleProvider create(KeycloakSession keycloakSession) {
        return new ExampleProviderImpl();
    }

    @Override
    public void init(Config.Scope scope) {

    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

    }

    @Override
    public void close() {

    }

    @Override
    public String getId() {
        return "ExampleProviderFactoryImpl";
    }
}
