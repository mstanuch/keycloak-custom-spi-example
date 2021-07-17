# Keycloak Custom Spi Example

An example how to create custom Spi provider and how to add it to the Keycloak.

## Custom Spi deployment

**TLDR;** run `docker compose up`, run `mvn package` and `./install.sh`

1. Run keycloak
2. Create directory `KEYCLOAK_HOME/providers`
3. Build Spi (`mvn package`)
4. Add jar to `providers` directory
5. Restart server (`KEYCLOAK_HOME/bin/jboss-cli.sh --connect --command:reload`)
6. Your Spi should be available!
    * See "Server Info -> Providers" to verify it.

## How to create custom Spi

1. Implement `Spi`.
2. Create `Provider` and `ProviderFactory` interfaces for your Spi.
3. Implement these interfaces.
4. Create a provider configuration files:
    1. `org.keycloak.provider.Spi` and add your Spi
    2. `your.package.ProviderFactoryInteraface` and add factory implementation