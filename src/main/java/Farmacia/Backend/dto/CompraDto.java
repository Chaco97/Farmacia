package Farmacia.Backend.dto;

import Farmacia.Backend.Entity.DetalleCompra;
import Farmacia.Backend.Entity.Proveedor;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class CompraDto {

    int id_compra;
    Date fecha_compra;
    int total;
    private Proveedor proveedor;
    private List<DetalleCompra> detallesCompra;

    public CompraDto(int id_compra, Date fecha_compra, int total, Proveedor proveedor, List<DetalleCompra> detallesCompra) {
        this.id_compra = id_compra;
        this.fecha_compra = fecha_compra;
        this.total = total;
        this.proveedor = proveedor;
        this.detallesCompra = detallesCompra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public int getTotal() {
        return total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public List<DetalleCompra> getDetallesCompra() {
        return detallesCompra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setDetallesCompra(List<DetalleCompra> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }
}
