package lecture_6;

public class ArrayExample_9 {
    public static void main(String[] args) {
        String[] strings = {"Hello", "Hi", "Petr", "Hello"};

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if(strings[i].equals(strings[j])){
                    System.out.println(strings[i] + " и " + strings[j] + " равны между собой");
                }
            }

        }
    }






}
