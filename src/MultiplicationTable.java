import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int t = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(t+"*"+i+"="+t*i);
        }
    }
}
