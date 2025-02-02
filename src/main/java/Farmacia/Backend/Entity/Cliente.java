package Farmacia.Backend.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_Cliente;
    String Nombre;
    int Telefono;
    String Direccion;
    String Cedula;

    @OneToMany(mappedBy = "cliente")
    private List<Venta> ventas;


    public Cliente(int id_Cliente, String nombre, int telefono, String direccion, String cedula, List<Venta> ventas) {
        this.id_Cliente = id_Cliente;
        Nombre = nombre;
        Telefono = telefono;
        Direccion = direccion;
        Cedula = cedula;
        this.ventas = ventas;
    }

    public Cliente(){

    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCedula() {
        return Cedula;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
