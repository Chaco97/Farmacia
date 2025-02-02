package Farmacia.Backend.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_proveedor;
    String Nombre;
    int telefono;
    String Direccion;

    @OneToMany(mappedBy = "id_compra")
    private List<Compra> compras;


    public Proveedor(){

    }

    public Proveedor(int id_proveedor, String nombre, int telefono, String direccion, List<Compra> compras) {
        this.id_proveedor = id_proveedor;
        Nombre = nombre;
        this.telefono = telefono;
        Direccion = direccion;
        this.compras = compras;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
