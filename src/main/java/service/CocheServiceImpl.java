package service;

import entities.Coche;
import repository.CocheRepository;

public class CocheServiceImpl implements CocheService{
    CocheRepository cocheRepository = new CocheRepository();

    @Override
    public void guardar(Coche coche) {
        cocheRepository.guardar(coche);
    }

    @Override
    public void borrar(Coche coche) {
        cocheRepository.borrar(coche);
    }

    public void listar(){
        cocheRepository.listar();
    }
}
