/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redesocial;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;

/**
 *
 * @author gustavo
 */
public class ModelUser extends AbstractTableModel{
    
    ArrayList<Usuario> ListaDePessoas = new ArrayList();
    
    String[] colunas = {"nome", "email"};
    
     public void adcionarPessoa(Usuario u){
        ListaDePessoas.add(u);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return ListaDePessoas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return ListaDePessoas.get(rowIndex).getNomeUsuario();      
        }
        else{
            return ListaDePessoas.get(rowIndex).getEmail();
        }
    }
    
}
