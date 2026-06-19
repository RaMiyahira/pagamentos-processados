package com.example.demo.infrastructure.adapter.out.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.application.ports.out.PedidoLogPort;
import com.example.demo.domain.model.Pedido;

@Component
public class PedidoLogAdapter implements PedidoLogPort {

    private static final Logger log =
            LoggerFactory.getLogger(PedidoLogAdapter.class);

    @Override
    public void registrar(Pedido pedido) {

        log.info(
            "Pedido {} processado. Valor original: R$ {} | Valor com Desconto: R$ {}",
            pedido.getPedidoId(),
            pedido.getValorOriginal(),
            pedido.getValorFinal()
        );
    }
}