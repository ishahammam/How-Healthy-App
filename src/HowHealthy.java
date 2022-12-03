import java.util.Scanner;

public class HowHealthy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Health user = new Health();

        // Collecting Data
        System.out.print("Person's Name: ");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.print(user.getName() + ", are you male or female (M/F)? ");
        String sex = scanner.nextLine();
        user.setSex(sex);

        System.out.print(user.getName() + "'s weight (pounds): ");
        double weight = scanner.nextDouble();
        user.setWeight(weight);

        System.out.print(user.getName() + "'s height (inches): ");
        double height = scanner.nextDouble();
        user.setHeight(height);

        System.out.print(user.getName() + "'s age (years): ");
        int age = scanner.nextInt();
        user.setAge(age);

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
        user.setActivityMultiplier(activityMultiplier);

        // Displaying Data
        System.out.println("\n-------------------------");
        System.out.println(user.getName() + "'s information");
        System.out.println("Weight: " + user.getWeight() + " pounds");
        System.out.println("Height: " + user.getHeight() + " inches");
        System.out.println("Age: " + user.getAge() + " years");
        System.out.println("BMR: " + user.calculateFemaleBMR());
        System.out.println("Activity level: " + user.getActivityMultiplier());
    }
}
