package com.william.crud.Service;

import com.william.crud.Entity.Persona;

import java.util.List;

//en esta clase vamos a crear metodos
public interface PersonaService {
    public List<Persona> ConsultarPersona(); //9 queremos consultar todas las personas que hay en nuestra base de datos en una lista
    public Persona CrearPersona(Persona persona); //devolvemos un objeto tipo persona
    public Persona ModificarPersona(Persona persona);
    public Persona BuscarPersona(int id);
    public void EliminarCrearPersona(int id);

    //10 nos vamos al paquete service y creamos otro paquete PersonaServiceIMPL adentro de ese paquete creamos una clase PSIMLP(PersonaServiceImplementacion)
}
