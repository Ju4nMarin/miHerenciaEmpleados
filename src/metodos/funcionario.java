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
public class funcionario extends empleado{
    protected String cargo;
    protected float salario;

    public funcionario(String nid, String noms, String sexo, 
            String cargo, float salario) {
        super(nid, noms, sexo, "Funcionario");
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public float getSalario() {
        return salario;
    }
    
    public void getseeInfoFuncionario(){
        String info=this.getInfoEmpleado();
        info+="Cargo: "+cargo+"\n";
        info+="Salario: "+salario+"\n";
        JOptionPane.showMessageDialog(null, info);
    }
    
    public String getInfoFuncionario(){
        String info=this.getInfoEmpleado();
        info+="Cargo: "+cargo+"\n";
        info+="Salario: "+salario+"\n";
        return info;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }        
    
}
