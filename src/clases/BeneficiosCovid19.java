package clases;

import java.util.List;

public class BeneficiosCovid19 {
    private String id;
    private String nombre;
    private float valorSubsidio;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValorSubsidio(float valorSubsidio) {
        this.valorSubsidio = valorSubsidio;
    }

    public float getValorSubsidio() {
        return valorSubsidio;
    }

    public Float getMejorbeneficio(Float valorCompara ){
        float mejorBeneficio
        float valorClase = this.valorSubsidio;
        if(valorCompara>valorClase)
            mejorBeneficio = valorCompara;
        else
            mejorBeneficio=valorClase;

        return mejorBeneficio;
    }
}
