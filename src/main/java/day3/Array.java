package day3;

public class Array {
    public static void main(String[] args) {
        int[] flowers = {1,2,3,4,5,};
        for (int i = 0;i<=4;i++)
        {
            System.out.println(flowers[i]);
        }
        System.out.println();
        int j = 0;
        do {
            System.out.println(flowers[j]);
            j++;
        }
        while(j<=flowers.length);
        System.out.println();

        int k = 0;
        while(k<flowers.length);
        {
            System.out.println();
        }
    }

}


