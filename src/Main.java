//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        bmiIndex service = new bmiIndex();
        int weightInKg = 60;
        double heightInMeters = 1.68;
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}