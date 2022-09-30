CI - Integración continua

Entorno de pruebas automatizado
Pobre que te cagas !!! Hacemos 4 pruebas

CD - Entrega Continua

https://d67e8eda12f246168ade3c73847a1209.vfs.cloud9.eu-west-1.amazonaws.com/
    job/ProyectoMaven1/lastSuccessfulBuild/artifact/target/proyecto1-1.0-SNAPSHOT.jar

CD - Despliegue continuo

El desarrollador hace commit en DESARROLLO -> MERGE -> RELEASE -> MAIN

Smoke Test

---

Que borrar al final:
1 - Todo    - GIT
2 - target  - Si quiero partir de 0... Esto me suele interesar
3 - Borro cosas de la carpeta target

Necesidades de espacio en el servidor de jenkins


Entorno de producción:
- HA
- Escalabilidad

Kubernetes - Replicación

Kubernetes
    Jenkins
        Pod Kubernetes -> Pipeline
    Sonar
    Postgres



Si pongo la IP del contenedor: A que puerto he de atacar? Al del contenedor: 9000

docker-compose Docker crear una red virtual SOLO para los contendores de ese fichero de despliegue

No tengo garantía de que la IP de un contenedor se mantenga.

---
Al final, Jenkins lo UNICO que hace es abrir una terminal de comandos y ejecutar procesos.
En esa terminal tendremos disponibles unas variables de ENTORNO.
Esa terminal se abre en el WORKSPACE

Cómo sabemos si un comando acaba bien? TODO proceso en un SO (Windows incluido)
acaba con un código de respuesta (exit code)
Si el exit code es 0, se entiende que el proceso ha acabado? BIEN
Cualquier otro valor: MAL

Jenkins solo pide el codigo de salida del ultimo comando, para ver si las cosas van bien o no!
---
Acciones:
- Compile                       √
- Pruebo EXPLOTA !!!            x
- Sonar                         -     Skip
- Empaqueta                     -     Skip
    
Acciones para ejecutar después, a pesar de haber un error, se ejecutan:
- GUARDAR ARTEFACTOS            √
- PUBLICAR JUNIT                x
- BORRAR EL WORKSPACE           √

-- ---> POBRE !!!!!!!


Proyectos de estilo libre:
- No tienen control de versión
- No puedo replicar entre instalaciones un pipeline
- Tienen una funcionalidad limitada
- ----> RUINA GIGANTE !!!!!!

Proyectos de tipo PIPELINE: Aquí montamos scripts en lenguaje GROOVY
Esos scripts los metemos en unos ficheros que llamaremos Jenkinsfile
Y Jenkins ofrece 2 sintaxis diferentes para estos ficheros:
- Declarativa       < Esta también es GUAY, menos potente... pero mucho más sencilla...
                      infinitamente más potente que los proyectos FREE STYLE. Cubre el 99% de los casos de uso
- Scripted          < Esta es la GUAY, más potente... más compleja
- 

En un fichero con sintaxis SCRIPTED no puedo usar sintaxis DECLARATIVA
En un fichero con sintaxis DECLARATIVA puedo meter porciones de código SCRIPTED


Selenium

-> AUTOMATIZAR pruebas en un navegador WEB
IDE? NO... como mucho para ayudarme a desarrollar los programas de programas de pruebas
-> ¿ Donde quiero correr esos programas? En la máquina del tio de Q&A ???? 
Pues ya vamos mal... En mi máquina funcinaba!!!

Selenium:
- Selenium IDE -> RUINA GIGANTE !!!! DE LA MAS ABSOLUTA CALAÑA !!!! NO SE USA !
- Selenium WebDriver -> GUAY !!! -> PROGRAMA JUNIT      $mvn test
- Selenium Grid

Donde lo ejecuto ese programa?
Desde cualquier lado....... que tenga un navegador? 
Basta con que tenga un Navegador? + Driver

    Librerias del lenguaje + Navegador + Driver
    
    JVM + Depedencias Webdriver
    Programa JAVA  > Lib. Webdriver -> Driver navegador -> Navegador
    
    Que driver necesito? Compatible con el navegador y su versión
    
    Qué navegador? En varios? Y lo haceis?
    En que versión de esos navegadores? O en las 5 ultimas
    Corriendo sobre qué sistema operativo? Windows, MacOS
    Corriendo sobre que hardware: Portatil, Iphone? Tablet, Android
    
    Burbuja: App : Nagevador +- está estandarizado.... Windows.
    
    Caixabank ---> App banco Edge + Chrome
    
    
    Programa -> Lib. Webdriver -> Grid Selenium -> Driver -> Navegadores -> SO
                                                -> Driver -> Navegadores -> SO
                                                -> Driver -> Navegadores -> SO
                                                
                                                
                                    JBOSS    < App
                                        BBDD
                                        
                                        
------------------------------------------------------------------ red Amazon
        |
    172.31.2.202
        | 
      IVAN PC
        |
        Docker: 172.17.0.1              
        Docker: 172.19.0.1 ------------172.19.0.2-----Jenkins ----- loopback (127.0.0.1-localhost)
        |                   \----------172.19.0.3-----PostgreSQL ----- loopback (127.0.0.1-localhost)
        |                    \---------172.19.0.4-----Sonarqube ----- loopback (127.0.0.1-localhost)
        |
        Loopback: 127.0.0.1( localhost)
        
        172.19.0.2:8080 -> Jenkins      
        localhost:8080  -> Jenkins ? O Si, depende donde ejecute esto.. y quien esntieda el "localhost"
        172.31.2.202:8080 -> Jenkins
        172.17.0.1:8080 -> Jenkins?
        172.19.0.1:8080 -> Jenkins?
        localhost:8080 -> Desde el host
        
        172.19.0.2:8080 - Funciona ? SIIIII
                          Lo quiero ? NOOOOO