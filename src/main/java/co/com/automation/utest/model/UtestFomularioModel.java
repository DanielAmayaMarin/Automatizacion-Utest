package co.com.automation.utest.model;

import co.com.automation.utest.util.MetodoEspecial;

public class UtestFomularioModel {

    private String nombre;
    private String apellido;
    private String correo;
    private String mesnacimiento;
    private String dianacimiento;
    private String anonacimiento;
    private String idiomas;
    private String ciudad;
    private String postal;
    private String pasi;
    private String movil;
    private String modelo;
    private String sistema;
    private String computador;
    private String version;
    private String lenguaje;
    private String contrasena;
    private boolean terminos;
    private boolean privacidad;

    public UtestFomularioModel() {

        MetodoEspecial.confPropiedades();


        this.nombre = MetodoEspecial.propiedades.getProperty("nombre");
        this.apellido = MetodoEspecial.propiedades.getProperty("apellido");
        this.correo = MetodoEspecial.propiedades.getProperty("correo");
        this.mesnacimiento = MetodoEspecial.propiedades.getProperty("mesnacimiento");
        this.dianacimiento = MetodoEspecial.propiedades.getProperty("dianacimiento");
        this.anonacimiento = MetodoEspecial.propiedades.getProperty("anonacimiento");
        this.idiomas = MetodoEspecial.propiedades.getProperty("idiomas");
        this.ciudad = MetodoEspecial.propiedades.getProperty("ciudad");
        this.postal = MetodoEspecial.propiedades.getProperty("postal");
        this.pasi = MetodoEspecial.propiedades.getProperty("pasi");
        this.movil = MetodoEspecial.propiedades.getProperty("movil");
        this.modelo = MetodoEspecial.propiedades.getProperty("modelo");
        this.sistema = MetodoEspecial.propiedades.getProperty("sistema");
        this.computador = MetodoEspecial.propiedades.getProperty("computador");
        this.version = MetodoEspecial.propiedades.getProperty("version");
        this.lenguaje = MetodoEspecial.propiedades.getProperty("lenguaje");
        this.contrasena = MetodoEspecial.propiedades.getProperty("contrasena");
        this.terminos = Boolean.parseBoolean(MetodoEspecial.propiedades.getProperty("terminos"));
        this.privacidad = Boolean.parseBoolean(MetodoEspecial.propiedades.getProperty("privacidad"));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMesnacimiento() {
        return mesnacimiento;
    }

    public void setMesnacimiento(String mesnacimiento) {
        this.mesnacimiento = mesnacimiento;
    }

    public String getDianacimiento() {
        return dianacimiento;
    }

    public void setDianacimiento(String dianacimiento) {
        this.dianacimiento = dianacimiento;
    }

    public String getAnonacimiento() {
        return anonacimiento;
    }

    public void setAnonacimiento(String anonacimiento) {
        this.anonacimiento = anonacimiento;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getPasi() {
        return pasi;
    }

    public void setPasi(String pasi) {
        this.pasi = pasi;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getComputador() {
        return computador;
    }

    public void setComputador(String computador) {
        this.computador = computador;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isTerminos() {
        return terminos;
    }

    public void setTerminos(boolean terminos) {
        this.terminos = terminos;
    }

    public boolean isPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(boolean privacidad) {
        this.privacidad = privacidad;
    }
}
