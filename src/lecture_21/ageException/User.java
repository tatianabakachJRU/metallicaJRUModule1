package lecture_21.ageException;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){
            //System.out.println("Возраст должен быть в диапозоне от 0 до 150 лет");
            throw new AgeInvalidException("Возраст должен быть в диапозоне от 0 до 150 лет");
        }
        this.age = age;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
