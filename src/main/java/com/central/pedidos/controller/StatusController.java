package com.central.pedidos.controller;


import com.central.pedidos.kafka.KafkaPedidoProducer;
import com.central.pedidos.model.Pedido;
import com.central.pedidos.model.StatusPedido;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    private final KafkaPedidoProducer producer;

    public StatusController(KafkaPedidoProducer producer) {
        this.producer = producer;
    }

    @PostMapping("/{id}")
    public String atualizarStatus(@PathVariable String id, @RequestParam StatusPedido status){
        Pedido pedido = new Pedido();
        pedido.setId(id);
        pedido.setStatus(status);
        return "Status pedido " + id + "atualizado" + status;
    }

}
