import java.util.Scanner;                           //导入scanner扫描器
public class PDJO {                                 //创建类：判断奇偶PDJO
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);        //创建scanner，从而获取键盘输入
        System.out.println("请输入一个整数");
        Long number=scan.nextLong();                //创建Long类型变量number，同时获取输入
        String check=(number%2==0)?"偶数":"奇数";     //创建String类变量check，同时使用三元运算符判断奇偶性
        System.out.println("这个数字是："+check);
    }
}
