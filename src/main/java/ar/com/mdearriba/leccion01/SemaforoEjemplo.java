package ar.com.mdearriba.leccion01;

import java.util.Scanner;

public class SemaforoEjemplo {
    public static void main(String[] args) {
        System.out.println("Ingrese un color de un semaforo");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        if (color == "verde") {
            System.out.println("debes pasar");
        } else {
            if (color == "amarillo") {
                System.out.println("precaucion");
            } else {
                System.out.println("parar");
            }
        }

    }
}
