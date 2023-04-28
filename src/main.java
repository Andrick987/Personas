
import ControladorPersonas.PersonaControler;
import Modelo.ModeloPersona;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        ModeloPersona PersonaModel = new ModeloPersona();
        
        PersonaControler ControladorPersonas = new PersonaControler(VistaPrincipal, VistaPersonas, PersonaModel);
    }
    
}
