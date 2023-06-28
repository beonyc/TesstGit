package org.example;

public class Delivery {
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getDefaultName() {
        return "Unknown delivery"; // возвращает Unknown delivery
    }

    public double getDefaultWeight() {
        return 100.0; // возвращает 100.0
    }

    public boolean getDefaultImportanceState() {
        return true; // возвращает true
    }

}
