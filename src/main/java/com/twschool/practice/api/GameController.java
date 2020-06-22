package com.twschool.practice.api;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GameController {
    @PostMapping("/game/guess_number")
    public void guess (@RequestBody Map<String, String> requestBody) {
        Map<String, String> responseBody = new HashMap<>();

        GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGenerator());

        String result = guessNumberGame.guess(requestBody.get("number"));

        responseBody.put("input", requestBody.get("number"));
        responseBody.put("result", result);
    }

}
