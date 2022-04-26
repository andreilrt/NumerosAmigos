package numerosamigos;
import java.util.Scanner;

public class NumerosAmigos {

    static Scanner Input = new Scanner(System.in);
    static int Numero1 = 0;
    static int Numero2 = 0;
    static int Suma1 = 0;
    static int Suma2 = 0;
    static int divisores1[]=new int[100];
    static int divisores2[]=new int[100];
    static int a = 0;
    static int b = 0;

   static void LlenarDatos() {
        System.out.println("Bienvenido al programa de numeros amigos\n");
        System.out.print("Ingrese su primer numero:");
        Numero1 = Input.nextInt();
        System.out.print("Ingrese su segundo numero: ");
        Numero2 = Input.nextInt();
        System.out.println(" ");
    }

   static boolean Condiciones() {
        if (Numero1 <= 0) {
            System.out.print("Dato Invalido");
            return true;
        }
        if (Numero2 <= 0) {
            System.out.println("Dato Invalido");
            return true;
        }
        return false;
    }

    static void MostrarArreglo(int arreglo) {
        if (arreglo == 1) {
            for (int c = 0; c < a; c++) {
                System.out.println(divisores1[c] + " ");
            }
        } else {
            for (int c = 0; c < b; c++) {
                System.out.println(divisores2[c] + " ");
            }
        }
    }

    static void Algoritmo() {
        for (int c = 1; c < Numero1; c++) {
            if (Numero1 % c == 0) {
                Suma1 += c;
                divisores1[a] = c;
                a++;
            }

        }
        System.out.println("Los divisores del Numero1 son: ");
        MostrarArreglo(1);
        System.out.println("\nLa suma de los divisores del Numero 1 (" + Numero1 + ")es: " + Suma1);
        for (int c = 1; c < Numero2; c++) {
            if (Numero2 % c == 0) {
                Suma2 += c;
                divisores2[b] = c;
                b++;
            }
        }
        System.out.println("\nLos divisores del Numero2 son:");
        MostrarArreglo(2);
        System.out.println("\nLa suma de los divisores del Numero 2 (" + Numero2 + ")es: " + Suma2);
    }

    static void Resultado() {
        if (Numero1 == Suma2) {
            if (Numero2 == Suma1) {
                System.out.println("\nFelicidades!!!, si son números amigos :)");
            }
        } else {
            System.out.println("\nLo siento, no son numeros amigos :(");
        }
    }

    public static void main(String[] args) {
        boolean Control = true;
        while (Control) {
            LlenarDatos();
            Control = Condiciones();
        }
        Algoritmo();
        Resultado();
    }
}
