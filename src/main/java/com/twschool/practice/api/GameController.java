package com.twschool.practice.api;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.service.GameService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/game/guess_number")
    public Map<String, String> guess (@RequestBody Map<String, String> requestBody) {
        String number = requestBody.get("number");
        String result = gameService.guess(number);
        Map<String, String> responseBody = new HashMap<>();

//        Cookie cookie = new Cookie("sessionId", String.valueOf(new Date().getTime()));

        responseBody.put("input", requestBody.get("number"));
        responseBody.put("result", result);

        return responseBody;
    }
}
