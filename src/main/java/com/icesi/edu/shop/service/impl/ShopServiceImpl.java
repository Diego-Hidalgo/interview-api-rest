package com.icesi.edu.shop.service.impl;

import com.icesi.edu.shop.model.*;
import com.icesi.edu.shop.repository.ClienteRepository;
import com.icesi.edu.shop.repository.DetalleRepository;
import com.icesi.edu.shop.repository.FacturaRespository;
import com.icesi.edu.shop.repository.ProductoRepository;
import com.icesi.edu.shop.service.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Primary
public class ShopServiceImpl implements ShopService {

    private final ClienteRepository clienteRepository;
    private final FacturaRespository facturaRespository;
    private final ProductoRepository productoRepository;
    private final DetalleRepository detalleRepository;

    @Override
    public Detalle getDetalle(int idDetalle, int idFactura) {
        Detalle det = detalleRepository.findById(new DetalleLlaveCompuesta(idDetalle, idFactura)).orElse(null);
        if(det != null) {
            if(det.getCantidad() >= 5 && det.getPrecio() >= 1000000)
                det.setPrecio(det.getPrecio() * 0.9);
        }
        return det;
    }

    @Override
    public Cliente createCliente(Cliente clienteDTO) {
        return clienteRepository.save(clienteDTO);
    }

    @Override
    public Producto createProducto(Producto productoDTO) {
        return productoRepository.save(productoDTO);
    }

    @Override
    public Factura createFactura(Factura facturaDTO) {
        return facturaRespository.save(facturaDTO);
    }

    @Override
    public Detalle createDetalle(Detalle detalleDTO) {
        return detalleRepository.save(detalleDTO);
    }

}
