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
public class empleado {
    protected String nid;
    protected String noms;
    protected String sexo;
    protected String tipoE;  //Funcionario o Profesor

    public empleado(String nid, String noms, String sexo, String tipoE) {
        this.nid = nid;
        this.noms = noms;
        this.sexo = sexo;
        this.tipoE = tipoE;
    }

    public String getNid() {
        return nid;
    }

    public String getNoms() {
        return noms;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTipoE() {
        return tipoE;
    }
    
    public void getseeInfoEmpleado(){
        String info="La información básica del empleado es: \n";
        info += "Nid: "+nid+"\n";
        info += "Nombres: "+noms+"\n";
        info += "Sexo: "+sexo+"\n";
        info += "Tipo empleado: "+tipoE+"\n";
        JOptionPane.showMessageDialog(null, info);
    }
    
    public String getInfoEmpleado(){
        String info="La información del empleado es: \n";
        info += "Nid: "+nid+"\n";
        info += "Nombres: "+noms+"\n";
        info += "Sexo: "+sexo+"\n";
        info += "Tipo empleado: "+tipoE+"\n";
        return info;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public void setNoms(String noms) {
        this.noms = noms;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoE(String tipoE) {
        this.tipoE = tipoE;
    }        
    
}
