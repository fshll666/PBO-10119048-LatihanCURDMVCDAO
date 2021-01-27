/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvcjdbc.services;

import edu.rizkiadam.latihanmvcjdbc.entity.Pelanggan;
import edu.rizkiadam.latihanmvcjdbc.error.PelangganException;
import java.util.List;

/**
 *
 * @author SystemOs
 */
public interface PelangganDao {
    
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(int id) throws PelangganException;
    
    public Pelanggan getPelanggan(int id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
