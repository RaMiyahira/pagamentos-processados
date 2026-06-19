package com.example.demo.infrastructure.adapter.in.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.application.ports.in.ProcessarPagamentoUseCase;
import com.example.demo.infrastructure.adapter.in.messaging.dto.EventoPagamentoDTO;

import io.awspring.cloud.sqs.annotation.SqsListener;

@Component
public class PagamentoListener {

    private static final Logger log =
            LoggerFactory.getLogger(PagamentoListener.class);

    private final ProcessarPagamentoUseCase processarPagamentoUseCase;

    public PagamentoListener(
            ProcessarPagamentoUseCase processarPagamentoUseCase) {

        this.processarPagamentoUseCase = processarPagamentoUseCase;
    }

    @SqsListener("${aws.sqs.queue}")
    public void receber(EventoPagamentoDTO evento) {

        log.info(
                "Pedido recebido. PedidoId: {} | Valor Pago: {}",
                evento.getDados().getPedidoId(),
                evento.getDados().getValorPago());

        processarPagamentoUseCase.processar(
                evento.getDados().getPedidoId(),
                evento.getDados().getValorPago());
    }
}