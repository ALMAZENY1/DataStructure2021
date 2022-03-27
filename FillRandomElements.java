package Week3;

import java.util.Random;

public class FillRandomElements {
    static int [] a = new int[7];

    static public void Random()
    {
        Random r = new Random();
        for (int i = 0; i <a.length ; i++) {
            a[i]=r.nextInt(10);
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Random();
    }
}
