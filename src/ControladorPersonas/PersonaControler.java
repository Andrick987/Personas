
package ControladorPersonas;

import Modelo.ModeloPersona;
import Vistas.frmPersonas;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class PersonaControler implements ActionListener{

    frmPrincipal VistaPrincipal;
    frmPersonas VistaPersonas;
    ModeloPersona PersonaModel;
    
    public DefaultTableModel TablePersonas = new DefaultTableModel();

    public PersonaControler(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, ModeloPersona PersonaModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.PersonaModel = PersonaModel;
        
        this.TablePersonas.addColumn("APELLIDOS");
        this.TablePersonas.addColumn("NOMBRES");
        this.TablePersonas.addColumn("TELEFONO");
        
        this.VistaPersonas.jtPersonas.setModel(TablePersonas);
        
        this.VistaPersonas.btnListar.addActionListener(this);
        this.VistaPersonas.btnAgregar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==this.VistaPersonas.btnAgregar){
        
            
            
    }
    }
  
}
