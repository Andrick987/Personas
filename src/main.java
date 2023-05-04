
import ControladorPersonas.PersonaControler;
import Modelo.ModeloPersona;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(null,true);
        ModeloPersona PersonasModel = new ModeloPersona();
        PersonaControler ControladorPaciente = new PersonaControler(VistaPrincipal, VistaPersonas, PersonasModel);
        
    }
    
}
