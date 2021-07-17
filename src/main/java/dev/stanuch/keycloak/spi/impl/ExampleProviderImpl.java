package dev.stanuch.keycloak.spi.impl;

import dev.stanuch.keycloak.spi.ExampleProvider;

public class ExampleProviderImpl implements ExampleProvider {
    @Override
    public String getExample() {
        return "Example";
    }

    @Override
    public void close() {

    }
}
