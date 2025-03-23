package com.central.pedidos.kafka;

import com.central.pedidos.model.Pedido;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaPedidoConsumer {

    @KafkaListener(topics = "pedidos", groupId = "pedidos-group")
    public void consumir(Pedido pedido) {
        System.out.println("📦 Pedido recebido: " + pedido);
    }

}
