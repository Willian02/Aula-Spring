package gradle.RestRepositories.RestController.Exemplo.ExemploRestController.controller;

import gradle.RestRepositories.RestController.Exemplo.ExemploRestController.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * author: Willian Lopes da Silva
 * since:26/04/2002
 * version: 1.0
 */
@RestController
public class ClientsController {

    @GetMapping("/clientes")
    public ArrayList<Client> getClient(){
        Client client = new Client();
        client.setName("Willian");
        client.setLastName("Lopes da Silva");
        client.setEmail("Willianlds.02@gmail.com");

        Client client2 = new Client();
        client2.setName("Thiago");
        client2.setLastName("Cury");
        client2.setEmail("thiago.cury@qi.edu.br");

        Client client3 = new Client();
        client3.setName("Miguel");
        client3.setLastName("Alves da Silva Junior");
        client3.setEmail("Jr20miguelalves@hotmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client2);
        clients.add(client3);

        return clients;
    }
}
