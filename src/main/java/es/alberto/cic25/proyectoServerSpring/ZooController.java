package es.alberto.cic25.proyectoServerSpring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/zoo")
@RestController
public class ZooController {

    @Autowired
    private ZooService zooService;

    @GetMapping
    public List<Animales> get() {
        
        List<Animales> animalesZoo= zooService.create();

        return animalesZoo;

    }

    @GetMapping("/perro")
    public Animales getPerro(){

        return zooService.createPerro();
    }

    

}
