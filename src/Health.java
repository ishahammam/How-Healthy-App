public class Health {
    private String name;
    private double weight;
    private double height;
    private int age;
    private String sex;
    private double maleBMR;
    private double femaleBMR;
    private int activityMultiplier;
    private double maleTDEE;
    private double femaleTDEE;
    private double BMI;
    private String BMICategory;

    /* -------------------- Getters & Setters -------------------- */

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
    public double maleBMR() {
        maleBMR = 66 + (13.7 * poundToKG(weight)) + (5 * inchToCM(height)) - (6.8 * age);
        return maleBMR;
    }

    public double femaleBMR() {
        femaleBMR = 655 + (9.6 * poundToKG(weight)) + (1.8 * inchToCM(height)) - (4.7 * age);
        return femaleBMR;
    }

    /* -------------------- TDEE Calculation -------------------- */
    public double maleTDEE(int activityMultiplier) {
        switch (activityMultiplier) {
            case 1:
                maleTDEE = maleBMR * 1.2;
                break;
            case 2:
                maleTDEE = maleBMR * 1.375;
                break;
            case 3:
                maleTDEE = maleBMR * 1.55;
                break;
            case 4:
                maleTDEE = maleBMR * 1.725;
                break;
            case 5:
                maleTDEE = maleBMR * 1.9;
                break;
            default:
                maleTDEE = maleBMR * 1.2;
                break;
        }
        return maleTDEE;
    }

    public double femaleTDEE(int activityMultiplier) {
        switch (activityMultiplier) {
            case 1:
                femaleTDEE = femaleBMR * 1.2;
                break;
            case 2:
                femaleTDEE = femaleBMR * 1.375;
                break;
            case 3:
                femaleTDEE = femaleBMR * 1.55;
                break;
            case 4:
                femaleTDEE = femaleBMR * 1.725;
                break;
            case 5:
                femaleTDEE = femaleBMR * 1.9;
                break;
            default:
                femaleTDEE = femaleBMR * 1.2;
                break;
        }
        return femaleTDEE;
    }

    /* -------------------- BMI Calculation -------------------- */
    public double calculateBMI() {
        BMI = (weight / Math.pow(height, 2)) * 703;
        return BMI;
    }

    public String getBMICategory() {
        if (BMI < 18.5) {
            BMICategory = "underweight";
        }
        if (BMI >= 18.5 && BMI <= 24.9) {
            BMICategory = "normal weight";
        }
        if (BMI >= 25 && BMI <= 29.9) {
            BMICategory = "overweight";
        }
        if (BMI >= 30) {
            BMICategory = "obese";
        }
        return BMICategory;
    }
}
