package app;

public class Health {
    private double maleBMR;
    private double femaleBMR;
    private double BMI;
    private String BMICategory;

    /* -------------------- Unit Conversion -------------------- */
    public double poundToKG(double value) {
        return value * 0.453592;
    }

    public double inchToCM(double value) {
        return value * 2.54;
    }

    /* -------------------- BMR Calculation -------------------- */
    public double maleBMR(double weight, double height, double age) {
        maleBMR = 66 + (13.7 * poundToKG(weight)) + (5 * inchToCM(height)) - (6.8 * age);
        return maleBMR;
    }

    public double femaleBMR(double weight, double height, double age) {
        femaleBMR = 655 + (9.6 * poundToKG(weight)) + (1.8 * inchToCM(height)) - (4.7 * age);
        return femaleBMR;
    }

    /* -------------------- TDEE Calculation -------------------- */
    public double maleTDEE(int activityMultiplier) {
        double maleTDEE;
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
        double femaleTDEE;
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
    public double calculateBMI(double weight, double height) {
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
