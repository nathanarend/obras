package br.com.unialfa.obras.material.repository;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.material.domain.PedidoMaterial;
import org.springframework.data.repository.CrudRepository;

public interface MaterialRepository extends CrudRepository<PedidoMaterial, Long> {

    public Iterable<PedidoMaterial> findByCliente(Cliente cliente);
}
