import java.util.Scanner;

public class Main {

    public static void holamundo(){
        System.out.print("Mira mama, mi primer programa en java");
        System.out.print("Hola mundo");
    }
    public static void Suma_numeros(){
        Scanner sc;
        sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Ingrese primer numero");
        n1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        n2 = sc.nextInt();

        int respuesta = n1+n2;

        System.out.println("Resultado es: ");
        System.out.println( respuesta);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do{
            System.out.println("Menu de Ejercicios");
            System.out.println("1. Hola mundo");
            System.out.println("2 Suma de dos números ");
            System.out.println("3 Número par o e impar");
            System.out.println("4 Factorial de un numero");
            System.out.println("5 Tabla de multiplicar");
            System.out.println("6 Salir");
            System.out.print("Seleccione una opción ");

            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    holamundo();
                    break;
                case 2:
                    Suma_numeros();
                    break;
                case 6:
                    System.out.println("Saliendo del programa,orale");
                    break;
            }

        }while (opcion!=6);
        sc.close();
    }
}