package Farmacia.Backend.Entity;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_medicamento;
    String Medicamento;
    String Descripcion;
    double Precio;
    int Stock;
    String fecha_expiracion;

    @ManyToOne
    @JoinColumn(name = "id_proveedor", nullable = false) // Foreign Key en la tabla Medicamento
    private Proveedor proveedor;

    public Medicamento(){

    }

    public Medicamento(int id_medicamento, String medicamento, String descripcion, double precio, int stock, String fecha_expiracion, Proveedor proveedor) {
        this.id_medicamento = id_medicamento;
        Medicamento = medicamento;
        Descripcion = descripcion;
        Precio = precio;
        Stock = stock;
        this.fecha_expiracion = fecha_expiracion;
        this.proveedor = proveedor;
    }

    public int getId_medicamento() {
        return id_medicamento;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getStock() {
        return Stock;
    }

    public String getFecha_expiracion() {
        return fecha_expiracion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    public void setMedicamento(String medicamento) {
        Medicamento = medicamento;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public void setFecha_expiracion(String fecha_expiracion) {
        this.fecha_expiracion = fecha_expiracion;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}
