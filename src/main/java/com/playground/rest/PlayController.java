package com.playground.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayController {

    @GetMapping("/game")
    public String getGame() {
        return "Football";
    }
}
