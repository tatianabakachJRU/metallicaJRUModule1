package lecture_19.switchs;

public class DirectionApp {
    public static void main(String[] args) {
        Direction direction = Direction.NORTH;
        switch (direction){
            case SOUTH -> System.out.println("Юг");
            case NORTH -> System.out.println("Север");
            case WEST -> System.out.println("Запад");
            case EAST -> System.out.println("Восток");
        }
    }
}
