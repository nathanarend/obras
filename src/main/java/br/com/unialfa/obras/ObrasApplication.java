package br.com.unialfa.obras;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.cliente.repository.clienteRepository;
import br.com.unialfa.obras.material.domain.ItensPedido;
import br.com.unialfa.obras.material.domain.PedidoMaterial;
import br.com.unialfa.obras.material.repository.ItensPedidoRepository;
import br.com.unialfa.obras.material.repository.MaterialRepository;
import br.com.unialfa.obras.obrasCliente.domain.Obras;
import br.com.unialfa.obras.obrasCliente.repository.ObrasRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ObrasApplication {

	@Autowired
	private clienteRepository clienteRepository;

	@Autowired
	private ObrasRepository obrasRepository;

	@Autowired
	private MaterialRepository materialRepository;

	@Autowired
	private ItensPedidoRepository itensPedidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ObrasApplication.class,args);

	}

	@Bean
	InitializingBean sendDatabase() {
		Cliente cliente = new Cliente();
		cliente.setNome("ClienteTest");
		cliente.setCpf("111.111.111-11");
		cliente.setDataNascimento(LocalDate.now());
		cliente.setVersao(1);
		cliente.setPrimeiroNome("Teste");
		clienteRepository.save(cliente);

		Obras obra = new Obras();
		obra.setCliente(cliente);
		obra.setDataCriacaoPedido(LocalDate.now());
		obra.setDataEstimadaConclusao(LocalDate.now());
		obra.setDataConclusao(LocalDate.now());
		obra.setTotalEstimado(BigDecimal.ZERO);
		obra.setTotal(BigDecimal.ZERO);

		obrasRepository.save(obra);

		List<PedidoMaterial> pedidos = new ArrayList<>();

		PedidoMaterial material = new PedidoMaterial();
		material.setDisponibilidade(true);
		material.setNome("Pedido #1");
		material.setDescricao("Pedido Teste");
		material.setPreco(BigDecimal.valueOf(10.00));
		pedidos.add(material);

		PedidoMaterial material2 = new PedidoMaterial();
		material2.setDisponibilidade(true);
		material2.setNome("Pedido #2");
		material2.setDescricao("Pedido Teste 2");
		material2.setPreco(BigDecimal.valueOf(30.00));
		pedidos.add(material2);

		materialRepository.saveAll(pedidos);

		return null;
	}



}