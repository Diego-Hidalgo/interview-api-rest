package com.icesi.edu.shop.api;

import com.icesi.edu.shop.dto.ClienteDTO;
import com.icesi.edu.shop.dto.DetalleDTO;
import com.icesi.edu.shop.dto.FacturaDTO;
import com.icesi.edu.shop.dto.ProductoDTO;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shop")
public interface ShopAPI {

    @GetMapping("/detalle/{id_detalle}/{id_factura}")
    DetalleDTO getDetalle(@PathVariable(name = "id_detalle") int idDetalle, @PathVariable(name="id_factura") int idFactura);

    @PostMapping("/cliente")
    ClienteDTO createCliente(@RequestBody ClienteDTO clienteDTO);

    @PostMapping("/producto")
    ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO);

    @PostMapping("/factura")
    FacturaDTO createFactura(@RequestBody FacturaDTO facturaDTO);

    @PostMapping("/detalle")
    DetalleDTO createDetalle(@RequestBody DetalleDTO detalleDTO);

}
