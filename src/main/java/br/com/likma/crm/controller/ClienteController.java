package br.com.likma.crm.controller;

import br.com.likma.crm.model.Cliente;
import br.com.likma.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar () {
        return clienteRepository.findAll();

    }
        @PostMapping
        public Cliente adicionar(@RequestBody Cliente cliente) {
            return clienteRepository.save(cliente);

    }

}
