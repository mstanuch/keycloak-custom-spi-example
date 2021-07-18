# Keycloak Custom Spi Example

An example how to create custom Spi provider and how to add it to the Keycloak.

## Custom Spi deployment

**TLDR;** run `./mvnw package`, run `docker-compose up`

1. Build SPI and create `mstanuch/keycloak-custom-spi` docker images (`./mvw package`)
2. Run this docker image (`docker-compose up`)
3. Your Spi should be available!
    * See "Server Info -> Providers" to verify it.

## How to create custom Spi

1. Implement `Spi`.
2. Create `Provider` and `ProviderFactory` interfaces for your Spi.
3. Implement these interfaces.
4. Create a provider configuration files:
    1. `org.keycloak.provider.Spi` and add your Spi
    2. `your.package.ProviderFactoryInteraface` and add factory implementation