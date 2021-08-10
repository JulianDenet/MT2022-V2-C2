package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.DAO.LideresCargosBgaDAO;
import modelo.DAO.MaterialesProyectosDAO;
import modelo.VO.MaterialesProyectosVO;
import modelo.VO.LideresCargosBgaVO;

public class ControladorRequerimientos {

    private final MaterialesProyectosDAO materialesProyectosDao;
    private final LideresCargosBgaDAO lideresCargosBgaDao;

    public ControladorRequerimientos(){
        materialesProyectosDao = new MaterialesProyectosDAO();
        lideresCargosBgaDao = new LideresCargosBgaDAO();
    }

    public ArrayList<MaterialesProyectosVO> consultarMaterialesProyectos() throws SQLException{
        return materialesProyectosDao.TotalesMaterialesProyectos();
    }
    
    public ArrayList<LideresCargosBgaVO> consultarLideresCargosBga() throws SQLException{
        return lideresCargosBgaDao.consultarLideresCargosBga();
    }

}
