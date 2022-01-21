package com.company;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Persona persona1 = new Persona("Maria", 25, "1244315");
        Persona persona2 = new Persona("Noelia", 35, "214453", 70.0, 1.70);

        persona2.calcularIMC();
        System.out.println(persona2.mensaje());
        System.out.println(persona2.esMayorDeEdad());
        System.out.println(persona2.toString());
        

    }
}
