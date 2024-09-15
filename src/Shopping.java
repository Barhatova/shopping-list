import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        System.out.println("Вас приветствует список покупок!");

        String[] shoppingList = new String[8];

        int productCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Очистить список");
            System.out.println("4. Завершить работу");

            int actionNumber = scanner.nextInt();

            if (actionNumber == 1) {

                if (productCount <= 7) {
                    String productName = scanner.next();
                    shoppingList[productCount] = productName;
                    productCount++;
                    System.out.println("Товар " + productName + " добавлен в список под номером " + productCount);
                } else {
                    System.out.println("Просьба отложить покупку до следующего раза.");
                }

            } else if (actionNumber == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println((i + 1) + ". " + shoppingList[i]);
                }
            }

            else if (actionNumber == 3) {
                for (int i = 0; i < productCount; i++) {
                    productCount = 0;
                    shoppingList[i] = null; }
                System.out.println("Список пуст.");
            }

            else if (actionNumber == 4) {
                break;

            } else {
                System.out.println("Неизвестная команда!");
            }
        }
    }
}

