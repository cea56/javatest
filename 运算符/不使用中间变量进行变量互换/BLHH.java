import java.util.Scanner;                           //导入scanner扫描器

public class BLHH {                                 //创建变量互换类，BLHH
    public static void main(String[] args) {        //创建主方法
        Scanner scan=new Scanner(System.in);        //创建scanner，从而获取键盘输入
        System.out.println("请输入变量A的值：");
        Long A=scan.nextLong();                     //创建Long类型变量A,同时接收来自系统输入的Long类型数值
        System.out.println("请输入变量B的值：");
        Long B=scan.nextLong();                     //创建Long类型变量B,同时接收来自系统输入的Long类型数值
        System.out.println("A="+A+",B="+B);         //输出AB的数值
        System.out.println("\t-变量互换-");
                                                    //使用位运算符中的互逆运算符进行数值交换，假如输入为：12，80
        A=A^B;                                      //A=92;B=80
        B=B^A;                                      //A=92;B=12
        A=A^B;                                      //A=80;B=92

        System.out.println("A="+A+",B="+B);
    }
}
