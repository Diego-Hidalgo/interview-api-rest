package com.icesi.edu.shop.controller;

import com.icesi.edu.shop.api.ShopAPI;
import com.icesi.edu.shop.dto.ClienteDTO;
import com.icesi.edu.shop.dto.DetalleDTO;
import com.icesi.edu.shop.dto.FacturaDTO;
import com.icesi.edu.shop.dto.ProductoDTO;
import com.icesi.edu.shop.mapper.ShopMapper;
import com.icesi.edu.shop.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ShopController implements ShopAPI {

    private final ShopService service;
    private final ShopMapper mapper;

    @Override
    public DetalleDTO getDetalle(int idDetalle, int idFactura) {
        return mapper.fromDetalle(service.getDetalle(idDetalle, idFactura));
    }

    @Override
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        return mapper.fromCliente(service.createCliente(mapper.fromClienteDTO(clienteDTO)));
    }

    @Override
    public ProductoDTO createProducto(ProductoDTO productoDTO) {
        return mapper.fromProducto(service.createProducto(mapper.fromProductoDTO(productoDTO)));
    }

    @Override
    public FacturaDTO createFactura(FacturaDTO facturaDTO) {
        return mapper.fromFactura(service.createFactura(mapper.fromFacturaDTO(facturaDTO)));
    }

    @Override
    public DetalleDTO createDetalle(DetalleDTO detalleDTO) {
        return mapper.fromDetalle(service.createDetalle(mapper.fromDetalleDTO(detalleDTO)));
    }

}
