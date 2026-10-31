/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdelivery.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comercios")
public class Comercio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String categoria;
    private String direccion;
    private String telefono;
    private String tiempoEntrega;
    private String costoEnvio;
    private String descuentoBanner;
    private Double calificacion;
    private String logoUrl;

    public Comercio() {}

    public Comercio(String nombre, String categoria, String direccion, String telefono, String tiempoEntrega, String costoEnvio, String descuentoBanner, Double calificacion, String logoUrl) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tiempoEntrega = tiempoEntrega;
        this.costoEnvio = costoEnvio;
        this.descuentoBanner = descuentoBanner;
        this.calificacion = calificacion;
        this.logoUrl = logoUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getTiempoEntrega() { return tiempoEntrega; }
    public void setTiempoEntrega(String tiempoEntrega) { this.tiempoEntrega = tiempoEntrega; }

    public String getCostoEnvio() { return costoEnvio; }
    public void setCostoEnvio(String costoEnvio) { this.costoEnvio = costoEnvio; }

    public String getDescuentoBanner() { return descuentoBanner; }
    public void setDescuentoBanner(String descuentoBanner) { this.descuentoBanner = descuentoBanner; }

    public Double getCalificacion() { return calificacion; }
    public void setCalificacion(Double calificacion) { this.calificacion = calificacion; }

    public String getLogoUrl() { return logoUrl; }
    public void setLogoUrl(String logoUrl) { this.logoUrl = logoUrl; }
}
