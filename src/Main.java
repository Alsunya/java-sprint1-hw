import java.util.Scanner;
/**
 * Вся работа с пользовательским вводом и выводом меню производится в этом классе.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int menuItem = scanner.nextInt();
            if (menuItem == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (menuItem == 2) {
                stepTracker.changeStepGoal();
            } else if (menuItem == 3) {
                stepTracker.printStatistic();
            } else if (menuItem == 0) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu(){
        System.out.println("Что Вы хотите сделать? Введите команду.\n" +
                "1 - Ввести количество шагов за определённый день;\n" +
                "2 - Изменить цель по количеству шагов в день;\n" +
                "3 - Напечатать статистику за определённый месяц;\n" +
                "0 - Выйти из приложения.");
    }
}
