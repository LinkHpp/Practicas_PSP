# Ejercicios PSP

/* EJERCICIO 1
Crea un programa que cree un hilo que realice el cálculo de los primeros N números
de la sucesión de Fibonacci.
La sucesión de Fibonacci comienza con los números 0 y 1 y el siguiente elemento es la suma de
los dos elementos anteriores. Así la sucesión de Fibonacci sería 0, 1, 1, 2, 3, 5, 8, 13, 21, 34…
El parámetro N se pedirá y recogerá en el hilo principal e irá indicado cuando se llame al
constructor de la clase Thread correspondiente.
*/

/* EJERCICIO 2
Crea un programa que cree entre 1 y 10 hilos. Cada hilo tendrá que mostrar por
pantalla:
○ Mensaje indicando que empieza.
○ El número de hilo por orden de creación.
○ Mensaje de que va a finalizar.
Se le preguntará al usuario cuántos hilos se van a crear.
*/

/* EJERCICIO 3
Crea un programa que cree un hilo. Este hilo mostrará su nombre e indicará que está
empezando. A continuación, se esperará 3 segundos. Antes de acabar deberá mostrar que va a
acabar.
*/

/* EJERCICIO 4
Crea un programa que cree dos hilos.
Después de empezar un hilo hijo debe esperar 3 segundos y el otro hilo hijo debe esperar 5
segundos.
El hilo principal después de crear a los dos hijos debe esperar 4 segundos.
Cada hijo debe de mostrar por pantalla su nombre y cuánto tiempo va a esperar.
Se puede forzar la interrupción de un hilo mediante el método interrupt(). (ver ejemplo en el
código siguiente).
*/

/* EJERCICIO 5
Modifica el programa anterior para que el hilo principal no espere 4 segundos si no
que se espere a que acaben los dos hilos que crea. El hilo principal ha de mostrar por pantalla
cuando empieza y cuando acaba.
*/

/* EJERCICIO 6
Comprueba el funcionamiento de los hilos tipo daemon creando una copia del
ejercicio 4 y añadiendo un hilo nuevo que será de tipo daemon y esperará 20 segundos.
*/

/* EJERCICIO 7
Prueba el ejemplo anterior en tu equipo. Ejecuta el programa varias veces
cambiando la prioridad de los hilos y comprueba si se nota este cambio.
Haz que se creen cuatro hilos más y vuelve a hacer las pruebas anteriores y comprueba si se
notan los cambios de prioridad.
¿A qué se debe este comportamiento cuando se cambian las prioridades?
*/

/* EJERCICIO 8
Crea un programa que cree 10 hilos de manera recursiva, cada hilo creará un hilo hijo
y así sucesivamente. Cada hilo padre tiene que esperar a que su hijo acabe. El último hilo creado
ha de esperar 5 segundos. Todos los hilos han de informar de quién son, que van a empezar, que
van a esperar y que han acabado.
*/

/* EJERCICIO 9
Crea una clase en Java que utilice 5 hilos hijos para contar el número de vocales
que hay en un determinado texto. Cada hilo se encargará de contar una vocal diferente. Todos
los hilos actualizan el número de vocales en una variable común. Hay que utilizar métodos
sincronizados para evitar condiciones de carrera.
*/

/* EJERCICIO 10
Crea una clase en Java que haga lo siguiente. El hilo principal escribirá en un
archivo llamado heroes.txt el texto “Heroes del Silencio - Sirena Varada” y a continuación creará
dos hilos. Una vez creados los dos hilos esperará a que los dos acaben antes de cerrar el archivo
de texto.
*/
