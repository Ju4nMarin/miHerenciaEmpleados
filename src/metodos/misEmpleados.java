/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruben
 */
public class misEmpleados {
    ArrayList lstEmpleados;
    
    misEmpleados(){
        lstEmpleados = new ArrayList();
    }
    
    public int getBuscarNid(String nid){
        int i;
        empleado temp=null;
        if(lstEmpleados.isEmpty()==true){          
            return -1;
        }
        else{
            for(i=0; i<lstEmpleados.size(); i++){
                temp=(empleado) lstEmpleados.get(i);
                if((temp.getNid()).equals(nid))
                    return i;
            }
            return -1;
        }
    }
    
    public void setAddEmpleado(){
        String nid, noms, sexo, tipoE;
        String preg, posg;
        String cargo; 
        float salario;
        int b, op;
        funcionario func=null;
        profesor prof=null;
        
        do{
            tipoE=JOptionPane.showInputDialog(
            "Entre tipo empleado a registrado [Funcionario (F)/Profesor (P), Otra letra: Salir]: ");
            
            if((tipoE.equals("F"))||(tipoE.equals("P"))){
                do{
                    nid=JOptionPane.showInputDialog(
                    "Entre NID del empleado: ");
                    b=getBuscarNid(nid);
                    if(b!=-1)
                        JOptionPane.showMessageDialog(null, 
                    "El NID del empleado ya existe! Intente nueavemente.");
                }while(b!=-1);
            
                noms=JOptionPane.showInputDialog("Entre nombres del empleado: ");
                sexo=JOptionPane.showInputDialog("Entre sexo empleado [F o M]");
            
                if(tipoE.equals("F")){
                    cargo=JOptionPane.showInputDialog(
                    "Entre cargo del empleado: ");
                    salario=Float.parseFloat(JOptionPane.showInputDialog(
                    "Entre salario del empleado: "));
                    func = new funcionario(nid, noms, sexo, cargo, salario);
                    lstEmpleados.add(func);
                }
                else{
                    preg=JOptionPane.showInputDialog("Entre pregrado del profesor: ");
                    posg=JOptionPane.showInputDialog("Entre posgrado del profesor: ");
                    prof=new profesor(nid, noms, sexo, preg, posg);
                    lstEmpleados.add(prof);
                }
            }else{
                JOptionPane.showMessageDialog(null, 
                "Opción invalida o salir");
            }        
        }while((tipoE.equals("F"))||(tipoE.equals("P")));
    }    
    
    public void setDelEmpleado(String nid){
        if(lstEmpleados.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "ArrayList sin datos!!");
        else{
            int b=getBuscarNid(nid);
            if(b==-1){
                JOptionPane.showMessageDialog(null, 
                "El Nid de empleado no existe!");
            }else{
                lstEmpleados.remove(b);
                JOptionPane.showMessageDialog(null, 
                "Información eliminada del vector!");
            }
        }
    }
    
    public void getSeeAll(){
        empleado emp=null;
        funcionario func=null;
        profesor prof=null;
        int i;
        if(lstEmpleados.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "ArrayList sin datos!!");
        else{
            for(i=0; i<lstEmpleados.size(); i++){
                emp=(empleado) lstEmpleados.get(i);
                if((emp.getTipoE()).equals("Funcionario")){
                    func=(funcionario) lstEmpleados.get(i);
                    func.getseeInfoFuncionario();
                }else{
                    prof=(profesor) lstEmpleados.get(i);
                    prof.getseeInfoProfesor();
                }
            }
        }
    }
    
    public void getSeeInfo(String nid){
        if(lstEmpleados.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "ArrayList sin datos!!");
        else{
            int b=getBuscarNid(nid);
            if(b==-1){
                JOptionPane.showMessageDialog(null, 
                "El Nid de empleado no existe!");
            }else{
                empleado emp=null;
                funcionario func=null;
                profesor prof=null;
                emp=(empleado) lstEmpleados.get(b);
                if((emp.getTipoE()).equals("Funcionario")){
                    func=(funcionario) lstEmpleados.get(b);
                    func.getseeInfoFuncionario();
                }else{
                    prof=(profesor) lstEmpleados.get(b);
                    prof.getseeInfoProfesor();
                }
            }
        }
    }
    
    public void getMejorSalario(){
        int i;
        int posM=-1;
        float may=-1;
        empleado emp=null;
        funcionario func=null;
        if(lstEmpleados.isEmpty()==true)
            JOptionPane.showMessageDialog(null, 
            "ArrayList sin datos!!");
        else{
            //Busqueda de la posición del funcionario
            //con Mejor salario.
            for(i=0; i<lstEmpleados.size(); i++){
                emp=(empleado) lstEmpleados.get(i);
                if((emp.getTipoE()).equals("Funcionario")){
                    func=(funcionario) lstEmpleados.get(i);
                    if(func.getSalario() >= may){
                        may=func.getSalario();
                        posM=i;
                    }
                }
            }
            
            if(posM==-1){
                JOptionPane.showMessageDialog(null, 
                "No existe el mayor salario!");
            }else{
                func=(funcionario) lstEmpleados.get(posM);
                String info="El funcionario con el mejor salario es: \n";
                info+=func.getInfoFuncionario();
                JOptionPane.showMessageDialog(null, info);
            }
        }
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
