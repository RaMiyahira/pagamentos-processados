package com.example.demo.infrastructure.adapter.in.messaging.dto;

import java.time.LocalDateTime;

public class EventoPagamentoDTO {

    private String idEvento;
    private String tipo;
    private LocalDateTime dataOcorrencia;
    private DadosPedidoDTO dados;

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public DadosPedidoDTO getDados() {
        return dados;
    }

    public void setDados(DadosPedidoDTO dados) {
        this.dados = dados;
    }
}