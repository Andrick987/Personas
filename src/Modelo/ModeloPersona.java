
package Modelo;

import java.util.ArrayList;

public class ModeloPersona {
    
    public ArrayList<Persona> ListaPersonas = new ArrayList<Persona>();
    
    public void AgregarPersona(String apellido, String nombre, String telefono){
        Persona NuevaPersona = new Persona(apellido, nombre, telefono);
        this.ListaPersonas.add(NuevaPersona);
    }
    
    public ArrayList ListarPersona(){
        return ListaPersonas;
    }
}
