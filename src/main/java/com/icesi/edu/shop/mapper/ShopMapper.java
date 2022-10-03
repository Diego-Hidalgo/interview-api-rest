package com.icesi.edu.shop.mapper;

import com.icesi.edu.shop.dto.ClienteDTO;
import com.icesi.edu.shop.dto.DetalleDTO;
import com.icesi.edu.shop.dto.FacturaDTO;
import com.icesi.edu.shop.dto.ProductoDTO;
import com.icesi.edu.shop.model.Cliente;
import com.icesi.edu.shop.model.Detalle;
import com.icesi.edu.shop.model.Factura;
import com.icesi.edu.shop.model.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ShopMapper {

    Cliente fromClienteDTO(ClienteDTO clienteDTO);

    ClienteDTO fromCliente(Cliente cliente);

    Producto fromProductoDTO(ProductoDTO productoDTO);

    ProductoDTO fromProducto(Producto producto);

    Factura fromFacturaDTO(FacturaDTO facturaDTO);

    FacturaDTO fromFactura(Factura factura);

    Detalle fromDetalleDTO(DetalleDTO detalleDTO);

    DetalleDTO fromDetalle(Detalle detalle);

}
