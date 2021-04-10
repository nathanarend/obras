package br.com.unialfa.obras.fornecedor.repository;

import br.com.unialfa.obras.fornecedor.domain.Fornecedor;
import org.springframework.data.repository.CrudRepository;

public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}
