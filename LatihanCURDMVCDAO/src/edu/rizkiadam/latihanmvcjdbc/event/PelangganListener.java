/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvcjdbc.event;

import edu.riziadam.latihanmvcjdbc.model.PelangganModel;
import edu.rizkiadam.latihanmvcjdbc.entity.Pelanggan;

/**
 *
 * @author SystemOs
 * Nama  : Mochammad Faishal
 * Kelas : IF-2 
 * NIM   : 10119048
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
      
    public void onDelete();

    public void onUpdate(Pelanggan pelanggan);
    
}
