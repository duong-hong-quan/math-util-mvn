/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.quandh.mathutil.core.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.quandh.mathutil.core.MathUtility;
/**
 *
 * @author PHAMKHANG
 */
public class MathUtilityAdvancedTest {
    // chuẩn bị data fill vào hàm
    // DDT
    // hàm trả về mảng 2 chiều, kiểu wrapper class
    // mảng chứa các cặp n -> expected, vd 0! -> 1
    public static Object[][] initTestData(){
        Object[][] testData = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {5, 120}};
        return testData;
        
    }
    
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgument1ReturnsWell(int n, long expected) {
        //tham số hoá việc đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERIZED
        assertEquals(expected , MathUtility.getFactorial(n));
    }
    
    
}
