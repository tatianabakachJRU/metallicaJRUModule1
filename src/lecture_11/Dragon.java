package lecture_11;

public class Dragon {
    private String name;
    private int age;

    public Dragon() {
    }

    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fly(){
        System.out.println("Dragon " + name + " flies!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
