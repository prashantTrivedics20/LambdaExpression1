import java.util.Scanner;

interface i2
{
    public void m1(int a,int b);
}
class test3
{
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        //i2 obj=(int a, int b)-> System.out.println(a+b);
        i2 obj=(a, b)-> System.out.println(a+b);// either you will write the data type or we can use this without using the
        // data type....
        obj.m1(5,6);
    }
}
