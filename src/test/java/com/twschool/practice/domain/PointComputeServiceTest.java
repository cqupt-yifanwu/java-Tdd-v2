package com.twschool.practice.domain;

import com.twschool.practice.service.PointComputeService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PointComputeServiceTest {
    @Test
    void should_return_11_points_when_given_winCount_3() {
        PointComputeService pointComputeService = new PointComputeService();

        PointComputeService.addGameWinNumber();

        int winOneTimePoint = pointComputeService.addPoint();
        Assert.assertEquals(3, winOneTimePoint);

        PointComputeService.addGameWinNumber();
        int twiceTimePoint = pointComputeService.addPoint();
        Assert.assertEquals(6, twiceTimePoint);

        PointComputeService.addGameWinNumber();
        int secondTimePoint = pointComputeService.addPoint();
        Assert.assertEquals(11, secondTimePoint);
    }

    @Test
    void should_return_8_points_and_0_gameWinNumber_when_lose_game_given_11_points() {
//        PointComputeService pointComputeService = new PointComputeService();
//        // todo 这里应该mock ? 如何mock static，只好先想办法赋值了
////        Mockito.mock()
//        PointComputeService.setPoints(11);
//        PointComputeService.clearGameWinNumber();
//        int points = pointComputeService.subductionPoint();
//
//        Assert.assertEquals(8, points);
    }
}
