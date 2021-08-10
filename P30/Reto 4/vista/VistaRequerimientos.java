package vista;

import java.util.ArrayList;
import modelo.VO.MaterialesProyectosVO;
import modelo.VO.LideresCargosBgaVO;
import controlador.ControladorRequerimientos;

public class VistaRequerimientos {
    
    private static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requirimiento1() {

        System.out.println("-----------------------------------------------");
        System.out.println("---------LIDERES Y CARGOS BUCARAMANGA----------");
        System.out.println("-----------------------------------------------");

        System.out.println("");
        System.out.println("Lider | Cargo");
        System.out.println("");

        // Llamar al controlador y recibir 
        try
        {
            ArrayList<LideresCargosBgaVO> arregloResultados = controlador.consultarLideresCargosBga();

            // Recorrer Arreglo
            for ( LideresCargosBgaVO registro : arregloResultados ){
                System.out.println( registro.getNombre() + " | " + registro.getCargo() );
            }


        } catch (Exception e) {
            System.err.println("Oops! Paso algo! " + e.getMessage());
        }
        
    }

    public static void requerimiento2(){

        System.out.println("-----------------------------------------------");
        System.out.println("------LISTA DE MATERIALES DE CONSTRUCCION------");
        System.out.println("--Para los proyectos: 157, 386, 172, 264, 306--");
        System.out.println("-----------------------------------------------");

        System.out.println("");
        System.out.println("Nombre_Material | Precio_Unidad | Total");
        System.out.println("");

        try
        {
            ArrayList<MaterialesProyectosVO> arregloResultados = controlador.consultarMaterialesProyectos();

            // Recorrer Arreglo
            for ( MaterialesProyectosVO registro : arregloResultados ){
                System.out.println( registro.getNombre_Material() + " | " + registro.getPrecio_Unidad() + " | " + registro.getTotal() );
            }


        } catch (Exception e) {
            System.err.println("Oops! Paso algo! " + e.getMessage());
        }


    }


}
