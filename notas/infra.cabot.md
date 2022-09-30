
Maquina 1
    JBOSS 7.4

Maquina 2
    Sonar

Maquina 3
    Jenkins Docker-Compose

PL-1    Compilar y pruebas unitarias y sonar
PL-2    Despliegue
    Despliegue de la app
    
        deploy adapters: [jboss7(url: 'http://servidor-jboss-qa:8080/', 
                              credentialsId: 'tomcat')], // usuario y contraseña
                     war: 'target/temis.war',
                     contextPath: 'temis'
                     
        sh 'scp target/temis.war superjefe@servidor-jboss-qa:///rutaDeDepliegues/temis.war'

    Smoke test
        curl IP_JBOSS:8080/login    Conteste!
        
        
        Jenkinsfile
        Das de alta un parametro RAMA 'develop' y choice
        
        sh 'git checkout ${RAMA}'


Sistema de backup

git commit -m ' Lo tengo a medias, pero me piro'
git push


Cada usuario tiene su rama -> los commit que quiero sin que compilen 
Esta rama la fusiono lo la de caracteristica -> Meto todo sin historia C