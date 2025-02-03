package Abstract;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mrgos
 */
public abstract class AAnimal {
    private String nombre;
    private int vida;
    private int energia;
    private boolean banio;
    private String sonido;
    private String especie;

    public AAnimal(String nombre, String sonido, String especie) {
        this.nombre = nombre;
        this.vida = 10;
        this.energia = 0;
        this.banio = false;
        this.sonido = sonido;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public boolean isBanio() {
        return banio;
    }

    public void setBanio(boolean banio) {
        this.banio = banio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + "\n Vida: " + this.vida + "\n Energia: " + this.energia;
    }
}
