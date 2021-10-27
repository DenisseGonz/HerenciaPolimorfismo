package com.generation.ejercicioUber;

public class ConductorUberBlack extends UberDrive{
    public ConductorUberBlack(){
        super();
    }

    @Override
    public double calculatePrice(double km){
        System.out.println("Esto es parte del Uber Black");
        return Math.max(super.getRatePerKm()*km,super.getMinimum());
    }

}
