package br.com.unialfa.obras.material.service;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.material.domain.PedidoMaterial;
import br.com.unialfa.obras.material.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/material")
public class MaterialController {

    @Autowired
    private MaterialRepository pedidoRepostory;

    @GetMapping(path = "/{idCliente}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<PedidoMaterial> listarPedido(@PathVariable Long idCliente){
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        return pedidoRepostory.findByCliente(cliente);
    }

    @PostMapping(path = "/add")
    public void cadastrarPedido( @RequestBody PedidoMaterial pedido ){

        pedidoRepostory.save(pedido);
    }

    @PutMapping(path = "/edit")
    public void editarPdido( @RequestBody PedidoMaterial pedido ){

        pedidoRepostory.save(pedido);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarPedido(@PathVariable(name = "id") long id){

        pedidoRepostory.deleteById(id);
    }
}
