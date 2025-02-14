package lecture_6;

public class ArrayExample_1 {
    public static void main(String[] args) {
        int[] myArray = new int[10]; // 0-9
        myArray[0] = 10;
        System.out.println(myArray[0]);
        System.out.println(myArray[9]);
        System.out.println("*".repeat(20));

        int[] numbersArray = {1, 'b', 3};
        System.out.println(numbersArray[0]);
        System.out.println(numbersArray[1]);
        System.out.println(numbersArray[2]);
    }
}
