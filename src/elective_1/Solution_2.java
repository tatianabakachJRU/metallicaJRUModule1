package elective_1;

/* 
Вырезаем середину
*/

public class Solution_2 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k'},
            {'m', 'n', 'o', 'p', 'q', 'r', 'f'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if(i != 0 && i != chars.length - 1 && j != 0  && j != chars[i].length - 1){
                    chars[i][j] = '-';
                }
            }
        }

        //напишите тут ваш код

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
