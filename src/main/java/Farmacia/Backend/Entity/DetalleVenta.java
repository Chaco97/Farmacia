package Farmacia.Backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_detalle;
    int Cantidad;
    double Precio_Unitario;
    double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)  // Foreign Key a Venta
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "id_medicamento", nullable = false)  // Foreign Key a Medicamento
    private Medicamento medicamento;

    public DetalleVenta(){

    }
    public DetalleVenta(int id_detalle, int cantidad, double precio_Unitario, double subtotal, Venta venta, Medicamento medicamento) {
        this.id_detalle = id_detalle;
        Cantidad = cantidad;
        Precio_Unitario = precio_Unitario;
        this.subtotal = subtotal;
        this.venta = venta;
        this.medicamento = medicamento;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Venta getVenta() {
        return venta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public void setPrecio_Unitario(double precio_Unitario) {
        Precio_Unitario = precio_Unitario;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
