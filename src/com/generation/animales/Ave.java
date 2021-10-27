package com.generation.animales;

public class Ave extends Animal{

    private int alas;
    private int patas;
    private  boolean vuela;

    public Ave(){
        super();
    }
    public Ave(String nombre){
        super(nombre);
    }

    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }
    public void ponerHuevo(){
        System.out.println("Se me esta saliendo un huevo");
    }

    @Override
    public void comer(){
        System.out.println("Estoy comiendo alpiste");
    }
    @Override
    public void respirar(){
        System.out.println("El ave respira por su pico");
    }

}
