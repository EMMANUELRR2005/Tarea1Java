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
    public static void numero_par(){
        Scanner sc;
        sc = new Scanner(System.in);
        int n1;

        System.out.println("Ingrese el número");
        n1 = sc.nextInt();

        if ( n1 % 2 == 0){
            System.out.println("El número es par");
        }
        else{
            System.out.println("El número es impar");
        }
    }
    public static void factorial_numeross(){
         Scanner sc;
         sc = new Scanner(System.in);
         int n1;

         System.out.println("Ingrese el número");
         n1 = sc.nextInt();

         long factorial = 1;

         for (int i = 1; i <= n1; i++){
             factorial *= i;
         }
         System.out.println("El factorial de" + n1 + " es: " + factorial     );
    }
    public static void tabla_multiplicar (){
        Scanner sc;
        sc = new Scanner(System.in);
        int n1;

        System.out.println("Ingrese el numero que desea ver la tabla");
        n1 = sc.nextInt();

        System.out.println("Manera ascendente");

        for ( int i = 1; i <= 10; i++){
            System.out.println(n1 + " x " + i + " = " + n1*i);
        }

        System.out.println("Manera descendente");
        for ( int i = 10; i >= 1; i--){
            System.out.println(n1 + " x " + i + " = " + n1*i);
        }
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
                case 3:
                    numero_par();
                    break;
                case 4:
                    factorial_numeross();
                    break;
                case 5:
                    tabla_multiplicar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa,orale");
                    break;
            }

        }while (opcion!=6);
        sc.close();
    }
}