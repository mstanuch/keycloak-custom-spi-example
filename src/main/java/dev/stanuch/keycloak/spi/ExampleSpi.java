package dev.stanuch.keycloak.spi;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class ExampleSpi implements Spi {
    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return "ExampleSpi";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return ExampleProvider.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return ExampleProviderFactory.class;
    }
}
