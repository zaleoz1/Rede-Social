/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redesocial.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import redesocial.classes.Usuario;

/**
 *
 * @author cliente
 */
public class ModelAmigos extends AbstractTableModel{
    
   public ArrayList<Usuario>amigos = new ArrayList<>();
    
   private final String[] colunas = {"Nome", "Email"};
   
   
     public void excluirAmizade(Usuario usuario, Usuario usuario2){
       amigos.remove(usuario2);
       amigos.remove(usuario);
       this.fireTableDataChanged();
    }
     
     public Usuario returnUsuario(int index){
         return amigos.get(index);
     }
   
  

    @Override
    public int getRowCount() {
       return amigos.size();
    }

    @Override
    public int getColumnCount() {
       return colunas.length;
    }
    @Override
     public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return amigos.get(rowIndex).getNomeUsuario();
        }else{
            return amigos.get(rowIndex).getEmail();
        }
        
    }
    
}
