package com.central.pedidos.kafka;


import com.central.pedidos.model.Pedido;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPedidoProducer {

    private KafkaTemplate<String, Pedido> kafkaTemplate;
    private final String topic  = "pedidos";

    public KafkaPedidoProducer(KafkaTemplate<String, Pedido> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarPedido(Pedido pedido){
        kafkaTemplate.send(topic, pedido);
        System.out.println("Pedido criado com sucesso!" + pedido);
    }

}
