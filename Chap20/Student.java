public class Student {
    private int age;
    private double height;
    private double gpa;

    public Student(int age, double height, double gpa) {
        this.age = age;
        this.height = height;
        this.gpa = gpa;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", height=" + height +
                ", gpa=" + gpa +
                '}';
    }
}