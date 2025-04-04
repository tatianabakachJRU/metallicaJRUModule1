package lecture_21.ageException;

public class UserAgeApp {
    public static void main(String[] args) {
        try{
            User tom = new User("Tom", 30);
            User kate = new User("Kate", 25);
            kate.setAge(-5);
        } catch (AgeInvalidException e){
            System.out.println("Oшибка: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
