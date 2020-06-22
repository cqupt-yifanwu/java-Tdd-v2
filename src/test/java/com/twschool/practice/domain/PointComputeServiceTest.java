package com.twschool.practice.domain;

import com.twschool.practice.service.PointComputeService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PointComputeServiceTest {
    @Test
    void should_return_11_when_given_winCount_3() {
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
}
