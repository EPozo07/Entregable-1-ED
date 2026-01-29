package javadoc;

/**
 * Programa que trabaja con un array de números enteros.
 * 
 * El programa:
 * - Busca el número mayor del array
 * - Comprueba si ese número se repite
 * - Calcula la media de los números
 * - Muestra si la media está BIEN o MAL
 */
public class p {

    /**
     * Método principal del programa.
     * 
     * Aquí se realizan todas las operaciones:
     * búsqueda del máximo, cálculo de la media
     * y mostrar los resultados por pantalla.
     *
     */
    public static void main(String[] args) {

        int[] numeros = {5, 7, 3, 7, 2, 9, 7}; // array de los números

        int maximo = numeros[0]; // variable que recoje el número máximo
        int contador = 0; // variable que recoje las veces que aparece el número mayor
        int suma = 0; // recoje la suma de los números del array

        /**
         * Bucle que busca el número mayor del array.
         */
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        /**
         * Bucle que cuenta cuántas veces aparece el número mayor
         * y suma todos los valores del array.
         */
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == maximo) {
                contador++;
            }
            suma += numeros[i];
        }

        /**
         * Se muestra por pantalla si el número mayor se repite.
         */
        if (contador > 1) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        /**
         * Cálculo y muestra de la media.
         */
        double media = (double) suma / numeros.length;
        System.out.println(media);

        /**
         * Se muestra si la media es BIEN o MAL.
         */
        if (media >= 5) {
            System.out.println("BIEN");
        } else {
            System.out.println("MAL");
        }
    }
}

