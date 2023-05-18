package com.william.crud.Controller;


import com.william.crud.Entity.Persona;
import com.william.crud.Service.PersonaServiceIMPL.PSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController     //21 vamos a decirle a spring que la reconosca como una clase de tipo controlador
@RequestMapping      //esto quiere decir que vamos a ingresar al directorio que nosotros seleccionemos
public class Controlador {

    @Autowired
    private PSIMPL impl;        //22 vamos a crear un objeto de tipo PSIMPL para eredar los metodos y modificarlos agregar la logica de los metodos

    @GetMapping         //24 vamos agregar porque vamos a consultar personas
    @RequestMapping(value = "ConsultarPersonas", method = RequestMethod.GET)      //25 va tener como valor el mismo nombre consultarpersonas y un metodo requestmethod.get para obtener objetos
    public ResponseEntity<?> ConsultarPersonas() {         //23 con responseentity que me devuelva cualquier objeto <?> y agremos el nommbre de consultar personas
        List<Persona> listaPersona=this.impl.ConsultarPersona();
        return ResponseEntity.ok(listaPersona)
    }
}
