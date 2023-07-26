package model;

public class Mario extends  MarioBaseCharacter{
    public Mario(String name, int healts, GrowthCycleEnum growthCycleEnum, int length, boolean immortality, int remainingLife, Coordinate coordinate) {
        super(name, healts, growthCycleEnum, length, immortality, remainingLife, coordinate);
    }

}
