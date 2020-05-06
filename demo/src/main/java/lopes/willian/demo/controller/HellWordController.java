package lopes.willian.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: Willian Lopes da Silva
 * since: 06/05/2020 11:40
 * version:1.0
 */
@RestController
public class HellWordController {

    @GetMapping("/")
    public String index() {
        return "Seja Bem vindo ao sistema!";
    }

}
