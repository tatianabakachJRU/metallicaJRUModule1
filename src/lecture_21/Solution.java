package lecture_21;

import java.util.Arrays;

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public static void main(String[] args) {
        Solution[] list = getTwoSolutions();

        // Вот тут немного подредачила твой код и написала комменты к нему
        Arrays.stream(list)
                // flatMap используется для преобразования каждого объекта Solution в поток его внутреннего массива innerClasses
                .flatMap(solution -> Arrays.stream(solution.innerClasses))
                // После получения потока всех объектов InnerClass, мы итерируемся по каждому объекту
                .forEach(innerClass ->
                        // Для каждого объекта InnerClass выводим значение i (в данном случае всегда 1)
                        System.out.print(innerClass.getI() + " ")
                );
    }

    public static Solution[] getTwoSolutions() {
        Solution solution = new Solution();
        solution.innerClasses[0] = new InnerClass();
        solution.innerClasses[1] = new InnerClass();

        Solution solution2 = new Solution();
        solution2.innerClasses[0] = new InnerClass();
        solution2.innerClasses[1] = new InnerClass();
        System.out.println("======================");
        System.out.println((new InnerClass()).getI());
        System.out.println("======================");

        Solution[] result = new Solution[2];
        result[0] = solution;
        result[1] = solution2;
        // это не надо, тут ты получишь только ссылку
//        System.out.println(result.toString());
        return result;
    }

    public static class InnerClass {
        private int i = 1;

        public InnerClass() {
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}