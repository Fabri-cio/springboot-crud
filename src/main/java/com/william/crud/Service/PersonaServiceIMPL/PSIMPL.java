package com.william.crud.Service.PersonaServiceIMPL;

import com.william.crud.Entity.Persona;
import com.william.crud.Repository.PersonaRepo;
import com.william.crud.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//10 esta clase va ser la que va aplicar los servicios, necesitamos decirle a spring que la reconosca como una clase de tipo service
@Service //11 etiqueta que dice que es una clase de tipo service
public class PSIMPL implements PersonaService { //12 implemts es para clases, vamos a implementar los metodos que tiene la clase PersonaService ojo todo los demas se genera con alt + mayus + intro

    @Autowired // 19 para que spring lo tenga en cuenta a este objeto que sea relavante osea a repo
    private PersonaRepo repo; //12 vamos a llamar a un objeto clase PersonaRepo que ereda varios metodos de CrudRepository

    @Override
    public List<Persona> ConsultarPersona() {
        return (List<Persona>) this.repo.findAll();  //13 nos saldra un error porque tenemos que castear porque es una lista, podemos utilizar los metodos
    }

    @Override
    public Persona CrearPersona(Persona persona) {
        persona.setEmail(persona.getEmail()); //14 necesitamos devolver un metodo seteado y devolverlo ojo puede ser cualquiera pero utilizaremos email
        return this.repo.save(persona); // 15 guardamos cuando creamos persona con save mandando un entity de tipo persona
    }

    @Override
    public Persona ModificarPersona(Persona persona) {
        return this.repo.save(persona); //16 modificamos con save con un entity de tipo persona
    }

    @Override
    public Persona BuscarPersona(int id) {
        return this.repo.findById(id).get(); // 17 retornamos por el metodo encontrar por el id
    }

    @Override
    public void EliminarCrearPersona(int id) {
        this.repo.deleteById(id);  //18 aqui no retornamos nada solomente eliminamos por el id
    }

    //20 nos vamos al paquete controller y creamos una clase Controlador.java
}
