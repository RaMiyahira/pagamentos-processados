package com.example.demo.application.ports.in;

import java.math.BigDecimal;

public interface ProcessarPagamentoUseCase {

    void processar(String pedidoId, BigDecimal valorPago);

}