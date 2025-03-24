package com.central.pedidos.kafka;


import com.central.pedidos.model.Pedido;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaStatusConsumer {


    @KafkaListener(topics = "status-pedidos", groupId = "status-group")
    public void consumirStatus(Pedido pedido) {
        System.out.println("🔄 Status recebido: " + pedido);
    }
}
