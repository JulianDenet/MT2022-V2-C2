package modelo.DAO;

import java.util.ArrayList;
import modelo.VO.LideresCargosBgaVO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCutilities;


public class LideresCargosBgaDAO {
    
    public ArrayList<LideresCargosBgaVO> consultarLideresCargosBga() throws SQLException{

        ArrayList<LideresCargosBgaVO> respuesta = new ArrayList<LideresCargosBgaVO>();

             // Consultar BD

             Connection conexion = JDBCutilities.getConnection();
             Statement st = conexion.createStatement();
     
             String query =" SELECT Nombre || \" \" || Primer_Apellido || \" \" || Segundo_Apellido Nombre, Cargo " +
             "FROM Lider " + 
             "WHERE Ciudad_Residencia = 'Bucaramanga' " +
             "ORDER BY Nombre ";
     
             ResultSet rs = st.executeQuery(query);
     
             // Cargar resultados en POO
     
             while( rs.next() ){
     
                 String Nombre = rs.getString("Nombre");
                 String Cargo = rs.getString("Cargo");
     
                 LideresCargosBgaVO registro = new LideresCargosBgaVO(Nombre, Cargo);
     
                 respuesta.add(registro);
     
             }

             rs.close();
             st.close();
             conexion.close();
     
     
        return respuesta;

    }

}
