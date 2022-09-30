Entorno de prod: 
HA -> Al menos 2 maquinas. Cluster:
- Activo / Activo
- Activo / Pasivo

SonarQube           YAML
Jenkins             YAML


SpringBoot

** Microservicios

App monilítica : TEMIS !!!!

Despliegue
Escalado
Leng. prog.
Actualización


AngularJS, VueJS


>>>>> ReactJS + Desgajado en un monton de miniframeworks

*** LitElement  1 clase 1kb

FRONTEND NO SE HACE EN JAVA !
    W3C - Tim Berners Lee (WEB)
        HTML
        css
        XML
        XLS
        WebComponents 


600 tomcat + 600 envoy (proxies)

40 apps

TLS-2
    Certificados en todos los tomcat - Clave publica
                                     + Clave privada
    Esto caduca cada X
    
    TLS-2: Tanto cliente copmo servidor presenten certificado

POD(Tomcat -> env) -> POD(env -> Tomcat)
              Cer         Cer



Despliegue MS-Usuarios v1
    Contenedor MS-Usuarios < - Imagen Contenedor MS-Usuarios 1
                                                     Tomcat + app embebida
Despliegue MS-Usuarios v2
    Contenedor MS-Usuarios < - Imagen Contenedor MS-Usuarios 2
                                                     Tomcat + app embebida                                                     

30 repos en gitlab
TEMIS/USUARIOS
    ECLIPSE -> COMMIT -> Jenkins -> Kuberntes --- Desplegao
TEMIS/EXPEDIENTES
TEMIS/CORE

Pantalla de Registro de llamada de telefono v1

Pantalla de Registro de llamada de telefono v2 ... Paso a producción.... 
    
    
Quiero en paralelo la v1 y la v2
                              0% trafico
                     100%          
                     
                     
                     
proxi reverso
http://temis:8080/
    http://temis:8080/api/v1/usuarios
    http://temis:8080/api/v1/expedientes
    
    
Temis HTTPSession   

REST 
StateLess

JS FrontEnd

JAVA (libs)

JS AJAX

SPA. Single Page App < - Facebook

<usuario id="22"/>          HTML

<div>
    <div
        img
        p spannombre

100 lineas html + css + lógica --> MS -> BBDD

C#
    JAVA
         PYTHON
    
    JS          ES6 ES7
         
Machine learning


cluster Kubernetes
Maquina 1
Maquina 2
Maquina 3
Maquina 4
Maquina 5

Kubernetes: Quiero
    Jenkins 2-5.   %CPU 50% 
    Gitlab  1
    sonar   1
    Otras mierdas .... 
    
    Ocupate !

Temis
Temis 2

Apache
Acpahe

Jenkins
Jenkins2

Sonar 
sonar2


4 clusters de 50 maquinotes

2 clutes de pro 2 pre
|.  |           |.  |



OPENSHIFT
TAMZU


JENKINS PROD        Ejecuta los pipelines BUENOS  triggers
    ENtorno Q&A
    ENtorno PROD
    
    
JENKINS Q&A         Probar los pipelines
    ENtorno Q&A
    ENtorno PROD

Sistemas
Kubernetes: Jenkins Q&A + Jenkins PROD
    Prometheus
    Grafana
    
    
Intro a Kubernetes.  30 horacas
Kubernetes for    Sistemas  20
Kubernetes for    Desarrollo    20


---

# Maven 3.7.5 y JAVA 1.11
# Maven 3.8.5 y JAVA 1.7
# Ant
# C#
# Python

dev
beta
latest                  >           3.8.6-jdk18     # Entornos de desarrollo cuela... en prod ni de coña!             
3.8-openjdk-18          >           La última 3.8 que haya... quiero coger el último micro version
3-openjdk-18            >           La última 3 que haya... me da igual el minor.. el último y de ese, el ultimo micro
---
3.8.6-openjdk-18        >           3.8.6-jdk18



3.8-openjdk-18          >           La última 3.8 que haya... quiero coger el último micro version




docker pull maven
docker pull maven:latest


3-> Mayor           Cambios de arquitectura / No se garantiza retrocompatibilidad de versión
8-> Minor           Incrementos de funcionalidad / SI se garantiza retrocompatibilidad de versión    
6-> Micro           Bugs


3.8.5

3.8.6

3



docker image pull maven:3.8-openjdk-18  # Descargar la imagen

---- Esto no funciona
docker container create \
        --name mimaven \
        -v /home/ubuntu/environment/curso/proyectos/proyectomaven1:/proyecto \
        -w /proyecto \
        maven:3.8-openjdk-18 mvn package

docker start mimaven

docker attach mimaven
---

docker run \
        --rm \
        -v /home/ubuntu/environment/curso/proyectos/proyectomaven1:/proyecto \
        -w /proyecto \
        maven:3.8.6-openjdk-18 mvn package

---


Todo contenedor tiene lo que llamamos un comando de arranque: CMD

Nginx -> nginx
Mariadb -> mysqld
Jenkins -> tomcat

Maven -> mvn


---

Contenedor Es un Entorno Ailslado dentro de un SO Linux donde ejecutar procesos
Aislado:
    - Propia conf de red
    - Propio FS
    - Limitacion de acceso a recursos HW
    - Propias variables de entorno
    
---

BINARIO                 KERNEL
ls
    instrucciones ----> API


----
Contenedor linux -- Imagen :
FS:
    /bin/
        ls
        bash
    /programa/miprograma     - binario -> Kernel del host LINUX
----    
    /bin
    /etc
    /home
    /root
    /var
    /opt
    
    tomcat 
        ls
        mkdir
        rmdir
        bash
        cat
        apt
        
    

FEDORA
ZIP

/
    bin/
        ls
        bash
        sh
        mkdir
        yum
        
    etc/
    opt/
    var/
    home/
    root/

UBUNTU
ZIP

/
    bin/
        ls
        bash
        sh
        mkdir
        apt
        apt-get
        wget
        cp
        
    etc/
    opt/
    var/
    home/
    root/
    tmp/

ALPINE
ZIP

/
    bin/
        ls
        sh
        wget
        cp
        mkdir
        rmdir
        cat
        tail
        
        
    etc/
    opt/
    var/
    home/
    root/
    tmp/

UBUNTU/CENTOS/DEBIAN/FEDORA/ALPINE
Son lo que llamamos IMAGENES BASE DE CONTENEDOR

    jboss
    temis

FEDORA / CENTOS
^
JBOSS
^
TEMIS.war
+ Ficheros de conf de JBOSS

SO: Kernel



Host GNU/Linux
    Kernel Linux
        ^
    Xserver
    ls / mkdir
    bash / sh / bsh / fish
    GNOME / KDE
        ^
    gedit Editor de texto de GNU
    
    Contenedor -> Kernel

Windows
    NT
    Fluent Design
    
    
Windows Server Core
    NT
    Utilidades
    
    
Mi imagen de contenedor
JBOSS
^ WAR

Mi imagen de contenedor
    Tomcat
        WAR
        
--------------------------
Pipeline 1
    Descargo de git
    compilo
    ejecuto pruebas unitarias
    sonarQ
    Genero war
    Meto en una imagen de contenedor nueva con JBOSS
    Esa imagen de contenedor -> Registry de repos de imagenes de contenedor (GITLAB)
    FIN 
---------
Pipeline2
    Creo un contenedor en el entorno de Q&A partiendo de la imagen de contenedor que tengo en GITLAB
    Creo un contenedor con la BBDD MS SQL Server--- O uso la BBDD de pre
        Me pierdo una cosa....
            Estoy haciendo pruebas de los cambios en la BBDD automa.
            NO
            Se pueda crear y actualizar (evolucionar) automaticamente
                Script creación día 1
                Scripts de actualización    1->    1.1
                                            1.1 -> 1.2
                                            1.2->  2
                Script carga de datos inicial ... dependiendo de la verisón
                Script de carga de datos de prueba-> REPO GIT 
    Hago pruebas de ........
        Selenium
        Integración
        end2End
        Rendimiento
    Tiro todo a tomar por culo
    Paso el artefacto a otro REPO !!!!
    FIN
-----------
Pipeline 3
    Monto un entorno de PROD si no lo tengo ya
    Creo un despliegue de la imagen de contenedor
    Smoke test 
    Cambio el proxy reverso Si todo va bien
    Si todo va mal, dejo el proxy apuntando al entorno viejo... y borro lo nuevo
    VMWARE 
        Vagrant
        

------
Proyecto nuevo AppWEB basado en maven + arquetipo

Subir a nuevo REPO gitlab

Montar Jenkinsfile
    -> WAR

NOMBRE: artefecto proyectoWeb
        curso
        
git clone REPO
    rebase alternativa al merge
    

----
.gitignore
target/
----
git add . && git commit -m 'MENSAJITO' && git push




















--------------------------------------------------------------------------------
GIT Sistema de control de versión DISTRIBUIDO:
--------------------------------------------------------------------------------
En cada máquina tengo un repo del proyecto.... 
Distintos entre si. El proyecto es la suma de todos los repos
--------------------------------------------------------------------------------
                MI HDD
--------------------------------------------------------------------------------
                                                .git
                                ------------------------------------------          ------> REPO REMOTO
Workspace                       Area staging                Repo
Carpeta local                                               Commits
Archivo1                        Archivo1                    Archivo1
    RAMAS

Commit: Copia completa (FOTO) de un conjunto de archivos.... sellada) BACKUP
                                                                      BACKUP incrementales


                                                    .git                                    .git
                                                    git init                                git init
                                                                                            git clone
                                                                                            
                                                                                            
                                                    git add Remoto URL
                                                    git push -u Remoto master -f
                                                    
                                                    


C1 -> C2 -> C3  -> C4 -> C5


Poder volver atrás y 
saber lo que ha pasado? Puede serlo... a veces no < - REBASE Suele ser casi siempre

Libreria de ops matemaricas

Caract2
       C1-----C4(multiplicacion)-
     /                           \    merge FF
Desarrollo                        \
...C1(Alta)------------------------C4(multiplcacion)-----------------------C3 
     \                                              \  / FF
      C1------C2(suma) ----- C3(resta)---------------C5
    
Caract 1


Historia de desarrollo:


C1 - C4(multiplicacion) - C2(suma) -C3(resta)--


git revert C3 --- aqui la cagamos
git cherry-pick
git diff C2 C4

C5?
            mult            resta   suma
C1---------C4-----------C2-----C3
            caract2             desarrollo
                                caract1
                                
                                Ramas release!

Commit - Unica Operacion Funciondad (Añadir REQ 17)
Merge

HotFix
    Main                Release
Desarrollo

git pull = git fetch + git merge

git pull .. configurado previamente en git pull(rebase|merge)

