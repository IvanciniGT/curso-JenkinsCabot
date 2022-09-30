# Integración Continua con Jenkins.... Jenkins con Maven

## Jenkins

Servidor de Automatización (Integración Continua & Despliegue Continuo)
Es el encargado de orquestar todas las tareas automatizadas que he desarrollado.
Automatización de 2º nivel.

Servidores de automatización:
    Jenkins: Opensource y gratuito
    Cloudbees: Versión de pago de Jenkins
    TeamCity: Jetbrains
    Bamboo: Atlasian
    GITLAB: Gitlab CI/CD
    GITHUB: Actions - TravisCI

Dentro de estas herramientas montamos lo que llamamos PIPELINES: Flujo de tareas.

# Formación:
    Cómo montar flujos dentro de Jenkins
        Integración continua
        Entrega continua
        Despliegue continuo
    Cómo usar un Jenkins a día de hoy
    Cómo instalar un Jenkins

## Dev-->ops

Cultura / Movimiento / Filosofía en pro de la AUTOMATIZACION dentro del mundo IT.

Devops: Gente que se dedica a implementar estrategias de despliegue.

## Integración Continua






- Que siempre vamos desplegando hacia delante
- Que tengo los flujos de despliegue definidos
- Automatización de un ciclo de vida


# ALM

Visión acerca de cómo a día de hoy entendemos el desarrollo de un software

Todo el código va a ir en un Sistema de control de Código Fuente: GITLAB, GITHUB, BitBucket
GIT: Linus Torvalds
                                        AUTOMATIZABLE
    Planificación                           x
    Codificación                            x
    Empaquetado                             √                   DESARROLLO
                                                    JAVA:   Maven / Gradle / SBT
                                                    .Net:   MSBuild, Nuget
                                                    Apache  ANT: Chico para todo
                                                    Python: Poetry
                                                    JS:     NPM, YARN, Webpack
    ----------------------------------------------------------------------------> Desarrollo ágil !
    Test                                    ?
        - Diseño de las pruebas             x
        - Ejecución de las pruebas          √
            Dónde instalo para hacer las pruebas?       Entorno de Preproducción, Integración, test, Q&A
                Tengo ese entorno precreado?            Tradicionalmente SI
                                                        La tendencia es a NO... 
                                                        Quiero un entorno de usar y tirar!
                Cuando vaya a hacer las pruebas:
                    1. Creo un entorno              SISTEMAS
                        Terraform. Lenguaje de Programación para crear scripts que 
                                    contraten/descontrarten servicios en un cloud.
                                    Principalmente se usa para IaaS: Servicios de Infraestrutura
                        Vagrant.   Crear Maquinas virtuales bajo demanda en automático:
                                    VMWare, Citrix,... KVM
                        Kubernetes
                        Docker
                    2. Instalo y configuración de ese entorno
                        Ansible
                        BASH
                        Puppet
                        Chef
                        Kubernetes
                        Docker
                    3. Hago pruebas                     
                        Pruebas estáticas:  Pruebas que NO REQUIEREN PONER EL CODIGO EN MARCHA
                            Revisión de requisitos
                            Revisión de un modelo de BBDD
                            Calidad de código:
                                SonarQube                                       √
                                    Problemas de seguridad
                                    Problemas malas prácticas
                                    Algunos bugs sencillos
                                    Revisión de comentarios
                                    % Cobertura de pruebas unitarias    80-90%
                                    Revisión de la complejidad del código
                                        Complejidad cognitiva
                                        Complejidad ciclomática
                        Pruebas dinámicas:
                            Pruebas funcionales:
                                Unitarias               Probamos un código (un componente) de forma aislada
                                    JAVA:       JUNIT, TestNG               DESARROLLO
                                                Mockito: Mock
                                    .net        MSTEST
                                    Python      UnitTest, TestPY
                                Integración             Probamos comunicaciones entre componentes
                                    Interfaz gráfica
                                        WEB             Selenium            TESTING
                                        App smartphone  Appium
                                    Servicios WEB
                                        Postman         REST
                                        SoapUI          SOAP
                                        Karate          REST
                                Sistema (End2End)       Probamos que el sistema hace lo que debe! COMPORTAMIENTO
                                Aceptación              Las del cliente!
                                        Cucumber - Gherkin
                            Pruebas no funcionales:
                                Estres          JMeter, LoadRunner
                                Carga
                                Rendimiento
                                UX
                    4. Elimino entorno
            
         # TODO !!!
    ----------------------------------------------------------------------------> Integración CONTINUA !
                                                                                    Continuous Integration
    Instalar automáticamente la última versión de mi sistema en un entorno de 
    INTEGRACION !!! y someterlo a pruebas AUTOMATIZADAS
    
    
    Generación de una release           Puesta en mano de mi cliente de la última versión de mi software
                                            √
    ----------------------------------------------------------------------------> Entrega CONTINUA ! 
                                                                                    Continuous Delivery
    Instalación/Despliegue                  √
        # TODO
        BASH .sh
        Terraform
        Vagrant
        Puppet
        Chef
        Ansible
        Kubernetes
        Docker
    ----------------------------------------------------------------------------> Despliegue CONTINUO ! 
                                                                                    Continuous Deployment
    Operación 
        (que el sistema no caiga)
            Reinicios, Escalado, Desescalado √
            Kubernetes
    Monitorización
        Kubernetes


Evolución del SDMC

# Metodologías de desarrollo de software

Metodologías en CASCADA... Espiral, V....

    Toma de requisitos (PERFECTA)
        Análisis
            Planificación
                Desarrollo
                    Pruebas
                        Documentación
                            Implantación
                            


- El software funcionando es la medida principal de progreso.
    Pruebas !!!!

Si funciona es que vamos bien.

---

Hito 1 - Fecha 1 - N Funcionalidades
                   ----------------- 10 requisitos

Hito 2 - Fecha 2 - N funcionaldiades

Hito 3 - Fecha 3 - K funcionaldiades

---

Iteración 1 - Fecha 1 - N Funcionalidades
              -------
        10% de la funcionalidad del sistema             100% funcional

Iteración 2 - Fecha 2 
         5% de la funcionalidad del sistema             100% funcional

Iteración 3 - Fecha 3 

---
Desarrollo y Pruebas ... Aceite y agua ... Madrid vs Barça

Cada 3/4/2 semanas... 6 semanas ... Necesito una instalación nueva en producción:
- Instalar... Producción.... Integración
- Pruebas !!!!! por un tubo!!!!!!
    Iteración 1 : 10 requisitos ... Probar los 10 requisitos
    Iteración 2 : +5 requisitos ... Probar los 15 requisitos

Solución a este problema: AUTOMATIZAR.
---
Entornos:
    Desarrollo
    Q&A << Testing << Validación || Integración
    Producción
    
Entorno de producción:
- HA - High Availability: Alta disponibilidad
    Intentar garantizar un determinado tiempo de servicio
    Intentar garantizar la NO PERDIDA de información

    REPLICACION
    REDUNDANCIA
    
    90% Tiempo de servicio - RUINA ---- 36 dias al año con el sistema down.         | €
    99% Tiempo de servicio - Bueno ---- 3,6 dias al año... PELUQUERIA DE BARRIO     | €€
    99,9%                  - BIEN ----- 8 horas al año                              | €€€€€
    99,99%                 - MINUTOS                                                v €€€€€€€€€€€€€€

- Escalabilidad
    Capacidad de ajustar la infraestructura a las necesidades de cada momento
        
        APP1 - Departamental o interna de un empresa
            Dia 1       100 usuarios
            Dia 100      98 usuarios        No necesito escalabilidad
            Dia 1000    102 usuarios
        
        APP2 - 
            Dia 1       100 usuarios
            Dia 100    1000 usuarios        Escalabilidad VERTICAL: MAS MAQUINA !!!!
            Dia 1000  10000 usuarios

        APP3 - INTERNET <<< HOY EN DIA
            Dia n       100 usuarios            Cambios en horas o minutos
            Dia n+1     100000 usaurios
            Dia n+2     1000    usuarios        Escalabilidad HORIZONTAL: MAS o MENOS MAQUINAS !!!!
            Dias n+3    2000000 usuarios
    
    Servidor 16Gbs RAM y 8 cores -> 10000 usuarios 
        Aquí me vale comprar máquinas a Dell, IBM, ...? NO 
        Clouds!

Cloud: 
    Conjunto de servicios (IT) que ofrece una empresa por Internet, de forma automatizada y desatendida!
    Modelo de alquirer, basado en pago por uso.!
    
    
Lenguages de Programación
- Compilados        C#, C, ADA, FORTRAN
- Interpretados     PHP, Python, BASH, JS (Mocha)

JAVA Es raro... Compilados + Interpretados ambas cosas

ES6 ES7

HUELLA !!!! Hashing
DNI         2300000-T


Redhat:
- RHEL              < Fedora
- JBOSS             < WildFly
- Ansible engine    < Ansible project
- Openshift CP      < OKD. Openshift Origin

Openshift : Distribución de Kubernetes

---

Complejidad cognitiva                   - Cuanto le cuesta a un humano entender un código
    
Orden de complejidad de un algoritmo    - Cuanto le cuesta de más a un computador
                                          ejecutar un código cuando crece el número 
                                          de datos sobre el que se aplica
                                          
Complejidad ciclomática                 - Cuantos caminos distintos puede tomar el código -> Cantidad de pruebas

----

Metodologías ágiles
DEVOPS
Clouds
Contenedorización *******

-----

# Contenedorización

TODOS los entornos DE PRODUCCION de TODAS las empresas si no lo están ya (RARO ES) 
se están moviendo a Contenedores (KUBERNETES)

## Contenedor

Entorno aislado dentro de un SO Linux donde ejecutar procesos.

Entornos aislado?
- Su propia configuración de RED -> IP (red virtual que se ha creado en mi maquina)
- Su propio filesystem
- Sus propias variables de entorno
- Pueden tener limitación de acceso a los recursos HW de la computadora

## Modelos de instalación de software

### Modelo 1 - Tradicional

     App1  +  App2  +  App3             Problemas?
    ------------------------            - App1 se vuelve loca: 100% CPU, RAM, HDD, RED... APP1 OFF
       Sistema Operativo                                                                  APP2 OFF   y   APP3 OFF
    ------------------------            - Incompatibilidades librerias, dependencias, configuraciones
             HIERRO                     - Seguridad
    
    
### Modelo 2 - Máquinas virtuales

    -------------------------
        App1 |   App2 + App3            Problemas?
    -------------------------           - Configuración es mucho más compleja
        SO1  |      SO2                 - Desperdicio de recursos
    -------------------------           - Rendimiento
        MV1  |      MV2
    -------------------------
        Hipervisor:
        VMWare, KVM, HyperV
        Citrix, VirtualBOX
    -------------------------
        Sistema operativo
    -------------------------
            HIERRO
            
### Modelo 3 - Contenedores

            
    -------------------------
      App1  |  App2 + App3
    -------------------------
        C1  |     C2
    -------------------------
     Gestor de contenedores:
     Docker, Podman, CRIO,
     ContainerD
    -------------------------
     Sistema operativo LINUX
    -------------------------
            HIERRO

Los contenedores nos resuelven prácticamente los mismos problemas (al menos los más gordos, frecuente e importantes)
que las máquinas virtuales, pero sin ninguno de los problemas de la MV.

Hoy en día, todo el software empresarial se distribuye mediante IMAGENES DE CONTENEDOR. Es la forma estándar!!

Un contenedor se crea desde una IMAGEN DE CONTENEDOR.

OFFICE, JBOSS, POSTGRESQL, MS SQL Server en mi computadora:

0- Acondicionar la máquina: Dependencias, configuraciones
1- Descargar el instalador
1.5 - Mirar la documentación de cómo se instala
2- Ejecutar el instalador -> INSTALACION
    C:\Archivos de programa\SQLServer -> ZIP -> Email < IMAGEN DE CONTENEDOR
    
# Imagen de contenedor:

Es un fichero comprimido (TAR) que contiene un SOFTWARE YA INSTALADO y CONFIGURADO por alguien... 
que sabe un huevo de instalar eso
+ Utilidades, comandos que me pueden ser de utilidad

# Las imágenes de contenedor se guardan en REGISTRIES de REPOSITORIOS de IMAGENES DE CONTENEDOR:

Docker hub: Aquí vaius a encontrar el 80% del software empresarial que existe hoy en día.
Quay.io:    Este es el de RedHat
---

Tipos de software:
- Sistema Operativo
- Aplicación                - Usuario
---------------------v---------------- CONTENEDORIZABLE
- Driver
- Libreria
- Demonio
    - Servicio  Programas que atienden peticiones de otros. Mecanismo de comunicación Servicios: Puerto !
- Script
- Comando: JAVA
---

Linux ? Kernel de SO

GNU/Linux -> Redhat, Suse, Debian (Ubuntu(Mint))
Android -> Linux

---

Kubernetes


nginx: Proxy reverso.... Servidor web  ****** 80
httpd: Servidor web ...  Proxy reverso


----
Interfaz de red :
    - loopback (localhost: 127.0.0.1). Red virtual que sirve para comunicar procesos dentro de nuestra máquina
    - eth: IP De la red de la empresa
    - Wifi: IP distinta también de la red de la empresa
    - docker 172.17.0.1
    
----
AUTOMATIZAR de manera muy sencilla todo el despliegue, operación y monitorización de cualquier sistema.

Da igual la herramienta que quiera instalar, todas se instalan de la misma manera,
Se operan de la misma manera
y se monitorizan de la misma manera.

KUBERNETES !

--- 
Vale docker para un entorno de producción? NO
Por qué? Docker gestiona contenedores en 1 máquina -> HA / Escalabilidad -> Redundancia -> Varias máquinas? NO
Docker no se usa en producción


KUBERNETES < Quiero JBOSS (2 y 4 instancias en función de la carga de trabajo)
    + Balanceador de carga

Maquina 1
    ContainerD o CRIO
Maquina 2
    ContainerD o CRIO
    JBOSS2
Maquina 3 - OFF !!!!!
    ContainerD o CRIO
...
Maquina N
    ContainerD o CRIO
    JBOSS3

Kubernetes -> Fundación OCF
  Google
  
  
  K8S
  K3S
  Openshift
  Tamzu
  
 
-----
Contenedores con Jenkins?

Jenkins lo instalaremos con Docker... por supuesto !

Qué va a hacer Jenkins?
    Temis:  
    - Extraerlo de gitlab
    - Con maven empaquetarlo.... YA...
        Que maven? Donde está eso instalado?
            En la misma máquina que jenkins???? en otra? Qué versión?
            Maven requiere a parte? JDK... qué versión?
            .net -> msbuild, nuget
            python. Que python tengo?
    
    Que Jenkins cree un contenedor que tenga dentro el java y maven que a mi me 
    interese para este proyecto concreto
        Y ahí empaquete...
    Y las pruebas?
    Quizás me interesa que Jenkins cree un contenedor con JBoss, y suelte ahi la app> WAR
        Y pruebo.
    Selenium
        Navegadores : Chrome, Edge, Firefox
        Drivers de esos navegadores
        Python ... necesito python 3, con lalibreria de selenium preinstalada < GIT
    Y cuando acabe de probar todo... que quiero hacer? Contenedores a la basura !
    
