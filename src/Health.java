public class Health {
    private String name;
    private double weight;
    private double height;
    private int age;
    private String sex;
    private double BMI;
    private double BMR;
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

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }

    public double getBMR() {
        return BMR;
    }

    public void setBMR(double BMR) {
        this.BMR = BMR;
    }

    public int getActivityMultiplier() {
        return activityMultiplier;
    }

    public void setActivityMultiplier(int activityMultiplier) {
        this.activityMultiplier = activityMultiplier;
    }

    @Override
    public String toString() {
        return "From Health Class | " + name;
    }
}
