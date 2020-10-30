package clases;

import java.util.List;

public class Clientes {
    private String nombre;
    private String Cedula;
    private List<BeneficiosCovid19> listaBeneficios;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public List<BeneficiosCovid19> getListaBeneficios() {
        return listaBeneficios;
    }

    public void setListaBeneficios(List<BeneficiosCovid19> listaBeneficios) {
        this.listaBeneficios = listaBeneficios;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", Cedula='" + Cedula + '\'' +
                ", listaBeneficios=" + listaBeneficios +
                '}';
    }
}
