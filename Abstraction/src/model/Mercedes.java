package model;

public class Mercedes extends Car{
    @Override
    public void carColor() {
        System.out.println("Alp beyazı");
    }


    @Override
    public int calculateZeroToHundredSpeedTime() {
        return getHorsePower() * getWeight() /1000;
    }








}
