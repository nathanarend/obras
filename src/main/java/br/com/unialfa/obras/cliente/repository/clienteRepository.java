package br.com.unialfa.obras.cliente.repository;

import br.com.unialfa.obras.cliente.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface clienteRepository extends CrudRepository<Cliente, Long> {
}
