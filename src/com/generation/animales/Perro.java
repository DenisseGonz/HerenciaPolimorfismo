package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos{

    private int patas;
    private boolean cola;
    private String raza;

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void jugar(){
        System.out.println("Toy corriendo woof");
    }

    @Override
    public void dormir() {
        System.out.println("El canino se puso a memir");
    }

    @Override
    public void hablar() {
        System.out.println("Soy el perro que esta hablando woof woof");
    }

    public void ladrar(){
        System.out.println("Woof woof");
    }

    //Para usar el polimorfismo se usan anotaciones

    @Override
    public void comer(){
        System.out.println("Estoy comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("El dogo respira");
    }

    @Override
    public void gestar() {
        System.out.println("Tiempo de 2 meses");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Soy terrestre y camino en 4 patas");
    }
}
