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
public class probador {
    public static void main(String args[]){
        misEmpleados losEmpleados=new misEmpleados();
        int op;
        String nid;
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog(
            "Menú Principal \n"+
            "1. Agregar empleado \n"+
            "2. Borrar empleado \n"+
            "3. Mostrar todos \n"+
            "4. Buscar empleado \n"+
            "5. Funcionario de mejor salario \n"+
            "6. Salir \n"+
            "Entre su opción: ?"        
            ));
            
            switch(op){
                case 1:
                    losEmpleados.setAddEmpleado();
                break;
                case 2:
                    nid=JOptionPane.showInputDialog(
                        "Entre el NID del empleado a eliminar: ");
                    losEmpleados.setDelEmpleado(nid);
                break;
                case 3:
                    losEmpleados.getSeeAll();
                break;
                case 4:
                    nid=JOptionPane.showInputDialog(
                        "Entre el NID del empleado a consultar: ");
                    losEmpleados.getSeeInfo(nid);
                break;
                case 5:
                    losEmpleados.getMejorSalario();
                break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Adios!");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalido!");
            }
            
        }while(op!=6);
        System.exit(0);
    }
}
