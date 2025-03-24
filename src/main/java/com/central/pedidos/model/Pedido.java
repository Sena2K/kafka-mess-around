package com.central.pedidos.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private String id;
    private String produto;
    private int quantidade;
    private StatusPedido status;

    @Override
    public String toString() {
        return "Pedido(id=" + id + ", produto=" + produto + ", quantidade=" + quantidade + ", status=" + status + ")";
    }
}
