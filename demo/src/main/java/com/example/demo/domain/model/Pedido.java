package com.example.demo.domain.model;

import java.math.BigDecimal;

public class Pedido {

    private String pedidoId;
    private BigDecimal valorOriginal;
    private BigDecimal valorFinal;

    public Pedido(String pedidoId, BigDecimal valorOriginal) {
        this.pedidoId = pedidoId;
        this.valorOriginal = valorOriginal;
        this.valorFinal = valorOriginal;
    }

    public void aplicarDesconto() {
        if (valorOriginal.compareTo(new BigDecimal("1000.00")) > 0) {
            valorFinal = valorOriginal.multiply(new BigDecimal("0.90"));
        }
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public BigDecimal getValorOriginal() {
        return valorOriginal;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }
}
