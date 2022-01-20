import entities.CocheAnfibio;
import entities.CocheVolador;
import repository.CocheRepository;
import service.CocheServiceImpl;

public class Main {
    public static void main(String[] args) {

        //Instancia de los coches y comprobación de los métodos
        CocheVolador coche1 = new CocheVolador(5);
        CocheAnfibio coche2 = new CocheAnfibio(3);
        System.out.println(coche1.getMarca()+" "+  coche1.getModelo()+" alas: "+coche1.getAlas() );
        System.out.println(coche2.getMarca() +" "+ coche2.getModelo()+" aletas: "+coche2.getAletas() );

        coche1.setVelocidad(120);
        coche2.setVelocidad(80);
        System.out.println("velocidad antes de acelerar: " + coche1.getVelocidad()+ " " + coche2.getVelocidad());
        coche1.acelerar();
        coche2.acelerar();
        System.out.println("velocidad después de acelerar: " +coche1.getVelocidad()+ " " + coche2.getVelocidad());

        //Comprobación de los métodos de las interfaces
        coche1.avanzar();
        coche1.retroceder();
        coche1.subir();

        coche2.avanzar();
        coche2.retroceder();
        coche2.bajar();

        //Comprobación de la capa servicio y repositorio
        CocheServiceImpl service = new CocheServiceImpl();

        service.guardar(coche1);
        service.guardar(coche2);
        System.out.println("");
        service.listar();
        System.out.println("");
        service.borrar(coche1);
        service.borrar(coche2);

    }
}
