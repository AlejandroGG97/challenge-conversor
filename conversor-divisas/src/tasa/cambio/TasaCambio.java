package tasa.cambio;

import com.google.gson.annotations.SerializedName;

public class TasaCambio {

    //@SerializedName("base_code")
    private String base;
    //@SerializedName("target_code")
    private String objetivo;
    //@SerializedName("conversion_rate")
    private Float tasaCambio;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Float getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(Float tasaCambio) {
        this.tasaCambio = tasaCambio;
    }
}
