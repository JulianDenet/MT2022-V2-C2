package modelo.VO;

public class LideresCargosBgaVO {

    private String Nombre;
    private String Cargo;

    public LideresCargosBgaVO(String Nombre, String Cargo){
        this.Nombre = Nombre;
        this.Cargo = Cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    
    
}
