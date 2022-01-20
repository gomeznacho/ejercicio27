package repository;

import entities.Coche;

import java.util.ArrayList;

public class CocheRepository {
    ArrayList<Coche> cocheRepository = new ArrayList<>();

    public void guardar(Coche coche){
        System.out.println("guardando coche " + coche.getClass().getName());
        cocheRepository.add(coche);
    }

    public void borrar(Coche coche){
        System.out.println("borrando coche " + coche.getClass());
        cocheRepository.remove(coche);
    }

    public void listar() {
        for(Coche coche : cocheRepository){
            System.out.println(coche.toString());
        }
    }
}
