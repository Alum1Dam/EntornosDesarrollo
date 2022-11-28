### Crear un projecto en un fichero JAR.
1. Para crear el poroyecto de primeras he creado en mi directorio de carpetas una nueva carpeta denomiado Proye.
![](Imagenes%20para%20Markdown/PR3.1.png)
Dentro de esta misma he abierto el proyecto MZFecha.java dentro.
![](Imagenes%20para%20Markdown/PR3.2.png)
--------------------------------------------
Ahora vamos a exportar este fichero en JAR.
Vamos al menú principal donde File y seleccionaremos en Project Structure:
![](Imagenes%20para%20Markdown/PR3.3.png)

Una vez hecho esto debemos darle click en Artefactos o Artefacts: 
![](Imagenes%20para%20Markdown/PR3.4.png)

Le damos al + que tiene a la derecha: 
![](Imagenes%20para%20Markdown/PR3.5.png)

Y una vez dentro le damos a JAR y seleccionamos From modules with dependencies:
![](Imagenes%20para%20Markdown/PR3.6.png)

Ahora donde pone Main Class en la derecha donde hay una carpeta lo seleccionamos y seleccionamos la clase principal:
![](Imagenes%20para%20Markdown/PR3.7.png)
En mi caso mi clase principal por defecto es Main:
![](Imagenes%20para%20Markdown/PR3.8.png)
Le damos ok y se crea el JAR:
![](Imagenes%20para%20Markdown/PR3.9.png)
![](Imagenes%20para%20Markdown/PR3.10.png)

Ahora vamos a construirr el artefacto JAR.
Vamos al menú principal y seleccionamos en Build y luego Build artefacts:
![](Imagenes%20para%20Markdown/PR3.11.png)
Ahora nos saldrá esta ventanita:
![](Imagenes%20para%20Markdown/PR3.12.png)
Y le tendremos que dar en Build.
Una vez dado en Build nos creará una carpeta denominado Out con subcarpetas pero la que nos interesa es en el que dice artifacts y dentro de ese nos saldrá el nombre de la carpeta y dentro de este el .jar.
![](Imagenes%20para%20Markdown/PR3.13.png)

----------------------------------------------
Ahora vamos a usar el fichero .jar en otro proyecto.
Para ello vamos a crear otra carpeta y dentro del mismo introduciremos el .jar.
![](Imagenes%20para%20Markdown/PR3.14.png)
Una vez creada la carpeta la abrimos:
![](Imagenes%20para%20Markdown/PR3.15.png)
![](Imagenes%20para%20Markdown/PR3.16.png)
Una vez dentro tendremos que crear una carpeta denominada lib.
![](Imagenes%20para%20Markdown/PR3.17.png)
Ahora deberemos copiar el fichero en mi caso con el nombre Proye.jar dentro del directorio lib:
![](Imagenes%20para%20Markdown/PR3.18.png)

Una vez hecho esto deberemos añadir el JAR al nuevo proyecto.
Para ello comenzaremos en el menú principal y seleccionamos archivos o file, clickamos en proyect structure y hacemos click en modules y luego en dependencies:
![](Imagenes%20para%20Markdown/PR3.19.png)
Le agregamos el SDK.

Ahora le clickamos en + y agregamos el JAR:
![](Imagenes%20para%20Markdown/PR3.20.png)

Una vez hecho esto deberemos crear una clase principal con un método main que utilice la clase MZFecha. Pero antes de eso le agregamos el JAR:
![](Imagenes%20para%20Markdown/PR3.21.png)

Como vemos en la siguiente imagen ya está creada.
![](Imagenes%20para%20Markdown/PR3.22.png)

Ahora con el main del mismo empezamos a usar la librería de MZFecha. He hecho el llamamiento del Scanner, luego he definido la primera fecha con F1 y la segunda fecha F2. He ido creando las variables de tipo int para las diferentes fechas.
![](Imagenes%20para%20Markdown/PR3.23.png)

Luego le digo al usuario que imprima las diferentes fechas y cuando ya están almacenadas las imprimo. luego hago la diferenciación almacenandolo en otra variable tipo int ya que la diferencia devuelve un int. Hago la correspondente llamada para el System.out.println y listo.
![](Imagenes%20para%20Markdown/PR3.24.png)

Lo ponemos a prueba y sale lo siguiente:
![](Imagenes%20para%20Markdown/PR3.25.png)