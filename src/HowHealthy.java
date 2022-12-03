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

        String classificationOptions = """
                Using these categories:
                    1 -
                    2 -
                    3 -
                    4 -
                    5 -
                """;
        System.out.println(classificationOptions);
        System.out.print("How active are you? ");
        int classification = scanner.nextInt();
        user.setClassification(classification);

        // Displaying Data
        System.out.println("\n-------------------------");
        System.out.println(user.getName() + "'s information");
        System.out.println("Weight: " + user.getWeight() + " pounds");
        System.out.println("Height: " + user.getHeight() + " inches");
        System.out.println("Age: " + user.getAge() + " years");
        System.out.println("BMR + BMI");
        System.out.println("Activity level: " + user.getClassification());
    }
}
