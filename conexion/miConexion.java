/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class miConexion {
    String jdbc_driver="com.mysql.jdbc.Driver";
        String jdbc_db_url="JDBC:MYSQL//LOCALHOST:3306/miBD";
        String jdbc_user="root";
        String jdbc_pass="";
        private static Connection UnaConexion;
        
    public miConexion() throws ClassNotFoundException {
        try {
            Class.forName("jdbc_driver");
            UnaConexion=DriverManager.getConnection(jdbc_db_url, jdbc_user, jdbc_user);
//            Connection cnn=DriverManager.getConnection(jdbc_urc, jdbc_user, jdbc_urc);
//            PreparedStatement ps=cnn.prepareStatement("select * from pelicula");
//            ResultSet rs =ps.executeQuery();
//            while(rs.next()){
//                System.out.println(" "+rs.getString("titulo"));
//            }
//            cnn.close();
        } catch (SQLException ex) {
//        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    public Connection RetornarConeccion(){
        return UnaConexion;
    }
}
