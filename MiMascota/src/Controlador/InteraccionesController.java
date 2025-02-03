/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Abstract.AAnimal;

/**
 *
 * @author mrgos
 */
public class InteraccionesController {
    public void alimentar(AAnimal animal){
        int nivelEnergia = animal.getEnergia();
        int nivelVida = animal.getVida();
        nivelEnergia += 1;
        nivelVida += 1;
        if(nivelEnergia < 11){
            animal.setEnergia(nivelEnergia);
            if(nivelVida < 11){
                animal.setVida(nivelVida);
            }
        }else{
            System.out.println("Está lleno");
        }
    }
    
    public void jugar(AAnimal animal){
        int nivelEnergia = animal.getEnergia();
        int nivelVida = animal.getVida();
        nivelEnergia -= 1;
        nivelVida -= 1;
        if(nivelEnergia > -1){
            animal.setEnergia(nivelEnergia);
        }else{
            if(nivelVida > -1){
                animal.setVida(nivelVida);
            }
        }
    }
    
    public void dormirla(AAnimal animal){
        int nivelEnergia = animal.getEnergia();
        nivelEnergia += 1;
        if(nivelEnergia < 11){
            animal.setEnergia(nivelEnergia);
        }
    }
}
