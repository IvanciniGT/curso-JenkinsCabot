Error (humano) -> defecto código -> FALLO

# Para que se hacen pruebas?

- Para comprobar un determinado requisito
- NO SIRVEN PARA GARANTIZAR QUE UN SISTEMA NO TENGA ERRORES
- Tratar de identificar todos los posibles DEFECTOS antes de que den la cara (FALLO)
- Como segunda vuelta nos interesa identificar causa ERRORES -> Medidas correctivas y preventivas
- Conocer mi producto -> Extraer información para aplicar ahora y en futuros proyectos

# JMETER
---------
Arranco TEMIS 
Parametrizar los usuarios y las veces que hacemos la prueba:
- Con un número medio de peticiones... No medimos.. y me da igual el resultado -> WARMUP (calentamiento)
    JIT(HOTSTOP de JAVA)
- Mido con un usuario / Un buen numero de veces que hace la operación:          ESTABLECER LINEA BASE
    X Pantalla -> 1.5s ... en carga nunca voy a mejorar esto!
    Si este dato es malo.... A desarrollo !
- Mido a media carga (mitad de usuarios que espero) / Un buen número de veces que hace la operación: 
    La degradación de la linea base
- Mido a carga completa (usuarios que espero) / Un buen número de veces que hace la operación: 
    La degradación de la linea base
- Mido a doble carga (doble de usuarios que espero) / Un buen número de veces que hace la operación: 
    NO ME PENALIZA
    La degradación de la linea base



docker run -it --rm IMAGE bash
                           sh
                           
docker build . -t REPO:tag



/home/ubuntu/environment/curso/prorectos/protectoWeb/
                                                     test.jmx
                                                     report.xml
                                                     
/home/ubuntu/environment/curso/prorectos/protectoWeb/    ->    /report

    jmeter -n -t /repot/test.jmx -l /report/report.xml



