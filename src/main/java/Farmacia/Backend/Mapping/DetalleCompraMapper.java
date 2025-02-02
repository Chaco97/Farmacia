package Farmacia.Backend.Mapping;

import Farmacia.Backend.Entity.DetalleCompra;
import Farmacia.Backend.Entity.DetalleVenta;
import Farmacia.Backend.dto.DetalleCompraDto;

public class DetalleCompraMapper {

    public static DetalleCompraDto MaptopDetalleCompra(DetalleCompra detalleCompra){
        return new DetalleCompraDto(
                detalleCompra.getId_detalleC(),
                detalleCompra.getCantidad(),
                detalleCompra.getPrecio_unitario(),
                detalleCompra.getSubtotal(),
                detalleCompra.getCompra(),
                detalleCompra.getMedicamento()

        );



    }

    public static DetalleCompra MaptoDetalleCompraDto(DetalleCompraDto detalleCompraDto){
        return new DetalleCompra(
          detalleCompraDto.getId_detalleC(),
          detalleCompraDto.getCantidad(),
          detalleCompraDto.getPrecio_unitario(),
          detalleCompraDto.getSubtotal(),
          detalleCompraDto.getCompra(),
          detalleCompraDto.getMedicamento()
        );
    }
}
