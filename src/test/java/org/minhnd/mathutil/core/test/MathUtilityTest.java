/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.minhnd.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import static org.minhnd.mathutil.core.MathUtility.*;

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
   
    //test ngoại lệ thì sao?
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
        //assertThrows(expectedType, executable)
        //        ngoại lệ cần bắt  đoạn code gây ra ngoại lệ
        //                          đưa 1 object chứa đoạn code gây ra ngoại lệ               
        //                          lambda expression đưa vào
//        Executable ex = new Executable()
//          Executable ex = new Executable() {
//              @Override
//              public void execute() throws Throwable {
//                  getFactorial(-5);
//              }
//          };
//          Executable exLambda =() -> getFactorial(-5);
          assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
          
 
    }
    
    @Test
    public void TestFactorialGivenRightArgumentReturnWell(){
//        assertEquals(69, 69);
            assertEquals(1, getFactorial(0));
            assertEquals(1, getFactorial(1));
            assertEquals(2, getFactorial(2));
            assertEquals(6, getFactorial(3));
            assertEquals(24, getFactorial(4));
            assertEquals(120, getFactorial(5));

            
    }
    
}
