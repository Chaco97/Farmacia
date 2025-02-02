package Farmacia.Backend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="detalle_compra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_detalleC;
    int cantidad;
    double precio_unitario;
    double subtotal;

    @ManyToOne
    @JoinColumn(name = "id_compra", nullable = false)  // Relación muchos a uno con Compra
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_medicamento", nullable = false)  // Relación muchos a uno con Producto
    private Medicamento medicamento;

    public DetalleCompra(int id_detalleC, int cantidad, double precio_unitario, double subtotal, Compra compra, Medicamento medicamento) {
        this.id_detalleC = id_detalleC;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.subtotal = subtotal;
        this.compra = compra;
        this.medicamento = medicamento;
    }

    public DetalleCompra(){

    }

    public int getId_detalleC() {
        return id_detalleC;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Compra getCompra() {
        return compra;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setId_detalleC(int id_detalleC) {
        this.id_detalleC = id_detalleC;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
