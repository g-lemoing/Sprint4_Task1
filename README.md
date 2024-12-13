# Sprint4_Task1 - Introducció a Spring

## Nivell 1 - Spring i Maven
Mitjançant l'Spring Initializr (https://start.spring.io/), creem un projecte Spring boot amb gestor de dependències Maven i seleccionem les dependències Spring Boot DevTools i Spring Web.
Importem aquest projecte en Intellij, afegim en el fitxer application.properties la propietat server.port=9000.
Convertim aquesta aplicació en una APIRest, creant una classe Controller (HelloWorldController), a la qual afegim l'anotació @RestController, que simplifica la creació de web services Restful, ja que combina les anotacions @Controller i @BodyResponse (que podem llavors ometre).
La classe té dos mètodes saluda() i saluda2(), ambdos reben un paràmetre 'nom' opcional, que en cas de no ser informat, agafa el valor per defecte 'UNKNOWN'.
- El primer mètode rep el paràmetre com un RequestParam, i per tant farem servir l'anotació @RequestParam corresponent, especificant el valor per defecte @RequestParam(defaultValue = DEFAULT_NAME) abans de l'argument, ja que aquesta anotació requereix un parametre (a no ser que s'especifiqui 'required = false'). 
- El segon mètode rep el paràmetre com a RequestMapping, i per tant farem servir l'anotació @PathVariable corresponent indicant les URI a considerar, en el nostre cas:{"/HelloWorld2", "/HelloWorld2/{nom}"}. El caracter opcional del paràmetre nom s'estableix al fer precedir l'argument del mètode amb l'anotació @PathVariable i indicant 'required = false'. El mètode ha de tenir en compte la possible nul·litat del paràmetre, i substituint-lo en aquest cas pel valor per defecte mitjançant un if-then-else. 
RequestParam extrau el valor del(s) paràmetres de la cadena del query, mentre que PathVariable l'extrau de la ruta de l'URI.
Arranquem l'aplicació i comprovem en el navegador que el missatge inclòs en cada mètode es mostra correctament.

## Nivell 2 - Spring i Gradle
Repetim els mateixos passos que en el nivell 1, però amb gestor de dependències Gradle, i configurant el port del servidor amb el valor 9001.
Arranquem l'aplicació i comprovem en el navegador que el missatge inclòs en cada mètode es mostra correctament.

## Nivell 3 - Postman
Amb l'aplicació Postman d'escriptori, creem dos entorns (Maven i Gradle), cada un amb dos variables d'entorn: servidor i port. Només la segona varia d'un entorn a l'altre (9000 i 9001 respectivament). Exportem els dos entorns en format json.
Creem una request GET fent servir les dues variables creades, seleccionem l'entorn desitjat, arranquem l'aplicació corresponent en Intellij, i testem les 4 casos coberts (RequestParam i PathVariable, paràmetre nom informat o per defecte). Comprovem que Postman retorna una resposta amb status 200OK i el missatge esperat en el body.

## Instruccions d'instal·lació
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.2 (Community Edition), Java, SDK openjdk-22 Oracle OpenJDK 22.0.2 Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2.
Projecte generat amb Sprint boot + Maven / Gradle i importat en un unic repositori local. Creació manual de packages en Intellij per especificar els 2 projectes.

# Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/Sprint4_Task1.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

# Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.
Para el nivel 1, abrir el navegador y testear las URI localhost:9000/HelloWorld, localhost:9000/HelloWorld?nom=tu_nombre, localhost:9000/HelloWorld2, localhost:9000/HelloWorld/tu_nombre.
Para el nivel 2, abrir el navegador y testear las URI localhost:9001/HelloWorld, localhost:9001/HelloWorld?nom=tu_nombre, localhost:9001/HelloWorld2, localhost:9001/HelloWorld/tu_nombre.

## Contribucions:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/S3.02_Patterns2
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
