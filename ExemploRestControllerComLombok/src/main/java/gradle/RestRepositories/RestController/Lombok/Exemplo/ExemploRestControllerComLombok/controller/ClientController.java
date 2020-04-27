package gradle.RestRepositories.RestController.Lombok.Exemplo.ExemploRestControllerComLombok.controller;

import gradle.RestRepositories.RestController.Lombok.Exemplo.ExemploRestControllerComLombok.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ClientController {

    @GetMapping("/cliente")
    public ArrayList<Client> getClient() {

        Client client = new Client();
        client.setName("Willian");
        client.setLastName("Lopes da Silva");
        client.setEmail("Willianlds.02@gmail.com");

        Client client1 = new Client();
        client1.setName("Thiago");
        client1.setLastName("Cury");
        client1.setEmail("thiago.cury@qi.edu.br");

        Client client2 = new Client();
        client2.setName("Miguel");
        client2.setLastName("Alves da Silva Junior");
        client2.setEmail("Jr20miguelalves@hotmail.com");

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(client);
        clients.add(client1);
        clients.add(client2);

        return clients;
    }
}
