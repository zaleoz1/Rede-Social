/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redesocial.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import redesocial.classes.Empresa;

/**
 *
 * @author cliente
 */
public class ModelProdutos extends AbstractTableModel {
    
    public ArrayList<Empresa>listaProdutos = new ArrayList<>();
    String[] colunas = {"nome", "Produtos"};

    @Override
    public int getRowCount() {
        return listaProdutos.size();
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
            return listaProdutos.get(rowIndex).getNomeUsuario();
        }else{
            return listaProdutos.get(rowIndex).produtos;
        }
    }
    
}
