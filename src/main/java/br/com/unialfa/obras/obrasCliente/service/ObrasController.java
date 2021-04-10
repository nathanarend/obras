package br.com.unialfa.obras.obrasCliente.service;

import br.com.unialfa.obras.cliente.domain.Cliente;
import br.com.unialfa.obras.obrasCliente.domain.Obras;
import br.com.unialfa.obras.obrasCliente.repository.ObrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/obras")
public class ObrasController {

    @Autowired
    private ObrasRepository obrasRepository;

    @GetMapping(path = "/{idCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Obras> listarObras(@PathVariable Long idCliente) {
        Cliente cliente = new Cliente();
        cliente.setId(idCliente);
        return obrasRepository.findByCliente(cliente);
    }

    @PostMapping (path = "/add")
    public void cadastrarObras (@RequestBody Obras obras){
        obrasRepository.save(obras);
    }

    @PutMapping (path = "/edit")
    public void editarObras (@RequestBody Obras obras){
        obrasRepository.save(obras);
    }

    @DeleteMapping (value = "delete/{id}")
    public @ResponseBody void deletarObras(@PathVariable(name = "id") long id){
        obrasRepository.deleteById(id);
    }
}
