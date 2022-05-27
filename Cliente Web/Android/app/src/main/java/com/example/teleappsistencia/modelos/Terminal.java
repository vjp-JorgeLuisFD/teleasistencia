package com.example.teleappsistencia.modelos;

import com.google.gson.annotations.SerializedName;

/**
 * Clase encargada del modelo de un Terminal.
 */
public class Terminal {

    /**
     * Atributos de la clase
     */
    @SerializedName("id")
    private int id;
    @SerializedName("numero_terminal")
    private String numeroTerminal;
    @SerializedName("modo_acceso_vivienda")
    private String modoAccesoVivienda;
    @SerializedName("barreras_arquitectonicas")
    private String barrerasArquitectonicas;
    @SerializedName("id_titular")
    private Object titular;
    @SerializedName("id_tipo_vivienda")
    private Object tipoVivienda;


    /**
     * Getters y setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }

    public String getModoAccesoVivienda() {
        return modoAccesoVivienda;
    }

    public void setModoAccesoVivienda(String modoAccesoVivienda) {
        this.modoAccesoVivienda = modoAccesoVivienda;
    }

    public String getBarrerasArquitectonicas() {
        return barrerasArquitectonicas;
    }

    public void setBarrerasArquitectonicas(String barrerasArquitectonicas) {
        this.barrerasArquitectonicas = barrerasArquitectonicas;
    }

    public Object getTitular() {
        return titular;
    }

    public void setTitular(Object titular) {
        this.titular = titular;
    }

    public Object getTipoVivienda() {
        return tipoVivienda;
    }

    public void setTipoVivienda(Object tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "Terminal{" +
                "id=" + id +
                ", numeroTerminal='" + numeroTerminal + '\'' +
                ", modoAccesoVivienda='" + modoAccesoVivienda + '\'' +
                ", barrerasArquitectonicas='" + barrerasArquitectonicas + '\'' +
                ", titular=" + titular +
                ", tipoVivienda=" + tipoVivienda +
                '}';
    }
}
