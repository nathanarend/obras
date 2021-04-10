package br.com.unialfa.obras.obrasCliente.domain;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.fornecedor.domain.Fornecedor;
import br.com.unialfa.obras.material.domain.ItensPedido;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Obras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate dataCriacaoPedido;
    private LocalDate dataUltimaAtualizacao;
    private LocalDate dataEstimadaConclusao;
    private LocalDate dataConclusao;

    @Column(nullable = false)
    private BigDecimal totalEstimado;
    private BigDecimal total;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Fornecedor> fornecedores;

    public Obras() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDataCriacaoPedido() {
        return dataCriacaoPedido;
    }

    public void setDataCriacaoPedido(LocalDate dataCriacaoPedido) {
        this.dataCriacaoPedido = dataCriacaoPedido;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public LocalDate getDataEstimadaConclusao() {
        return dataEstimadaConclusao;
    }

    public void setDataEstimadaConclusao(LocalDate dataEstimadaConclusao) {
        this.dataEstimadaConclusao = dataEstimadaConclusao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public BigDecimal getTotalEstimado() {
        return totalEstimado;
    }

    public void setTotalEstimado(BigDecimal totalEstimado) {
        this.totalEstimado = totalEstimado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(List<Fornecedor> fornecedores) {
        this.fornecedores = fornecedores;
    }


}
