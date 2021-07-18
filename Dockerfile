FROM jboss/keycloak:14.0.0

ARG JAR_FILE=target/*.jar
ARG KC_DIR=/opt/jboss/keycloak
COPY ${JAR_FILE} ${KC_DIR}/providers/