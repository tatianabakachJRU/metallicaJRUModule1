package lecture_12.cow;

import java.util.Objects;

public class Cow {
    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) { //this.equals(o)
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Cow cow = (Cow) o;
        return age == cow.age && name.equals(cow.name);
    }
    //o.equals(o) = true
    // если x.equals(y) = true, то и y.equals(x) = true
    // если x.equals(y) = true и y.equals(z) = true, то и x.equals(z) = true
    // o.equals(null) = false

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String printCow(){
        return "Name: " + name + " Age: " + age;
    }
}
