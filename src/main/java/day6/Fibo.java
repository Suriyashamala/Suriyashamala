package day6;

public class Fibo {
    public static void main(String[] args) {
        int n =13, t1 =0, t2 =1;
        System.out.println("Fibonocci series till"+n+"terms:");

        for (int i=1; i<=n; ++i) {
            System.out.println(t1+",");
            int sum = t1+t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

