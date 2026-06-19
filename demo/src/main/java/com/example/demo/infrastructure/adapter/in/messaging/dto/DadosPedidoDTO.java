package com.example.demo.infrastructure.adapter.in.messaging.dto;

import java.math.BigDecimal;

public class DadosPedidoDTO {

    private String pedidoId;
    private BigDecimal valorPago;

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }
}