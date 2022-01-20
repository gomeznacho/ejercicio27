package entities;

import service.Movimiento;

public class Coche implements Movimiento {
    private String marca;
    private String modelo;
    private int velocidad;
    protected Coche(){}
    public void acelerar(){};

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void avanzar() {
        System.out.println("Voy hacia delante");
    }

    @Override
    public void retroceder() {
        System.out.println("Voy hacia atrás");
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
