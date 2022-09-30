# Quiero mi propia imagen de contenedor
# Basada en la imagen de tomcat de la gente de bitmani
FROM eclipse-temurin:11-jdk-focal
# A la que le añado mi war, dentro de la imagen
RUN apt update
RUN apt install jmeter -y
VOLUME [/report]
CMD ["jmeter", "-n", "-t", "/report/test.jmx", "-l", "/report/report.xml", "-Jjmeter.save.saveservice.output_format=xml"]


#docker run --rm -v $PWD:/report jmeter:latest