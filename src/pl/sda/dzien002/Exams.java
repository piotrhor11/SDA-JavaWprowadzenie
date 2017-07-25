package pl.sda.dzien002;

import java.util.Random;

public class Exams {
    private float math;
    private float polish;
    private float physics;
    private float chemistry;

    private static final Random rand = new Random();      //static oznacza, ze nasz rand bedzie jeden dla calej klasy. Final zapewnia, ze musi byc od razu zainicjalizowany i niezmienny

    public Exams() {
    }                       //Moglibyśmy go pominąć, jeżeli nic nie robimy w konstruktorze i nie ma innego konstruktora

    public Exams(float math, float polish, float physics, float chemistry) {
        this.math = math;
        this.polish = polish;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public void setMath(float grade) {
        math = grade;
    }

    public void setPolish(float grade) {
        polish = grade;
    }

    public void setPhysics(float grade) {
        physics = grade;
    }

    public void setChemistry(float grade) {
        chemistry = grade;
    }

    public float getMath() {
        return math;
    }

    public float getPolish() {
        return polish;
    }

    public float getPhysics() {
        return physics;
    }

    public float getChemistry() {
        return chemistry;
    }

    public float getAverage() {
        return (math + polish + physics + chemistry) / 4;
    }

    public boolean checkPass() {
        return (polish > 2 && math > 2 && physics > 2 && chemistry > 2);
    }

    public void retestAll() {
        if (math < 3) {
            math = retest();
        }
        if (physics < 3) {
            physics = retest();
        }
        if (polish < 3) {
            polish = retest();
        }
        if (chemistry < 3) {
            chemistry = retest();
        }
    }

    private float retest() {
        if (rand.nextBoolean()) {
            return 3;
        } else {
            return 2;
        }
    }

    @Override
    public String toString() {
        return String.format("Status studenta: Math=%.1f, Polish=%.1f, Physics=%.1f, Chemistry=%.1f, Srednia=%.2f, Zaliczyl: %b", getMath(), getPolish(), getPhysics(), getChemistry(), getAverage(), checkPass());

    }
}
