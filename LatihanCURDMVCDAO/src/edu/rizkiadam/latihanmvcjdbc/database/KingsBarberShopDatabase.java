/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rizkiadam.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.rizkiadam.latihanmvcjdbc.impl.PelangganDaoImpl;
import edu.rizkiadam.latihanmvcjdbc.services.PelangganDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author SystemOs
 * Nama  : Mochammad Faishal
 * Kelas : IF-2 
 * NIM   : 10119048
 */
public class KingsBarberShopDatabase {
    private static Connection connection;
    private static PelangganDao pelangganDao;
    
    public static Connection getConnection() throws SQLException{
      if(connection==null){
       
          MysqlDataSource dataSource = new MysqlDataSource();
          dataSource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
          dataSource.setUser("root");
          dataSource.setPassword("");
          connection = dataSource.getConnection();
      }
      
      return connection;  
    }
    
    public static PelangganDao getPelangganDao() throws SQLException{
        if(pelangganDao==null){
            pelangganDao = new PelangganDaoImpl(getConnection());
        }
        return pelangganDao;
    }
}