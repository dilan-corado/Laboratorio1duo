# Laboratorio
Integrantes:
1. Dilan Stuard Pérez Corado.
2. Osvin Leonel Gámez Medina.

🧠 Parte 1 – Análisis del Programa Original
	1️⃣ Identificación de Tareas Repetitivas

	1.1 ¿Qué partes del código pueden convertirse en métodos?

En el programa hay varias acciones que siempre se hacen igual, así que se pueden convertir en métodos. Por ejemplo: cuando se agrega un estudiante, cuando se muestra la lista completa, cuando se calcula el promedio y cuando se busca al estudiante con mejor nota. Cada una de estas acciones es un “bloque” que hace algo muy específico y por eso queda mejor si está separado.

	1.2 ¿Qué bloques de código se repiten?

Se repiten cosas como revisar si la lista está vacía, recorrer las calificaciones para sumarlas o para buscar la nota más alta. También se repiten varios mensajes en pantalla. Aunque no sea exactamente el mismo texto, sí se vuelve a usar el mismo tipo de instrucciones una y otra vez, y eso es señal de que conviene separarlo.

	1.3 ¿Qué responsabilidades pueden separarse?

El programa mezcla varias tareas: registrar estudiantes, mostrar información, hacer cálculos y encontrar al mejor estudiante. Cada una de estas tareas se puede dividir para que cada pedazo del programa haga solo una cosa así el trabajo queda mejor distribuido y no todo amontonado.
	
	1.4 ¿Por qué dividir estas tareas mejora el programa?

Dividir las tareas ayuda a que el programa sea más fácil de leer y de entender. También hace que sea más sencillo arreglar algo cuando falle, porque cada parte del programa está en su propio espacio si algún día queremos agregar otra función, solo tendríamos que hacer un nuevo método.