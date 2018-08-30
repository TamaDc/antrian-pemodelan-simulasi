package multi.server;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Tama_DC Doscom
 */

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;


public class Koneksi {
  
    private static Connection koneksi;	
    public static Connection getKoneksi()
	{
            if(koneksi == null)
                {			
                try{
                    Class.forName("org.sqlite.JDBC");
                }catch(ClassNotFoundException ex){
                    JOptionPane.showMessageDialog(null, "Tidak ada Driver!\n" + ex);
                }
 
       //untuk koneksi ke database
       try{
           String url="jdbc:sqlite:db/Antrian.sqlite";
           koneksi=DriverManager.getConnection(url);
           System.out.println("Berhasil koneksi");
       }catch(SQLException se){
           System.out.println("Gagal koneksi "+se);
           JOptionPane.showMessageDialog(null,"Gagal Koneksi Database","Peringatan",JOptionPane.WARNING_MESSAGE);
       }
		}
		return koneksi;
	}  
}


