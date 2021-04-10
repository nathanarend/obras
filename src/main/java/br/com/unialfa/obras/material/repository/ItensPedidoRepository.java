package br.com.unialfa.obras.material.repository;

import br.com.unialfa.obras.material.domain.ItemPedidoId;
import br.com.unialfa.obras.material.domain.ItensPedido;
import org.springframework.data.repository.CrudRepository;

public interface ItensPedidoRepository extends CrudRepository<ItensPedido, ItemPedidoId> {
}
