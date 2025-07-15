package es.alberto.cic25.proyectoServerSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ZooService {

    public List create() {

        List<Animales> animalesZoo = new ArrayList<>();

        Animales perro = new Animales("Perro", "Labrador", 12);

        Animales gato = new Animales("Gato", "Siames", 5);
        Animales caballo = new Animales("Caballo", "Español", 8);
        Animales loro = new Animales("Ave", "Loro", 3);
        Animales conejo = new Animales("Conejo", "Enano", 2);
        animalesZoo.add(perro);
        animalesZoo.add(conejo);
        animalesZoo.add(loro);
        animalesZoo.add(caballo);

        return animalesZoo;
    }

    public Animales createPerro() {
        
        Animales perro = new Animales("Perro", "Labrador", 12);

        return perro;
    }
}
