package lopes.willian.demo.controller;

import lopes.willian.demo.Repository.ClientRepository;
import lopes.willian.demo.model.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author: Willian Lopes da Silva
 * since: 06/05/2020 11:40
 * version:1.0
 */
@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll() {
        return new ResponseEntity<List<ClientEntity>>(
                (List<ClientEntity>) this.clientRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> update(@PathVariable("id")long id,
                                               @RequestBody ClientEntity clientEntity) throws Exception {
        if (id == 0 || !this.clientRepository.existsById(id)) {
            throw new Exception("Código não encontrado ou inexistente!");
        }

        return new ResponseEntity<ClientEntity>(
                this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<ClientEntity> store(@RequestBody ClientEntity clientEntity) {
        return new ResponseEntity<ClientEntity>(
        this.clientRepository.save(clientEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);
    }
}
