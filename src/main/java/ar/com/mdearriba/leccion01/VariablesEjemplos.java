package ar.com.mdearriba.leccion01;

public class VariablesEjemplos {
    public static void main(String[] args) {
        String nombre=null;
         nombre="Maximiliano";

        System.out.println("Hola "+ nombre);
        int edad=10;
        System.out.println("edad "+ edad);
        int resultrest=edad-5;
        System.out.println("el resultado de la resta de edad -5 es "+ resultrest);

        // esto es un IF
        if (30<50) {
            System.out.println("treinta es mayor que cincuenta");
        }
        else {
        System.out.println("treinta es menor a cincuenta");
        }


    }
}
