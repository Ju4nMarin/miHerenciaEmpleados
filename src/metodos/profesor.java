/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class profesor extends empleado{
    protected String preg;
    protected String posg;

    public profesor(String nid, String noms, String sexo, 
                    String preg, String posg) {
        super(nid, noms, sexo, "Profesor");
        this.preg = preg;
        this.posg = posg;
    }        

    public String getPreg() {
        return preg;
    }

    public String getPosg() {
        return posg;
    }
    
    public void getseeInfoProfesor(){
        String info=this.getInfoEmpleado();
        info+="Pregrado: "+preg+"\n";
        info+="Posgrado: "+posg+"\n";
        JOptionPane.showMessageDialog(null, info);
    }
    
    public String getInfoProfesor(){
        String info=this.getInfoEmpleado();
        info+="Pregrado: "+preg+"\n";
        info+="Posgrado: "+posg+"\n";
        return info;
    }

    public void setPreg(String preg) {
        this.preg = preg;
    }

    public void setPosg(String posg) {
        this.posg = posg;
    }        
    
}
