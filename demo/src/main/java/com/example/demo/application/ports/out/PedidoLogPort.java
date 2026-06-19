package com.example.demo.application.ports.out;

import com.example.demo.domain.model.Pedido;

public interface PedidoLogPort {

    void registrar(Pedido pedido);

}