package Farmacia.Backend.Entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name ="venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_Venta;
    Date fecha_venta;
    double total;

    @ManyToOne
    @JoinColumn(name = "cliente",nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detalles;


    public Venta(int id_Venta, Date fecha_venta, double total, Cliente cliente, List<DetalleVenta> detalles) {
        this.id_Venta = id_Venta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.cliente = cliente;
        this.detalles = detalles;
    }

    public Venta(){

    }

    public int getId_Venta() {
        return id_Venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
}
