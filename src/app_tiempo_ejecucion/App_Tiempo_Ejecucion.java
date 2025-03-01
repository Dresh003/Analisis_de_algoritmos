package app_tiempo_ejecucion;

import java.util.Scanner;

public class App_Tiempo_Ejecucion {
    public static void main(String[] args) {
        // Registrar el tiempo inicial
        long tiempoInicial = System.nanoTime();
        
        // Aquí colocamos el código del algoritmo a medir
        Scanner scanner = new Scanner(System.in);
        double suma = 0.0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Ingrese un número real: ");
            double numero = scanner.nextDouble();
            suma += numero;
            
            System.out.print("¿Desea ingresar otro número? (si/no): ");
            String respuesta = scanner.next();
            
            if (respuesta.equalsIgnoreCase("no")) {
                System.out.print("¿Está seguro que desea salir? (si/no): ");
                String confirmacion = scanner.next();
                if (confirmacion.equalsIgnoreCase("si")) {
                    continuar = false;
                }
            }
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
        scanner.close();
        
        // Registrar el tiempo final
        long tiempoFinal = System.nanoTime();
        
        // Calcular el tiempo de ejecución
        long tiempoEjecucion = tiempoFinal - tiempoInicial;
        
        // Mostrar el tiempo de ejecución en nanosegundos
        System.out.println("Tiempo de ejecución en nanosegundos: " + tiempoEjecucion);
        
        // Convertir a milisegundos si es necesario
        double tiempoEjecucionMs = tiempoEjecucion / 1_000_000.0;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempoEjecucionMs);
    }
}
/*
Explicación:
- System.nanoTime(): Devuelve el tiempo en nanosegundos. Es más preciso que System.currentTimeMillis() para medir intervalos 
de tiempo cortos.
- Registras el tiempo antes y después de la ejecución del algoritmo.
- La diferencia entre el tiempo final y el inicial te da el tiempo que tardó en ejecutarse el algoritmo.
- Este método te permite medir el tiempo de ejecución con una alta precisión, lo que es útil para optimizar y comparar
diferentes algoritmos.
*/