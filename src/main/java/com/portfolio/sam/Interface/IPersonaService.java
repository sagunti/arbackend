package com.portfolio.sam.Interface;

import com.portfolio.sam.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer Lista Persona
    
    public List<Persona>getPersona();
    
    //Guardar objeto tipo persona
    
    public void savePersona (Persona persona);
    
    //Eliminar persona por id
    
    public void deletePersona(Long id);
    
    //Buscar persona por Id
    
    public Persona findPersona(Long id);
}
