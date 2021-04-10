package br.com.unialfa.obras.obrasCliente.repository;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.obrasCliente.domain.Obras;
import org.springframework.data.repository.CrudRepository;

public interface ObrasRepository extends CrudRepository<Obras, Long> {

    public Iterable<Obras> findByCliente(Cliente cliente);
}