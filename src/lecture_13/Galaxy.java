package lecture_13;

public class Galaxy {
    static String galaxyName = "Milky Way";

    static {
        System.out.println("Статический блок Galaxy. Галактика " + galaxyName + " загружена");
    }

    int starCount = 1_000_000_000;

    {
        System.out.printf("Нестатический блок Galaxy. В Галактике %s %s звезд%n",
                galaxyName, starCount);

    }

    public Galaxy() {
        System.out.println("Конструктор Galaxy. Галактика создана");
    }

    static class Planet{
        static String planetName = "Mars";

        static {
            System.out.println("Статический блок Planet. Планета " + planetName
                    + " в галактике " + galaxyName);
        }

        int planetSize = 12_743;

        {
            System.out.printf("Нестатический блок планеты %s. Размер планеты %s%n",
                    planetName, planetSize);
        }

        public Planet() {
            System.out.printf("Конструктор планеты %s. Планета создана%n", planetName);
        }
    }
}
