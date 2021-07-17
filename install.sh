#!/bin/zsh

KC_DIR="/opt/jboss/keycloak"

docker exec keycloak sh -c "mkdir -p ${KC_DIR}/providers"

docker cp \
  target/*.jar \
  "keycloak:${KC_DIR}/providers/"

docker exec keycloak sh -c "${KC_DIR}/bin/jboss-cli.sh --connect --command=:reload"