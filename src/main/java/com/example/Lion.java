package com.example;
import java.util.List;

public class Lion {
    boolean hasMane;
    private IFeline feline;

    public Lion(String sex, IFeline feline) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.feline = feline;
    }
    public int getKittens() {

        return feline.getKittens();
    }
    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return ((Animal)feline).getFood("Хищник");
    }
}
