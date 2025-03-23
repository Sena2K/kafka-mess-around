package com.central.pedidos.controller;


import com.central.pedidos.kafka.KafkaPedidoProducer;
import com.central.pedidos.model.Pedido;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final KafkaPedidoProducer producer;

    public PedidoController(KafkaPedidoProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String criarPedido(@RequestBody Pedido pedido){
        producer.enviarPedido(pedido);
        return "pedido enviado com sucesso";
    }
}
