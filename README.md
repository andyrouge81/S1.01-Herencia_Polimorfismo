
# S1.01-Herencia_Polimorfismo

## Objetivos de la tarea.
  
  - Practicar y repasar los conceptos fundamentales como la herencia y el polimorfismo de la programación orientada a objetos(POO).
  - Realizar los ejercicios relacionados con POO en Java de este primer Sprint.
  - Subir los ejercicios al repositorio en GitHub mediante Git.
    


### Ejercicios.

A través de los diferentes ejercicios veremos el comportamiento de estos conceptos de una manera rápida y sencilla.

### Nivel 1. Ejercicio 1.

  En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.


El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 

Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.

---

### Nivel 1. Ejercicio 2.

  Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar() i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar: “El vehicle està frenant”. 

Demostra com invocar el mètode estàtic i el no estàtic des del main() de la classe principal.

---

### Nivel 2. Ejericicio 1.

  Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar(). Aquest mètode ha de rebre un String amb un número de telèfon. El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre. 

Crea una interfície anomenada "Camera" amb el mètode fotografiar(), i una altra interfície anomenada Rellotge amb el mètode alarma().

Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" i que a la vegada implementi les interfícies "Camera" i "Rellotge".

El mètode fotografiar() ha de mostrar per consola: “S’està fent una foto” i el mètode alarma() ha de mostrar: “Està sonant l’alarma”.

Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.

---

### Técnologias Utilizadas
  
  - IntelliJ IDEA / Eclipse
  - Java (JDK) 17 o superior. Oracle
  - Git & Github

---
  
### Requisitos

- Java (JDK 17 o superior)
- IntelliJ IDEA  / Eclipse / VSCode con extensión Java
- Git

---

### Instalación

 1. Clona este repositorio:
	```bash
	 git clone https://github.com/andyrouge81/S1.01-Herencia_Polimorfismo.git
 
2. Accede al directorio del proyecto:
	```bash
 	cd S1.01-Herencia_Polimorfismo

3. Abre el proyecto con tu IDE y asegúrate de la compatibilidad con el JDK

---

### Ejecución

1. Ve al archivo `Main.java` dentro del paquete correspondiente.
2. Ejecuta el archivo para comprobar el resultado del ejercicio.
3. Puedes añadir objetos y probar los métodos.

---

### Despliegue

Este proyecto es meramente de tipo educativo.

- Puedes generar un archivo `.jar` ejecutable desde tu IDE.

---

### Contribuciones

1. Haz un _fork_ del repositorio.
2. Crea una nueva rama:
	```bash
	git checkout -b feature/NuevaFuncionalidad
3. Realiza cambios y commit:
	```bash 
	git commit -m “feat: agrega una nueva funcionalidad”
4. Sube los cambios a tu rama:
	```bash
	git push origin feature/NuevaFuncionalidad
5. Abre un _pull request_ y lo revisaremos.

---

### Contacto

Para dudas o sugerencias puedes abrir una _Issue_ o contactar a través del perfil de GitHub






    
