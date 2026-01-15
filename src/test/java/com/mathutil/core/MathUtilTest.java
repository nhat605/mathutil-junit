/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mathutil.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n =0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        
        assertEquals(1,MathUtil.getFactorial(1));
        
    }
}
