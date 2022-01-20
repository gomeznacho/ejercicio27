package entities;

import service.MovimientoVolador;

public class CocheVolador extends Coche implements MovimientoVolador {
    int alas;

    public CocheVolador(int alas){
        super("nimbus", "2000");
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public void acelerar(){
       this.setVelocidad(this.getVelocidad()+20);
    }


    @Override
    public void subir() {
        System.out.println("estoy subiendo");
    }

    @Override
    public String toString() {
        return "marca=" + this.getMarca() +
                " modelo" + this. getModelo() +
                " alas=" + alas +
                '}';
    }
}
