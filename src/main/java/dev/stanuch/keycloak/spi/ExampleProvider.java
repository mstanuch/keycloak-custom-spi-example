package dev.stanuch.keycloak.spi;

import org.keycloak.provider.Provider;

public interface ExampleProvider extends Provider {
    String getExample();
}
