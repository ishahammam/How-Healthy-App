public class Health {
    private String name;
    private double weight;
    private double height;
    private int age;
    private String sex;
    private double BMI;
    private double maleBMR;
    private double femaleBMR;
    private int activityMultiplier;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getActivityMultiplier() {
        return activityMultiplier;
    }

    public void setActivityMultiplier(int activityMultiplier) {
        this.activityMultiplier = activityMultiplier;
    }

    /* -------------------- Unit Conversion -------------------- */
    public double poundToKG(double value) {
        return value * 0.453592;
    }

    public double inchToCM(double value) {
        return value * 2.54;
    }

    /* -------------------- BMR Calculation -------------------- */
    public double calculateMaleBMR() {
        maleBMR = 66 + (13.7 * poundToKG(weight)) + (5 * inchToCM(height)) - (6.8 * age);
        return maleBMR;
    }

    public double calculateFemaleBMR() {
        femaleBMR = 655 + (9.6 * poundToKG(weight)) + (1.8 * inchToCM(height)) - (4.7 * age);
        return femaleBMR;
    }

    /* -------------------- BMI Calculation -------------------- */
    public double calculateBMI() {
        return BMI;
    }
}
