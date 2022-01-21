package com.company;

public class Persona {
    String nombre;
    int edad;
    String dni;
    double peso;
    double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Persona(String nombre, int edad, String dni, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){

        double imc;
        imc = this.peso / (Math.pow(this.altura, 2));

        if(imc < 20){
            return -1;
        }else if (imc >= 20 && imc <= 25){
            return 0;
        }
        else{
            return 1;
        }

    }

    public boolean esMayorDeEdad(){
        return this.edad > 18;
    }


    public String mensaje(){

        String mensaje = "";
        int valor = calcularIMC();

        switch (valor){
           case -1: mensaje = "Bajo peso";
           break;
           case 0: mensaje = "Peso saludable";
           break;
           case 1: mensaje = "Sobrepeso";
           break;
        }
        return mensaje;

    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }



}
