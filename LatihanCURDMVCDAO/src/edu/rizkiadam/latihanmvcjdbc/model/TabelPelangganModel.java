/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvcjdbc.model;

import edu.rizkiadam.latihanmvcjdbc.entity.Pelanggan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author SystemOs
 * Nama  : Mochammad Faishal
 * Kelas : IF-2 
 * NIM   : 10119048
 */
public class TabelPelangganModel extends AbstractTableModel{
    
    private List<Pelanggan> list = new ArrayList<Pelanggan>();

    public void setList(List<Pelanggan> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    public boolean add(Pelanggan e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1,getRowCount()-1);
        }
    }

    public Pelanggan get(int i) {
        return list.get(i);
    }

    public Pelanggan set(int index, Pelanggan element) {
        try {
        
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
        
    }

    public Pelanggan remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 1 : 
                return "ID";
            case 2 : 
                return "Nama";
            case 3 : 
                return "Alamat";
            case 4 : 
                return "Telepon";
            case 5 : 
                return "Email"; 
            default :
                return null;
        }
    }
    
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 1 : 
                return list.get(rowIndex).getId();
                
            case 2 : 
                return list.get(rowIndex).getNama();
            
            case 3 : 
                return list.get(rowIndex).getAlamat();
            
            case 4 : 
                return list.get(rowIndex).getTelepon();
            
            case 5 : 
                return list.get(rowIndex).getEmail();
            default: 
                return null;
        }
}
}