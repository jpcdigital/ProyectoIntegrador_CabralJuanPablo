package com.portfolio.jpc.Interface;

import com.portfolio.jpc.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}
