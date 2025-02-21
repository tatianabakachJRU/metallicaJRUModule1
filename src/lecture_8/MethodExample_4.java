package lecture_8;

import lecture_8.mathcat.MathCat;

public class MethodExample_4 {
    public static void main(String[] args) {
        MathCat mathCat = new MathCat();
        mathCat.result(1, 2);
        mathCat.result(3.14, 2);
        mathCat.result(2, 2.25);
        mathCat.result(2.24, 2, 1);

    }
}
