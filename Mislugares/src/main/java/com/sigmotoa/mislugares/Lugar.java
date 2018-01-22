package com.sigmotoa.mislugares;

public class Lugar {

    public Lugar() {
        fecha=System.currentTimeMillis();
        posicion=new GeoPunto(0,0);
        tipo=TipoLugar.OTROS;
    }

    private String nombre,direccion,foto,url,comentario;
    private GeoPunto posicion;
    private int telefono;
    private long fecha;
    private float valoracion;
    private TipoLugar tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public GeoPunto getPosicion() {
        return posicion;
    }

    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", foto='" + foto + '\'' +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", posicion=" + posicion +
                ", telefono=" + telefono +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                ", tipo=" + tipo +
                '}';
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

    public Lugar(double longitud, double latitud, TipoLugar tipo,
                 String nombre, String direccion,
                 String url, String comentario,
                 int telefono, float valoracion) {

        fecha=System.currentTimeMillis();
        posicion =new GeoPunto(longitud,latitud);
        this.nombre = nombre;
        this.direccion = direccion;
        this.url = url;
        this.comentario = comentario;
        this.tipo=tipo;
        this.telefono = telefono;
        this.valoracion = valoracion;
    }
}
