package model;

public class Opel extends Car{


    @Override
    public void carColor() {
        System.out.println(" arabanın rengi kırmızı");
    }

    @Override
    public int calculateZeroToHundredSpeedTime() {
        return 0;
    }


}
