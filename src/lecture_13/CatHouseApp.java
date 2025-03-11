package lecture_13;

public class CatHouseApp {
    public static void main(String[] args) {
        CatHouse.Cat cat = new CatHouse.Cat();
        CatHouse.Cat.printHello();
        cat.eat();

        CatHouse catHouse = new CatHouse();
        CatHouse.Mouse mouse = catHouse.new Mouse();
    }
}
