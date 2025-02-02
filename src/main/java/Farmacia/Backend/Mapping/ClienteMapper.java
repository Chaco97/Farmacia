package Farmacia.Backend.Mapping;

import Farmacia.Backend.Entity.Cliente;
import Farmacia.Backend.dto.ClienteDto;

import java.util.ArrayList;

public class ClienteMapper {

    public static ClienteDto MapToClienteDto(Cliente cliente){
        return new ClienteDto(
                cliente.getId_Cliente(),
                cliente.getNombre(),
                cliente.getTelefono(),
                cliente.getDireccion(),
                cliente.getCedula(),
                cliente.getVentas()

        );
    }

    public static Cliente MapToCliente(ClienteDto clienteDto) {
        return new Cliente(
                clienteDto.getId_cliente(),
                clienteDto.getNombre(),
                clienteDto.getTelefono(),
                clienteDto.getDireccion(),
                clienteDto.getCedula(),
                clienteDto.getVentas()

        );
    }


}



