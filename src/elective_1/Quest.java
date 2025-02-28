package elective_1;

import java.util.Random;
import java.util.Scanner;

public class Quest {
    private static final String[] ROOMS = {
            "Начальная комната", // 0
            "Темная комната", // 1
            "Секретная комната", // 2
            "Кладовая", // 3
            "Магическая комната", // 4
    };

    private static final String[][] MONSTERS = {
            {"Гоблин", "50"},
            {"Скелет", "30"},
            {null, "0"},
            {"Цербер", "20"},
            {"Зомби", "40"},
    };

    private static final String[] ITEMS = {
            "Зелье здоровья",
            null,
            "Меч",
            null,
            "Заклинание"
    };

    private static final String[] INVENTORY = new String[5];
    private static int inventoryCount = 0;
    private static int currentRoomIndex = 0;
    private static int playerHealth = 100;
    private static int playerAttackPower = 10;

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Квест!!!");
        while (true) {
            displayStatus();
            displayCurrentRoom();
            handleAction(getAction());
        }
    }

    private static void displayStatus() {
        System.out.printf("Ваше здоровье: %d/%d%n", playerHealth, 100);
        System.out.print("Ваш инвентарь: ");
        if (inventoryCount == 0) {
            System.out.println("Ваш инвентарь пуст!");
        }
        for (int i = 0; i < inventoryCount; i++) {
            System.out.print(INVENTORY[i] + (i < inventoryCount - 1 ? "," : ""));
        }
        System.out.println();

    }

    private static void displayCurrentRoom() {
        System.out.printf("\nВы находитесь в: %s%n", ROOMS[currentRoomIndex]);
        if (MONSTERS[currentRoomIndex][0] != null) {
            System.out.printf("В этой комнате есть монстр: %s%n",
                    MONSTERS[currentRoomIndex][0]);
        }
        if (ITEMS[currentRoomIndex] != null) {
            System.out.printf("Вы видите какой-то предмет: %s%n", ITEMS[currentRoomIndex]);
        }
    }

    private static int getAction() {
        int action;
        while (true) {
            System.out.println("Ваши действия: " +
                    "1. Исследовать 2. Двигаться 3. Посмотреть инвентарь" +
                    " 4. Использовать предмет из инвентаря 5. Покинуть игру");
            String input = scanner.nextLine();
            if (isNumeric(input) && (action = Integer.parseInt(input)) >= 1 && action <= 5) {
                return action;
            }
            System.out.println("Некорректный ввод. Введите числа от 1 до 5");
        }
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    private static void handleAction(int action) {
        switch (action) {
            case 1 -> explore();
            case 2 -> move();
            case 3 -> showInventory();
            case 4 -> useItem();
            case 5 -> exitGame();
        }
    }

    private static void exitGame() {
        System.out.println("Спасибо за игру!");
        System.exit(0);
    }


    private static void explore() {
        if (MONSTERS[currentRoomIndex][0] != null) {
            battle();
        } else {
            System.out.println("В этой комнате нет монстров");
        }
        collectItem();
    }

    private static void collectItem() {
        if (ITEMS[currentRoomIndex] != null) {
            System.out.printf("Вы взяли %s%n", ITEMS[currentRoomIndex]);
            addItemToInventory(ITEMS[currentRoomIndex]);
            ITEMS[currentRoomIndex] = null;
        }
    }

    private static void addItemToInventory(String item) {
        if(inventoryCount < INVENTORY.length){
            INVENTORY[inventoryCount++] = item;
        } else {
            System.out.println("Ваш инвентарь полон!");
        }
    }

    // метод отвечает на бой с монстром
    // он содержит логику по уменьшению здоровья игрока и монстра в момент битвы
    private static void battle() {
        String monsterName = MONSTERS[currentRoomIndex][0];
        int monsterHealth = Integer.parseInt(MONSTERS[currentRoomIndex][1]);
        System.out.printf("Вы вступили в бой c %s%n", monsterName);

        while (monsterHealth > 0 && playerHealth > 0) {
            monsterHealth -= attack("Вы атаковали " + monsterName, playerAttackPower);
            if (monsterHealth <= 0) {
                System.out.printf("Вы победили %s%n!", monsterName);
                MONSTERS[currentRoomIndex][0] = null;
                return;
            }
            int damage = attack(monsterName + " атакует вас", 5);
            playerHealth -= damage;
            System.out.printf("Вы потеряли %d здоровья%n", damage);
            displayStatus();
        }
    }

    private static int attack(String action, int maxDamage) {
        int damage = random.nextInt(maxDamage) + 1;
        System.out.printf("%s наносите %d урона. %n", action, damage);
        return damage;
    }

    private static void move() {
        int newIndex;
        while (true) {
            System.out.printf("Куда хотите пойти? (0 - %d)", ROOMS.length - 1);
            String input = scanner.nextLine();
            if (isNumeric(input) && (newIndex = Integer.parseInt(input))
                    >= 0 && newIndex <= ROOMS.length) {
                currentRoomIndex = newIndex;
                return;
            }
            System.out.printf("Некорректный ввод комнаты. " +
                    "Пожалуйста введите числа от 0 до %d%n", ROOMS.length - 1);
        }
    }

    private static void showInventory() {
        System.out.print("Ваш инвентарь: ");
        if (inventoryCount == 0) {
            System.out.println("Ваш инвентарь пуст!");
        }
        for (int i = 0; i < inventoryCount; i++) {
            System.out.print(INVENTORY[i] + (i < inventoryCount - 1 ? "," : ""));
            System.out.println();
        }
    }


    private static void useItem() {
        if (inventoryCount == 0) {
            System.out.println("Ваш инвентарь пуст, предмет использовать нельзя");
            return;
        }

        int itemIndex;
        while (true) {
            System.out.printf("Какой предмет вы хотите использовать? (0 - %d%n)", inventoryCount - 1);
            String input = scanner.nextLine();
            if (isNumeric(input) && (itemIndex = Integer.parseInt(input)) >= 0 && itemIndex < inventoryCount) {
                String item = INVENTORY[itemIndex];
                if (item.equals("Зелье здоровья")) {
                    healthPlayer(20);
                } else if (item.equals("Меч")) {
                    attackMonster(itemIndex);
                    System.out.printf("Вы использовали %s%n", item);
                } else if (item.equals("Заклинание")) {
                    castSpell(itemIndex);
                    System.out.printf("Вы использовали %s%n", item);
                }
                INVENTORY[itemIndex] = INVENTORY[--inventoryCount];
                INVENTORY[inventoryCount] = null;
                return;
            }
        }
    }

    private static void castSpell(int itemIndex) {
        String monsterName = MONSTERS[currentRoomIndex][0];
        if (monsterName != null) {
            int damage = random.nextInt(20) + 10;
            System.out.printf("Вы наносите урон %d монстру с помощью заклинания!%n", damage);
            MONSTERS[currentRoomIndex][1] = String.valueOf(
                    Integer.parseInt(MONSTERS[currentRoomIndex][1]) - damage);
            if (Integer.parseInt(MONSTERS[currentRoomIndex][1]) <= 0) {
                System.out.printf("Вы победили %s%n", monsterName);
                MONSTERS[currentRoomIndex][0] = null;
            }
        } else {
            System.out.println("Вы этой комнате нет монстров");
        }
    }

    private static void attackMonster(int itemIndex) {
        String monsterName = MONSTERS[currentRoomIndex][0];
        if (monsterName != null) {
            int damage = random.nextInt(15) + 5;
            System.out.printf("Вы наносите урон %d монстру с помощью меча!%n", damage);
            MONSTERS[currentRoomIndex][1] = String.valueOf(
                    Integer.parseInt(MONSTERS[currentRoomIndex][1]) - damage);
            if (Integer.parseInt(MONSTERS[currentRoomIndex][1]) <= 0) {
                System.out.printf("Вы победили %s%n", monsterName);
                MONSTERS[currentRoomIndex][0] = null;
            }
        } else {
            System.out.println("Вы этой комнате нет монстров");
        }
    }

    private static void healthPlayer(int amount) {
        playerHealth += amount;
        if (playerHealth > 100) {
            playerHealth = 100;
        }
        System.out.printf("Ваше здоровье восстановлено до %d/%d%n", playerHealth, 100);
    }
}
