package com.generation;

import com.generation.animales.Ave;
import com.generation.animales.Perro;
import com.generation.ejercicioUber.ConductorUberBlack;
import com.generation.ejercicioUber.UberDrive;

public class Main {

    public static void main(String[] args) {

        /*
        Ave cuervo = new Ave("Cuervo kasugai");
        Ave ave = new Ave();
        System.out.println(cuervo.getNombre());
        cuervo.comunicarse();
        cuervo.ponerHuevo();
        cuervo.comer();

        System.out.println("---------------------------");
        Perro lomito = new Perro("Mike");
        lomito.ladrar();
        lomito.comer();
        */

        UberDrive Mariano = new UberDrive();
        System.out.println("El precio de un Uber normal es: "+Mariano.calculatePrice(6));

        ConductorUberBlack Anastacio =new ConductorUberBlack();
        System.out.println(Anastacio.calculatePrice(6));
    }
}
