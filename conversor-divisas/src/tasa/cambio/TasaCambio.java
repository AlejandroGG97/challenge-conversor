package tasa.cambio;

import com.google.gson.annotations.SerializedName;

public class TasaCambio {

    @SerializedName("base_code")
    private String base;
    @SerializedName("target_code")
    private String objetivo;

    private Double tasaCambio;

    private Double Conversion;

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

    public Double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(Double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    public Double getConversion() {
        return Conversion;
    }

    public void setConversion(Double conversion) {
        Conversion = conversion;
    }
}
