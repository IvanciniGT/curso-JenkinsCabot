# Quiero mi propia imagen de contenedor
# Basada en la imagen de tomcat de la gente de bitmani
FROM bitnami/tomcat:9.0
# A la que le añado mi war, dentro de la imagen
COPY target/*.war /opt/bitnami/tomcat/webapps
# podría meter más ficheros de conf que necesite
# o driver de BBDD
ENV ALLOW_EMPTY_PASSWORD=yes