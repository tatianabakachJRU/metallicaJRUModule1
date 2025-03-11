package lecture_13;

import static java.lang.Math.PI;

public class CatHouse
{
    private static String houseName = "CatParadise";
    private int number;

    public static class Cat
    {
       public static void printHello(){
           //int i = number + 1;
           String string = houseName + "";
           System.out.println("Welcome to " + houseName);
       }
        public void eat(){
            System.out.println("Cat is eating");
        }
    }

    public class Mouse
    {
        public void printHello(){
            int i = number + 1;
            System.out.println("Welcome to " + houseName);
        }

        public static class Tail{

        }
    }

}
