package br.com.unialfa.obras.material.domain;

import br.com.unialfa.obras.obrasCliente.domain.Obras;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ItemPedidoId implements Serializable {

    @ManyToOne
    @JoinColumn(name="pedidoMaterial_id")
    private PedidoMaterial pedidoMaterial;

    @OneToMany
    @JoinColumn(name= "obras_id")
    private Obras obras;

    public ItemPedidoId() {
    }

    public PedidoMaterial getPedidoMaterial() {
        return pedidoMaterial;
    }

    public void setPedidoMaterial(PedidoMaterial pedidoMaterial) {
        this.pedidoMaterial = pedidoMaterial;
    }

    public Obras getObras() {
        return obras;
    }

    public void setObras(Obras obras) {
        this.obras = obras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoId that = (ItemPedidoId) o;
        return Objects.equals(pedidoMaterial, that.pedidoMaterial) && Objects.equals(obras, that.obras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoMaterial, obras);
    }
}
