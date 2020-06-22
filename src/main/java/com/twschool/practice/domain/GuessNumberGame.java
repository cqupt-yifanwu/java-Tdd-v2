package com.twschool.practice.domain;

import com.twschool.practice.service.PointComputeService;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    public static final String CORRECT_RESULT = "4A0B";
    private final GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUED;
    private int leftTryTimes = MAX_TRY_TIMES;

    PointComputeService pointComputeService = new PointComputeService();

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.gameAnswer = answerGenerator.generateAnswer();
    }

    public String guess(String userAnswerString) {
        String result = gameAnswer.check(userAnswerString);
        decreaseTryTimes();
        modifyStatus(result);
        return result;
    }

    private void modifyStatus(String result) {
        if (CORRECT_RESULT.equals(result)) {
            gameStatus = GameStatus.SUCCEED;
            PointComputeService.addGameWinNumber();
            pointComputeService.addPoint();
        } else if (leftTryTimes == 0) {
            gameStatus = GameStatus.FAILED;
            PointComputeService.clearGameWinNumber();
            pointComputeService.subductionPoint();
        }
    }

    private void decreaseTryTimes() {
        leftTryTimes --;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}
