/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import static util.MathUtil.computeFactorial;

/**
 *
 * @author SurfaceVN.com
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + computeFactorial(5));

        //khi ta viết code xong, ta/dev test xem hàm /class/app chạy có
        //đúng k, việc này gọi là UniTest, test mức hàm, mức class, mức đơn vị
        // test bằng cách đưa data vào hàm, class, chạy hàm xem kết quả trả về
        //(actual value) rồi ta so kết quả trả về có đúng như ta đã mong
        // đợi/ tính trc đó, mong đợi: expected value
        //nếu ko bằng, hàm sai rồi, hoặc ta mong đợi sai
        //trong main() ta sout() kết quả actual so sánh với mong đợi expected
        // việc này gọi là kiểm thử = mắt, tự dùng mắt so sánh và luận kq
        //expected: 1 , t hy vọng hàm m chạy ói về cho t con số 1
        // nếu khi chạy m k in ra 1 mà in ra 10 (vd), 10 đc gọi là actual
        System.out.println("1! = " + computeFactorial(1));

        //expected: 1 hy vọng hàm tính 01 sẽ ra 1, thực tế (actual) phải chạy đã
        System.out.println("0! = " + computeFactorial(0));

        //expected: 2
        System.out.println("2! = " + computeFactorial(2));

        //expected: 6
        System.out.println("3! = " + computeFactorial(3));

        //expected:  chửi cà chớn nếu đưa vào cà chớn
        System.out.println("-5! = " + computeFactorial(-5));
        
        //cách test bằng mắt có rủi ro nhỏ: tự so sánh data, luận, nhiều kq quá 
        //dễ bị lỗi
        //trong giang hồ ngta độ ra 1 kĩ thuật để test app/hàm chạy có đúng k
        //bằng cách; gọi hàm với data đưa vào, lấy kq actual tự so sánh luôn với
        //expected, nếu đúng, khớp, bằng, in ra màu xanh
        //              sai, lệch, k =. in ra màu đỏ
        //và quan trong hơn
        // nếu gọi hàm, gọi nhiều lần như doạn code trên thì
        //XANH: tất cả phải xanh
        //ĐỎ: 1 TRONG ĐÁM ĐÓ BỊ ĐỎ, COI NHƯ CẢ ĐÁM ĐỎ
        //màu xanh: khớp giữ expected và actual, do đó nếu có 1 cái k khớp
        //màu đỏ -> chứng minh 1 điều làm lúc đúng lúc sai -> ko tốt
        //để làm đc điều này ta cần 1 đồ chơi/thư việc phụ trợ
        //để nó tự so sánh dùm expected và actual, in ra màu
        //thư viện này là: JUnit, TestNG(java)
        //                 xUnit, NUnit, MSUnit (C#)
        //                 PHPUnit
        //                 CPPUnit
        //                  ...
        //.jar, .dll, ...
    }

}
