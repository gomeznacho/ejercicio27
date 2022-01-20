package service;

import entities.Coche;
import repository.CocheRepository;

public interface CocheService {
    void guardar(Coche coche);
    void borrar(Coche coche);
    void listar();
}
