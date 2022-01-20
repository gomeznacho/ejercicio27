package entities;

import service.Movimiento;
import service.MovimientoAcuatico;

public class CocheAnfibio extends Coche implements MovimientoAcuatico {
    int aletas;

    public CocheAnfibio(int aletas){
        super("Lotus", "Esprit");
        this.aletas = aletas;
    }

    public int getAletas() {
        return aletas;
    }

    public void setAletas(int aletas) {
        this.aletas = aletas;
    }

    @Override
    public void acelerar() {
      this.setVelocidad(this.getVelocidad()+5);
    }

    @Override
    public void bajar() {
        System.out.println("Estoy bajando");
    }

    @Override
    public String toString() {
        return  "marca=" + this.getMarca() +
                " modelo=" + this. getModelo() +
                " aletas=" + aletas +
                '}';
    }
}
