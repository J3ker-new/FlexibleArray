package FlexibleArray;

public class Main {
    public static void main(String[] args) {
        FlexibleArray arr = new FlexibleArray();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(12);
        arr.remove(1);
        System.out.println(arr.get(0)); // 1
        System.out.println(arr.get(1)); // 3
        System.out.println(arr.size()); // 4
    }
}