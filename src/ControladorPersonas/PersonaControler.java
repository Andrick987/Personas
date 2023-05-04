
package ControladorPersonas;

import Modelo.ModeloPersona;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonaControler implements ActionListener{

    frmPersonas VistaPersonas;
    frmPrincipal VistaPrincipal;
    ModeloPersona PersonaModel;

    public PersonaControler(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas, ModeloPersona PersonaModel) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.PersonaModel = PersonaModel;

        this.VistaPersonas.btnAgregar.addActionListener(this);
        this.VistaPersonas.btnListar.addActionListener(this);
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPersonas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == VistaPersonas.btnAgregar)
        {

            this.PersonaModel.IngresarDatos(this.VistaPersonas.txtApellidos.getText(),
            this.VistaPersonas.txtNombre.getText(), this.VistaPersonas.txtTelefono.getText());
            this.VistaPersonas.txtApellidos.setText("");
            this.VistaPersonas.txtNombre.setText("");
            this.VistaPersonas.txtTelefono.setText(""); 
            
        }
        if(e.getSource() == VistaPersonas.btnListar)
        {

           
            this.VistaPersonas.jtPersonas.setModel(this.PersonaModel.ListarPacientes());
             
            this.VistaPersonas.setLocationRelativeTo(VistaPrincipal);
            this.VistaPersonas.setVisible(true);
        }
    }
  
}
