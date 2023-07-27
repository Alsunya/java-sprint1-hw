/**
 * В этом классе осуществляется преобразование шагов в километры и килокалории.
 */
public class Converter {
    int convertToKm(int steps){
        int stepToCentimeters = 75;
        int kilometerToCentimeters = 100000;
        return (steps * stepToCentimeters / kilometerToCentimeters);
    }
    int convertStepsToKilocalories(int steps){
        int stepToCalories = 50;
        int kilocalorieToCalories = 1000;
        return steps * stepToCalories / kilocalorieToCalories;
    }
}
