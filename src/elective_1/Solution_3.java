package elective_1;

/*
Двоичный конвертер
*/

public class Solution_3 {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binaryNum = "";
        if (decimalNumber <= 0) {
            return binaryNum;
        }
        while (decimalNumber != 0) { //13 6 3 1
            binaryNum = decimalNumber % 2 + binaryNum; //"1101"
            decimalNumber = decimalNumber / 2; // decimalNumber = 0
        }
        //напишите тут ваш код
        return binaryNum;
    }

    public static int toDecimal(String binaryNumber) {
        int decimalNum = 0;
        if(binaryNumber == null){
            return decimalNum;
        }

        for (int i = 0; i < binaryNumber.length(); i++) { // 1101
            int index = binaryNumber.length() - 1 - i; //4 - 1 - 0 = 3
            int number = Character.getNumericValue(binaryNumber.charAt(index));
            decimalNum += (int) (number * Math.pow(2, i));
        }


        //напишите тут ваш код
        return decimalNum;
    }
}
