package br.com.unialfa.obras.fornecedor.domain;

import br.com.unialfa.obras.material.domain.PedidoMaterial;
import br.com.unialfa.obras.obrasCliente.domain.Obras;

import javax.persistence.*;
import java.util.List;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;

    @ManyToMany
    private List<PedidoMaterial> material;

}
