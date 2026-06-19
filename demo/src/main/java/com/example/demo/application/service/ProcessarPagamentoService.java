package com.example.demo.application.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.example.demo.application.ports.in.ProcessarPagamentoUseCase;
import com.example.demo.application.ports.out.PedidoLogPort;
import com.example.demo.domain.model.Pedido;

@Service
public class ProcessarPagamentoService implements ProcessarPagamentoUseCase {

    private final PedidoLogPort pedidoLogPort;

    public ProcessarPagamentoService(PedidoLogPort pedidoLogPort) {
        this.pedidoLogPort = pedidoLogPort;
    }

    @Override
    public void processar(String pedidoId, BigDecimal valorPago) {

        Pedido pedido = new Pedido(pedidoId, valorPago);

        pedido.aplicarDesconto();

        pedidoLogPort.registrar(pedido);
    }
}