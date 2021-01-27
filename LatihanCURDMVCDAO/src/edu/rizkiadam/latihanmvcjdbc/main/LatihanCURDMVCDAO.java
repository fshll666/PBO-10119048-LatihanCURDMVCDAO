/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvcjdbc.main;

import edu.rizkiadam.latihanmvcjdbc.view.MainViewPelanggan;
import edu.rizkiadam.latihanmvcjdbc.database.KingsBarberShopDatabase;
import edu.rizkiadam.latihanmvcjdbc.entity.Pelanggan;
import edu.rizkiadam.latihanmvcjdbc.error.PelangganException;
import edu.rizkiadam.latihanmvcjdbc.services.PelangganDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author SystemOs
 * Nama  : Mochammad Faishal
 * Kelas : IF-2 
 * NIM   : 10119048
 */
public class LatihanCURDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanCURDMVCDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
}