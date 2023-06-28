package org.example;

public class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public int getEnginePower() {
        return engine.getPower(); // использует метод другого класса
    }


}
class Engine {
    public int calcSalary(int hours, int rate, int bonus) {
        return hours * rate + bonus;
    }
    public int countWheels(int wheel1, int wheel2) {
        return wheel1+wheel2;
    }
    public int getPower() {
        return 125;
    }
    public String getEngName(){
        return  "V5";
    }

}