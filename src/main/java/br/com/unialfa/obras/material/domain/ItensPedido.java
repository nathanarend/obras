package br.com.unialfa.obras.material.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


public class ItensPedido implements Serializable {

    @ManyToMany
    @EmbeddedId
    private ItemPedidoId id;

    @Column(nullable = false)
    private int quantidade;

    public ItensPedido() {
    }

    public ItemPedidoId getId() {
        return id;
    }

    public void setId(ItemPedidoId id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItensPedido that = (ItensPedido) o;
        return quantidade == that.quantidade && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, quantidade);
    }
}
