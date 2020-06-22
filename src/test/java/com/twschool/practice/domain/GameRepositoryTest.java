package com.twschool.practice.domain;

import com.twschool.practice.repository.GameRepository;
import com.twschool.practice.service.GameService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GameRepositoryTest {
    @Test
    public void should_return_same_game_when_get_game_twice () {
        GameRepository gameRepository = new GameRepository();

        GuessNumberGame guessNumberGame = gameRepository.create();

        GuessNumberGame guessNumberGameSecond = gameRepository.find();

        Assert.assertEquals(guessNumberGame, guessNumberGameSecond);
    }
}
