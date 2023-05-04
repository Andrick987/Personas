
package Modelo;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ModeloPersona {
    
    ArrayList MiLista = new ArrayList();
     DefaultTableModel ModeloTabla;
    public void IngresarDatos(String ape ,String nom, String tel)
    {
        Persona nuevoCliente = new Persona(ape, nom, tel);
        this.MiLista.add(nuevoCliente);
    }
  public DefaultTableModel ListarPacientes()
    {
        ArrayList<Persona>listaLocal = MiLista;
        ModeloTabla = new DefaultTableModel();
        this.ModeloTabla.setRowCount(0);
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        for(Persona MiListaDePacientes: listaLocal)
        {
            this.ModeloTabla.addRow(new Object []{MiListaDePacientes.getApellidos()
                    ,MiListaDePacientes.getNombre(),MiListaDePacientes.getTelefono()});
 
    }
        return ModeloTabla;
    }

}
