package lecture_8;

import java.util.Arrays;

public class MethodExample_2 {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};  // {1, 2, 3} - 1 объект, но 2 ссылки на него
        int[] ints = number;

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(ints));

        number[0] = 100;

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(ints));

        ints[1] = 200;

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(ints));

    }
}
