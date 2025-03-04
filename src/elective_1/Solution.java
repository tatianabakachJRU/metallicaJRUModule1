package elective_1;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        // тут текст, который нам надо поделить по определенному разделителю (delimiter)
        String packagePath = "java.util.stream";
        // в этот массив складываем этот разделенный текст,
        // а чтобы его разделить используем метод getTokens
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        // StringTokenizer - это класс Java, который используется для разбиения
        // строки(query) на подстроки на основе заданного разделителя(delimiter)
        // у нас query - это packagePath, а delimiter - это точка
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        // Тут создается массив строк result, размер которого составляет количество подстрок,
        // полученных с помощью метода countTokens()объекта stringTokenizer.
        String[] result = new String[stringTokenizer.countTokens()];
        // тут создается переменная счетчик для нашего цикла
        int i = 0;
        // это цикл, который будет выполняться пока есть что-нибудь в строке,
        // за это отвечает метод hasMoreTokens()
        while (stringTokenizer.hasMoreTokens()) {
            // тут получаем следующий токен(подстроку) с помощью метода nextToken()
            // и помещаем его в массив result по конкретному индексу i.
            // После добавления подстроки в массив счетчик i увеличивается на 1 (i++),
            // i++ - это постинкремент, т.е.сначала возвращает текущее значение i,
            // а затем на следующей операции увеличивает его на 1.(я про это объясняла)
            result[i++] = stringTokenizer.nextToken();
        }
        // возвращаем результат из метода
        return result;
    }
}