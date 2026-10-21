# Practica: Algoritmos de Ordenamiento (Burbuja Tradicional vs. Burbuja Mejorado)

Implementacion y analisis comparativo de rendimiento entre el metodo de Burbuja Tradicional y la variante Burbuja Mejorado (optimizado mediante banderas de control), desarrollada en Java.

## Descripcion

El objetivo de este proyecto es contrastar empiricamente la eficiencia de ambos enfoques al ordenar arreglos de enteros bajo distintos escenarios de entrada. El programa mide el esfuerzo computacional real a traves de metricas clave:

* Pasadas realizadas: Ciclos externos ejecutados.
* Comparaciones: Evaluaciones condicionales entre pares adyacentes (arr[j] > arr[j+1]).
* Intercambios: Modificaciones efectivas de posicion en memoria.

## Estructura y Funcionamiento

El punto de entrada se encuentra en la clase Main, la cual evalua los algoritmos sometiendolos a diferentes condiciones iniciales:

1. Arreglos completamente desordenados (Peor caso / Promedio): Demuestra el comportamiento cuando la coleccion requiere ordenamiento extensivo.
2. Arreglos casi u ordenados (Mejor caso): Evidencia la ventaja del corte temprano en la version optimizada.

Al ejecutarse, la consola imprime el arreglo original, el arreglo resultante y el desglose estadistico de cada ejecucion para facilitar el analisis comparativo.

## Complejidad Temporal (Big O)

* Mejor Caso: `O(n^2)`
* Peor Caso: `O(n^2)`
* Explicacion de la Optimizacion: Recorre siempre todos los ciclos anidados, sin importar si el arreglo ya estaba ordenado.

## Requisitos y Ejecucion

* JDK: Java SE 8 o superior.
