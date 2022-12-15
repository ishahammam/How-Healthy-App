package app;

import java.util.Scanner;

public class HowHealthy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Health user = new Health();

        // Collecting Data
        System.out.print("Person's Name: ");
        String name = scanner.nextLine();

        System.out.print(name + ", are you male or female (M/F)? ");
        char sex = scanner.nextLine().charAt(0);

        System.out.print(name + "'s weight (pounds): ");
        double weight = scanner.nextDouble();

        System.out.print(name + "'s height (inches): ");
        double height = scanner.nextDouble();

        System.out.print(name + "'s age (years): ");
        int age = scanner.nextInt();

        String activityMultiplierOptions = """
                Using these categories:
                    1 - Sedentary (little or no exercise, desk job)
                    2 - Lightly active (light exercise/sports 1-3 days/wk)
                    3 - Moderately active (moderate exercise/sports 3-5 days/wk)
                    4 - Very active (hard exercise/sports 6-7 days/wk)
                    5 - Extra active (hard daily exercise/sports & physical job or 2X day training, i.e marathon, contest etc.
                """;
        System.out.println(activityMultiplierOptions);
        System.out.print("How active are you? ");
        int activityMultiplier = scanner.nextInt();

        // Displaying Data
        System.out.println("\n--------------------------------------------");
        System.out.println(name + "'s information");
        System.out.println("Weight: " + weight + " pounds");
        System.out.println("Height: " + height + " inches");
        System.out.println("Age: " + age + " years");

        if (sex == 'M' || sex == 'm') {
            System.out.println("These are for a male");
            System.out.println("BMR is " + user.maleBMR(weight, height, age));
            System.out.println("TDEE is " + user.maleTDEE(activityMultiplier));
        }

        if (sex == 'F' || sex == 'f') {
            System.out.println("These are for a female");
            System.out.println("BMR is " + user.femaleBMR(weight, height, age));
            System.out.println("TDEE is " + user.femaleTDEE(activityMultiplier));
        }

        System.out.println("BMI is " + user.calculateBMI(weight, height));
        System.out.println("Your BMI classifies you as " + user.getBMICategory());
        System.out.println("--------------------------------------------");
    }
}
