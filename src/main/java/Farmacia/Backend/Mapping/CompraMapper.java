package Farmacia.Backend.Mapping;

import Farmacia.Backend.Entity.Compra;
import Farmacia.Backend.dto.CompraDto;

public class CompraMapper {

    public static CompraDto MapToCompra (Compra compra){
        return new CompraDto(
                compra.getId_compra(),
                compra.getFecha_compra(),
                compra.getTotal(),
                compra.getProveedor(),
                compra.getDetallesCompra()
        );
    }

    public static Compra MaptoCompraDto(CompraDto compraDto){
        return new Compra(
                compraDto.getId_compra(),
                compraDto.getFecha_compra(),
                compraDto.getTotal(),
                compraDto.getProveedor(),
                compraDto.getDetallesCompra()
        );
    }

}
