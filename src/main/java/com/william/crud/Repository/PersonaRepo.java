package com.william.crud.Repository;

import com.william.crud.Entity.Persona;
import org.springframework.data.repository.CrudRepository;

//8 lo que va ser esta clase va ser eredar metodos de otra clase
public interface PersonaRepo extends CrudRepository<Persona,Integer> {  //9 heredamos metodos de la clase CrudRepository nos pide dos parametros esta clase nos pide el objeto clase que nosotros queremos aplicar estos metodos
//9 nos vamos al paquete service y creamos una interface PersonaService.java
}


