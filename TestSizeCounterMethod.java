package Task5;

public class TestSizeCounterMethod {
    public static void main(String[] args) {
        SingleLinkedList<Integer> list =new SingleLinkedList<>();
        list.Add_Last(1);
        list.Add_Last(2);
        list.Add_Last(3);
        list.Add_Last(4);
        list.Add_Last(5);
        list.Add_Last(6);
        System.out.println("The Size is : "+list.Size_2());
    }
}
