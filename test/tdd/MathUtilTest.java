/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import util.MathUtil;

/**
 *
 * @author SurfaceVN.com
 */
public class MathUtilTest {
    //class này muốn chạy thì có hàm main() riêng, nhấn shift-F6 để chạy
    //mỗi hàm trong class này sẽ biến thành main() // nhiều main() trong 1 class
    //thì hàm cần phải có kí hiệu/chỉ đẫn/annotation @Test
    @Test
    public void testSccessfulCases(){
        //test các tình huống tham số đưa cho hàm cần test 1 cách tử tế
        //Assert.assertEquals(30, 40);
        assertEquals(1, MathUtil.computeFactorial(0));
        assertEquals(1, MathUtil.computeFactorial(1));
        assertEquals(2, MathUtil.computeFactorial(2));
        assertEquals(6, MathUtil.computeFactorial(3));
        assertEquals(24, MathUtil.computeFactorial(4));
        assertEquals(120, MathUtil.computeFactorial(5));
        
    }
   
    //main() khác
    @Test(expected = IllegalArgumentException.class)
    public void testFailfulCases(){
        //test các tình huống đầu vào cà chớn
        //ddieefu gif xayr ra neeus ng dùng muốn tính cF(-5)
        //Xin lỗi tính k đc, quăng ra 1 message chửi ng dùng, đưa số âm sao tính
        //ném ra 1 ngoại lệ/Exception bảo rằng: tham số/đầu vào vớ vẩn, cà chớn
        //và ngoại lệ là 1 tình hướng bất thường k như dự tính
        //và nó k ngoại lệ là 1 value để có thể so sánh đc
        //k thể dùng hàm asserEquals()
        MathUtil.computeFactorial(-5);
    }
    
    //hàm trả về màu đỏ do k ném về ngoại lệ như kì vọng
    //code mình còn sai trong tình huống số âm, số dương đã màu xanh rồi
    //-> hàm còn sai về logic, k sai cú pháp  , hàm cF();
    //nhưng cho dù viết kiểu cũ sout() bên main hay asserE() bên JUnit
    //thì code sai logic/màu đỏ vẫn k ngăn đc việc ta nhấn nút clean&build
    //tức là code k sai cú pháp, vẫn thoải mái ra đc .jar, .war
    //điều này k hay, k tốt
    //JUnit có thể kết hợp vs ng kiến để cấm ra file .jar, .war NẾU CODE CÒN MÀU ĐỎ
    //DISABLE NÚT BẤM CLEAN & BUILD NẾU MÀU ĐỎ VẪN CÒN TRNOG LÚC CHẠY
    //@TEST
    //HÃY NHỚ 2 CON SỐ: 1005 NETBEANS 8, 1204 NETBEAN 10 TRỬ LÊN
    
}
