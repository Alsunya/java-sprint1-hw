import java.util.Scanner;

/**
 * В классе реализована логика по сохранению и изменению количества шагов.
 * Также в нём выводиться статистика.
 */
public class StepTracker {
    Scanner scanner;
    Converter converter = new Converter();
    private MonthData[] monthToData = new MonthData[12];
    private int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Некорректный номер месяца. Введите число от 1 до 12.");
            return;
        }
        System.out.println("Введите номер дня (1-30):");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Некорректный номер дня. Введите число от 1 до 30.");
            return;
        }
        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        if (steps <= 0) {
            System.out.println("Некорректное количество шагов. Введите число больше нуля.");
            return;
        }
        int monthIndex = month - 1;
        int dayIndex = day - 1;
        monthToData[monthIndex].days[dayIndex] = steps;
        System.out.println("Данные сохранены успешно!");
    }
    void changeStepGoal(){
        System.out.println("Введите вашу цель шагов на день.");
        int scannedStepsGoal = scanner.nextInt();
        if (scannedStepsGoal > 0) {
            goalByStepsPerDay = scannedStepsGoal;
            System.out.println("Цель шагов на день: " + goalByStepsPerDay);
        }
        else{
            System.out.println("Вы ввели некорректное число шагов. Введите число больше нуля.");
        }
    }
    void printStatistic(){
        System.out.println("Введите число месяца");
        int monthNumber = scanner.nextInt();
        MonthData monthData = monthToData[monthNumber-1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Сумма пройденных шагов за месяц: " + sumSteps);
        System.out.println("Максимальное количество пройденных шагов в день в этом месяце: " + monthData.maxSteps());
        System.out.println("Cреднее количество пройденных шагов в день в этом месяце: " + sumSteps / monthData.days.length);
        System.out.println("Пройденная за месяц дистанция в км: " + converter.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий за месяц: " + converter.convertStepsToKilocalories(sumSteps));
        System.out.println("Лучшая серия месяца: " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println();
    }
}
