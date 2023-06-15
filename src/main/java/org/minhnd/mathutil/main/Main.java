/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.minhnd.mathutil.main;

import org.minhnd.mathutil.core.MathUtility;

/**
 *
 * @author nghia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Test case #1: n = 0
        System.out.println("Check getF(0) 0! | expected: 1 | actual: " 
                + MathUtility.getFactorial(0));
        
        //Test case #2: n = 1
        System.out.println("Check getF(1) 1! | expected: 1 | actual: " 
                + MathUtility.getFactorial(1));
    
        //Test case #3: n = 2
        System.out.println("Check getF(2) 2! | expected: 2 | actual: " 
                + MathUtility.getFactorial(2));
    
        
        //Test case #4: n = 3
        System.out.println("Check getF(3) 3! | expected: 6 | actual: " 
                + MathUtility.getFactorial(3));
        
        //Test case #5: n = 5
        System.out.println("Check getF(5) 5! | expected: 120 | actual: " 
                + MathUtility.getFactorial(5));
        
        //âm giai thừa thì sao??
        //Test case #6: n = -1
        System.out.println("Check getF(-1) -1! | expected: Exception | actual: ");
        System.out.println("Check getF(-1) -1! | expected: Exception | actual: " 
                + MathUtility.getFactorial(-1)); // vì ngoại lệ nó sẽ ngắt ngang câu lệnh println
                                                 // in trc rồi chờ ngoại lệ
    }
    
    //THIẾT KẾ HÀM GIAI THỪA: ÂM GIAI THỪA VÀ > 20! THÌ KO TÍNH ĐC
    //hÀM SẼ NÉM RA NGOẠI LỆ
    //Test case 2: check if getF() with n = 1;
    //Step/Procedures: (các bước tiến hành test)
    //          1. Given n = 1 
    //          2. Excute getF(n = 1)
    //Expected value: (hàm hy vọng sẽ trả về mấy)
    //                  getF(1) 1! must return 1

    //ta đã có hàm tính giai thừa, ta phải test hàm
    //test thông qua các test case, những tình huống xài hàm
    //chuẩn bị bộ data và expected value
    // sau đó run các test case để coi đúng sai!!!
    
    //Test case 1: (tên, mục đích của test case) check if getF() with n = 0;
    //Step/Procedures: (các bước tiến hành test)
    //          1. Given n = 0 
    //          2. Excute getF(n = 0)
    //Expected value: (hàm hy vọng sẽ trả về mấy)
    //                  getF(0) 0! must return 1
    

    //TDD: Test Driven Development:viết code, làm app theo style
    //code và test song hành với nhau
    //code và test code là cặp bài trùng, code liên tục đc test
    //dù mới viết sơ sơ
    //phải nghĩ ngyay luôn bộ các test case khi bắt đầu viết code
    //ĐẶC TRƯNG CỦA TDD: XANH XANH ĐỎ ĐỎ
}
