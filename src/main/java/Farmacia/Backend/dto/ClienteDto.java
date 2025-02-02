package Farmacia.Backend.dto;

import Farmacia.Backend.Entity.Venta;

import java.util.List;

public class ClienteDto {

    int id_cliente;
    String Nombre;
    int Telefono;
    String Direccion;
    String Cedula;
    private List<Venta> ventas;

    public ClienteDto(int id_cliente, String nombre, int telefono, String direccion, String cedula, List<Venta> ventas) {
        this.id_cliente = id_cliente;
        Nombre = nombre;
        Telefono = telefono;
        Direccion = direccion;
        Cedula = cedula;
        this.ventas = ventas;
    }


    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public int getId_cliente() {
        return id_cliente;
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

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
}


