package lecture_9;

public class ConstantsExample_1 {
    public static void main(String[] args) {
        final String DEFAULT_LANGUAGE = "English";
        int radius = 2;

//        MAX_USERS = 200;
//        DEFAULT_LANGUAGE = "Italian";

        System.out.println(DEFAULT_LANGUAGE);

        radius = 3;

        double result = Constants.PI * radius * radius;
        System.out.println(result);
    }
}
