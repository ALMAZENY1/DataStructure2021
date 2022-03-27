import java.util.Scanner;

public  class RemoveElmentFromArray{
    static int [ ] a ={2,4,5,6,3,1};
    static Scanner in =new Scanner(System.in);
    static  int [] temp=new int[a.length-1];
    static public void print(){
        System.out.print("");
        for (int i = 0; i < a.length ; i++) {
            if (i==a.length-1);
            System.out.print(a[i]+"");
            else
            System.out.print(a[i]+"");
        }
    }
    static public void  PrintRemovedArray()
    {
        System.out.print("");
        for (int i = 0; i < temp.length ; i++) {
            if (i==temp.length-1)
                System.out.println(temp[i]+"");
            else
                System.out.println(temp[i]+"");
        }
    }
}