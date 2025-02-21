package lecture_8;

import lecture_8.mathcat.MathCat;

public class MethodExample_5 {
    public static void main(String[] args)
    {

        int a = 4;
        int result = add(0, 2);
        System.out.println(result);
        System.out.println(add(3, 4));
        String string = concatStrings("Metallica");
        System.out.println(string);
        if(a == 3){
            return;
        }
        System.out.println(concatStrings("Hello"));

        MathCat mathCat = new MathCat();
        mathCat.result(1,2);

    }

    public static int add(int a, int b)
    {
        return a + b;
        //System.out.println("Hello"); // не будет выполнено
    }

    public static String concatStrings(String text){
        // какая-то логика

        return text + "!!!!!";
    }

    public static int[] printArray (int[] array){
        array[0] = 3;
        return array;
    }

    int a = 5;

}
