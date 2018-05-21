/**
 * Created by melon on 18-5-21.
 */
public class getBinaryValue {
    public static void main(String[] args) {
        int a = -10;
        int t;
        for(int i = 0 ; i < 32 ; i++) {
 /*
 *  0x80000000是数的十六进制表示，转成二进制表示为10000000000000000000000000000000
 *  运算的优先级，移位运算高于逻辑运算，>>>高于&
 *  位逻辑与运算 1&1 = 1 ，0&1 = 0
 *  >>>无符号右移，移出部分舍弃，左边位补0；
 *  数值用补码形式参与运算
 */
            t = (a & 0x80000000 >>>i) >>> (31-i);
            System.out.print(t);
        }
    }
}
