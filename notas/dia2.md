$ docker [tipo objeto] [verbo] <argumentos>
                        list    --all
                        rm
                        inspect
         container      
                        create
                        start
                        stop
                        logs
         image
                        pull
         volume
         network
         
         
Forma canonica                      Alias
docker container list               docker ps
docker image list                   docker images
docker container start              docker start
docker image pull                   docker pull
docker container rm                 docker rm
docker image rm                     docker rmi
docker exec -it NOMBRE bash

docker rm $(docker container list --all -q) -f


docker run -d --name minginx -p 0.0.0.0:81:80 nginx:latest
docker run -d --name minginx -p 81:80 nginx:latest


Mi host:
loopback: 127.0.0.1 (localhost)
eth:      172.31.2.202
docker:   172.17.0.1

---
Al crear un contenedor, el contenedor tiene su propio FileSystem.

---
Imagen nginx:

/
/etc
/home
/var
    /lib
        /docker
            /images
                /nginx                      <<<<<< /                change root
                    /etc
                        nginx/nginx.conf
                    /home
                    /var
                        /www/html
                    /opt
                        /nginx
                    /root
                    /home
                    /bin
                        ls
                        mkdir
                        bash
            /containers
                /minginx
/opt
/root


Proceso PID X           ---> Cuando preguntes por el FS /   

--------------------------------------------------------------------------------
Filesystem de un conteendor:
--------------------------------------------------------------------------------
VOLUMEN: Carpeta que reside en el host y que monto (comparto) a nivel del contenedor: /home/ubuntu/environment/datos/mysql    
                            /var/mysql
CAPA CONTENEDOR:
                                             /tmp/archivoNuevo              /root/fichero.txt
CAPA BASE: IMAGEN
                    /etc    /var    /bin    /tmp                            /root
--------------------------------------------------------------------------------
                    
Si creo 17 contenedores desde esta imagen


/bin        binarios
/etc        config
/opt        software
/home       carpetas de usuario
/root       carpeta del usuario root
/tmp
/mnt        punto de montaje
/var        Datos persistentes de programas


MV:  Mysql 5.6 -> 5.7
C: MySQL 5.6 ---> Tiro a la basura
C: MySQL 5.7 !

Al trabajar con contenedores, los volumenes se usan para:
- Hacer persistentes los datos del contenedor tras su borrado
- Inyectar ficheros/carpetas del host al contenedor
- Comunicar contenedores

Contenedor tomcat

/var/tomcat/webapps/ <<< war

Opción1:
Monto un volumen que apunte a /var/tomcat/webapps/

Opción 2: 
No monto volumen y cargo la app a través de las utilidades de tomcat: Manager GUI, HTTP

Opción 3: GUAY !!!!!
Montar nuestra propia imagen de contenedor que parta de la imagen de tomcat a la que le 
inyectamos el WAR en la carpeta adecuada.


Yo estoy trabajando en mi equipo desarrollo ....
Mi compañero también
Entorno de Pre ---> ZIP
Entorno de pro ---> ZIP

cluster - Kubernetes
ZIP 2 maquinas
ZIP ---> maquina 3




Proyecto JAVA MAVEN
                pom.xml YO !!!!
                    dependencias
                    props
                    plugins
                    
Jenkins -> plugins-> maven con mi fichero pom.xml
Jenkins -> plugin -> docker con mi fichero Dockerfile
    
            Tuviera su persistencia en RAM: 100kbs: 50Kbs+50Kbs
            ^
Tomcat -> log (apache: Accesslog) --> Carpeta       
            ^
            Filebeat -- Logstash, Kafka--> ES < Kibana              sidecar
            
systemd      
    ^ systemctl
    
dockerd
    ^ docker 
    ^ docker-compose
    
    
docker container create -e BBDD=bd.sqlserver.prod.cabot.es
                        --name minginxNuevo 
                        -v /home/ubuntu/environment/datos/prueba:/datos 
                        -p 81:80
                        nginx:latest

Jenkins

plugin MAVEN: Ventanita con cajitas
    VVVV
$ mvn package 
$ mvn install

Entorno: JAVA + MAVEN
Java+Maven(pom.xml)

Nosotros creamos Pipelines/Proyectos dentro de Jenkins
Cada proyecto tiene una carpeta en el servidor, con los ficheros de ese proyecto


Temis -> GIT ???? .java, .jsp, css, imagenes

mvn --> src                     ME INTERESA? Lo miraré
    --> target                  ME HACE FALTA EN EL WORKSPACE?
            compiled-classes        Tarda mucho en compilar todo el proyecto? Lo miraré
            surefire-reports 
            temis
            temis.war           NO HACE FALTA EN EL WORKSPACE
            
Al final, que me interesa mantener WAR... pero... me interesa solo el ultimo WAR? NO, NI DE COÑA
Quiero el historial de WARS... con sus versiones !
    |
    |---------> WAR (Artefacto) -------> temis-1-0-0.war
                                         temis-1-0-1.war
                                            |
                                            |--> Repo de Artefactos (Jenkins)
                                            
A priori no me interesa NADA... quiero que todo se borre y tenga un entorno limpio desde 0 donde trabajar






https://d67e8eda12f246168ade3c73847a1209.vfs.cloud9.eu-west-1.amazonaws.com
    /job/Prueba1/lastSuccessfulBuild/artifact/app.war
    https://d67e8eda12f246168ade3c73847a1209.vfs.cloud9.eu-west-1.amazonaws.com
    /job/Prueba1/19/artifact/app.war
    
lastCompletedBuild 20
lastFailedBuild -1
lastStableBuild 20
lastSuccessfulBuild 20
lastUnstableBuild -1
lastUnsuccessfulBuild -1

    
    
    
    
Un proceso de ENTREGA CONTINUA. Continuous delivery


TDD - Desarrollo dirigido por las pruebas!
BDD - Desarrollo dirigido por por comportamiento

mvn

    compile
        test-compile
            test
                package
                    install
                    
                    
------
ProyectoMaven1

Git -> Compilar -> Unit test -> Llamada a Sonar -> Leer sonar -> package -> Guardar resultados pruebas -> Guardar artefacto
                                 mvn sonar:sonar    Plugin
                                 La operación se hará asíncronamente