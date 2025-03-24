package com.central.pedidos.kafka;


import com.central.pedidos.model.Pedido;
import com.central.pedidos.model.StatusPedido;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaStatusProducer {


    private KafkaTemplate<String, Pedido> kafkaTemplate;
    private final String topic  = "status-pedidos";


    public KafkaStatusProducer(KafkaTemplate<String, Pedido> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void atualizarPedido(Pedido pedido){
        kafkaTemplate.send(topic, pedido);
        System.out.println("Pedido atualizado com sucesso!" + pedido);
    }

}
