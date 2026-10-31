/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartdelivery.model;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private Double precio;
    private Double precioAnterior;
    private String descuento;
    private String imagenUrl;

    @ManyToOne
    @JoinColumn(name = "comercio_id")
    private Comercio comercio;

    public Producto() {}

    public Producto(String nombre, Double precio, Double precioAnterior, String descuento, String imagenUrl, Comercio comercio) {
        this.nombre = nombre;
        this.precio = precio;
        this.precioAnterior = precioAnterior;
        this.descuento = descuento;
        this.imagenUrl = imagenUrl;
        this.comercio = comercio;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Double getPrecioAnterior() { return precioAnterior; }
    public void setPrecioAnterior(Double precioAnterior) { this.precioAnterior = precioAnterior; }

    public String getDescuento() { return descuento; }
    public void setDescuento(String descuento) { this.descuento = descuento; }

    public String getImagenUrl() { return imagenUrl; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }

    public Comercio getComercio() { return comercio; }
    public void setComercio(Comercio comercio) { this.comercio = comercio; }
}