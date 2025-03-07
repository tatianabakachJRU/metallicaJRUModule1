package lecture_12.cat;

public class Cat
{
    private String name;
    private int age;

    public Cat() {
    }

    protected Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
