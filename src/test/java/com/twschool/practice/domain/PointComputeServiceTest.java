package com.twschool.practice.domain;

import com.twschool.practice.service.PointComputeService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PointComputeServiceTest {
    @Test
    void should_return_12_when_win_3_count() {
        PointComputeService pointCompute = new PointComputeService();

        pointCompute.setGameCount(3);
        Assert.assertEquals(pointCompute.getPoint(), 12);
    }
}
