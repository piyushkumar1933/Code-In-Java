//1. You are given a number following certain constraints.
//        2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
//        3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153
//        4. Take as input number "n", assume that the number will follow constraints.
//        5. Print it's inverse.
//
package Day1;
import utilities.Basic;
public class Invrse {
    public static int inverse(int digit){
        int res = 0;
        int ndigit = Basic.countDigit(digit);
        for(int i =1; i<=ndigit;i++){
            int d = digit%10;
            //System.out.println(d);
            res = res+i*(int)Math.pow(10,d-1);
            digit = digit/10;
            //System.out.println(res);

        }
    return res;
    }

    public static void main(String[] args) {
        int testcase1 = 28346751;
        int testcase2 = 12543;

        System.out.println(inverse(testcase1));
        System.out.println(inverse(testcase2));
    }
}