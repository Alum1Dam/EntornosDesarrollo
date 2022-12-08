import es.iesmz.prueba.Coche;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {

        //Para imprimir las marcas
        sc = new Scanner(System.in);

        //Método Coche
        Coche coche1 = new Coche("Fiat", "Panda", "Groc");
        //Imprimimos los datos y "pintamos el coche"
        coche1.imprime();
        coche1.pinta();

        System.out.println("----------SEPARADOR DE COCHES----------");
        System.out.println();


        System.out.println("----------INTRODUCE LOS DATOS DEL COCHE----------");
        System.out.println();

        //Pedimos los datos del coche
        System.out.println("Marca del coche: ");
        String marcaCoche = sc.nextLine();
        System.out.println("Modelo del coche: ");
        String modeloCoche = sc.nextLine();
        System.out.println("Molor del coche: ");
        String colorCoche = sc.nextLine();

        //Pedimos los datos de la velocidad del coche
        System.out.println("Velocidad del coche: ");
        int velocidadCoche = sc.nextInt();

        //Pedimos los datos del frenado del coche
        System.out.println("Frenado del coche: ");
        int frenadoCoche = sc.nextInt();

        //Almacenamos los datos pedidos
        Coche coche2 = new Coche(marcaCoche, modeloCoche, colorCoche);

        //Este es la aceleración del coche
        coche2.acelera(velocidadCoche);
        coche2.imprime();

        coche2.pinta();

        //Este es el frenado del coche
        coche2.imprime();
        coche2.frena(frenadoCoche);

        coche2.pinta();

        //Aquí el coche se para
        coche2.para();
        coche2.imprime();

        coche2.pinta();
    }
}