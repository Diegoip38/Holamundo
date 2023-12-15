/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.logica;

import com.dam.gestionvuelos.CompaniasClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author diegoip
 */
public class CompaniaTableModel extends AbstractTableModel{

    List<CompaniasClass> lstRegistros;
    ArrayList<String> columnNames;
    ArrayList<Class> columnClasses;
    
    
    
    @Override
    public int getRowCount() {
        return columnNames.size();
    }

    @Override
    public int getColumnCount() {
        return columnClasses.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CompaniasClass current = lstRegistros.get(rowIndex);
if (current != null && columnIndex >= 0 && columnIndex < getColumnCount()) {
switch (columnIndex) {
case 0:
return current.getCodigo();
case 1:
SimpleDateFormat fmt = new SimpleDateFormat("dd-MM-yyyyHH:mm:ss");
return current.getPrefijo();
case 2:
return current.getDirección();
case 3:
return current.getMunicipio();
case 4:
return current.getNombre();
default:
return "";
}
}
else
return "";
    }
    
}
