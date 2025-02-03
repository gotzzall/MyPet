/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mimascota;

import Abstract.AAnimal;
import Controlador.InteraccionesController;
import Modelos.Perro;

/**
 *
 * @author mrgos
 */
public class MiMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AAnimal animal1 = new Perro("Pancha");
        InteraccionesController interactuar = new InteraccionesController();
        
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        interactuar.alimentar(animal1);
        
        interactuar.jugar(animal1);
        interactuar.jugar(animal1);
        interactuar.jugar(animal1);
        
        interactuar.dormirla(animal1);
        interactuar.dormirla(animal1);
        interactuar.dormirla(animal1);
        System.out.println(animal1.toString());
    }
    
}
