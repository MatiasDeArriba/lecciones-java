package ar.com.mdearriba.leccion01;

import java.util.Scanner;

public class ScanLinnerEjemplo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre= scanner.nextLine();
        System.out.print("Por favor ingrese su apellido: ");
        String apellido= scanner.nextLine();
        System.out.println("mi nombre es "+ nombre+" mi apellido es "+ apellido);
    }
}
