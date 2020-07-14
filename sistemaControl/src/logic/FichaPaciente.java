package logic;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author leunam
 */
public class FichaPaciente {
    private SimpleStringProperty nombreCompleto;
    private SimpleStringProperty rut;
    private SimpleStringProperty convenio;
    private SimpleStringProperty telefono;
    private SimpleStringProperty horaPendiente;

    public FichaPaciente(SimpleStringProperty nombreCompleto, SimpleStringProperty rut, 
            SimpleStringProperty convenio, SimpleStringProperty telefono, 
            SimpleStringProperty horaPendiente) {
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.convenio = convenio;
        this.telefono = telefono;
        this.horaPendiente = horaPendiente;
    }

    public SimpleStringProperty getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(SimpleStringProperty nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public SimpleStringProperty getRut() {
        return rut;
    }

    public void setRut(SimpleStringProperty rut) {
        this.rut = rut;
    }

    public SimpleStringProperty getConvenio() {
        return convenio;
    }

    public void setConvenio(SimpleStringProperty convenio) {
        this.convenio = convenio;
    }

    public SimpleStringProperty getTelefono() {
        return telefono;
    }

    public void setTelefono(SimpleStringProperty telefono) {
        this.telefono = telefono;
    }

    public SimpleStringProperty getHoraPendiente() {
        return horaPendiente;
    }

    public void setHoraPendiente(SimpleStringProperty horaPendiente) {
        this.horaPendiente = horaPendiente;
    }
    
}
