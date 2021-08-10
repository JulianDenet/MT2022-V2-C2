package modelo.DAO;

import java.util.ArrayList;
import modelo.VO.MaterialesProyectosVO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.JDBCutilities;

public class MaterialesProyectosDAO {
    
    public ArrayList<MaterialesProyectosVO> TotalesMaterialesProyectos() throws SQLException{

        ArrayList<MaterialesProyectosVO> respuesta = new ArrayList<MaterialesProyectosVO>();

        // Consultar BD

        Connection conexion = JDBCutilities.getConnection();
        Statement st = conexion.createStatement();

        String query = "SELECT mc.Nombre_Material, mc.Precio_Unidad, SUM(c.Cantidad) Total " +
        "FROM Proyecto p " +
        "    LEFT JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " + 
        "    LEFT JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion " +
        "WHERE p.ID_Proyecto in (157, 386, 172, 264, 306) " +
        "GROUP BY mc.Nombre_Material " +
        "ORDER BY mc.Nombre_Material";

        ResultSet rs = st.executeQuery(query);

        // Cargar resultados en POO

        while( rs.next() ){

            String Nombre_Material = rs.getString("Nombre_Material");
            Integer Precio_Unidad = rs.getInt("Precio_Unidad");
            Integer Total = rs.getInt("Total");

            MaterialesProyectosVO registro = new MaterialesProyectosVO(Nombre_Material, Precio_Unidad, Total);

            respuesta.add(registro);

        }

        rs.close();
        st.close();
        conexion.close();

        return respuesta;

    }

}
