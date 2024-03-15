package com.yangRR.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MavenTest {

    @Test
    @DisplayName("对的")
    public void testAssert(){
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a+b,30);
    }
}
