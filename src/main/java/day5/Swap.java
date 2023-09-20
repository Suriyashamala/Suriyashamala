package day5;

public class Swap {
    public static void main(String[] args) {
        int pq = 200;
        int rs = 300;

        System.out.println("before swapping");
        System.out.println("value of a" +pq);
        System.out.println("value of b" +rs);
        int st = pq;
        pq = rs;
        rs = st;
        System.out.println("after swapping");
        System.out.println("value of a" +pq);
        System.out.println("value of b" +rs);

        System.out.println("");

        int p = 40;
        int q = 50;
        System.out.println("before swapping");
        System.out.println("value of a" +p);
        System.out.println("value of a" +q);


        p=p+q;
        q=p-q;
        p=p-q;

        System.out.println("after swapping");
        System.out.println("value of a" +p);
        System.out.println("value of a" +q);

    }
}

