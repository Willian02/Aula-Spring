package lopes.willian.demo.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * author: Willian Lopes da Silva
 * since: 06/05/2020 11:40
 * version:1.0
 */

//SpringBoot
@Component

//Lombok
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString

//JPA - Java persistence API
@Entity
@Table(name = "cliente")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "renda")
    private double income;
}
