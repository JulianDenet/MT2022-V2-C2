package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCutilities {
    
    private static final String UBICACION_BD = "C:/Users/julia/Desktop/me/Mision2022/Maraton/P30/Reto 4/ProyectosConstruccion.db";
    //private static final String UBICACION_BD = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException{
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    }

}
