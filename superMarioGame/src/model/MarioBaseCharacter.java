package model;

public class MarioBaseCharacter {
    private String name;
    private int healts;
    private GrowthCycleEnum growthCycleEnum;
    private int length;
    private boolean immortality;
    private int remainingLife;
    private Coordinate coordinate;

    public MarioBaseCharacter(String name, int healts, GrowthCycleEnum growthCycleEnum,
                              int length, boolean immortality, int remainingLife, Coordinate coordinate) {
        this.name = name;
        this.healts = healts;
        this.growthCycleEnum = growthCycleEnum;
        this.length = length;
        this.immortality = immortality;
        this.remainingLife = remainingLife;
        this.coordinate = coordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealts() {
        return healts;
    }

    public void setHealts(int healts) {
        this.healts = healts;
    }

    public GrowthCycleEnum getGrowthCycleEnum() {
        return growthCycleEnum;
    }

    public void setGrowthCycleEnum(GrowthCycleEnum growthCycleEnum) {
        this.growthCycleEnum = growthCycleEnum;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }



    public boolean isImmortality() {
        return immortality;
    }

    public void setImmortality(boolean immortality) {
        this.immortality = immortality;
    }

    public int getRemainingLife() {
        return remainingLife;
    }

    public void setRemainingLife(int remainingLife) {
        this.remainingLife = remainingLife;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "MarioBaseCharacter{" +
                "name='" + name + '\'' +
                ", healts=" + healts +
                ", growthCycleEnum=" + growthCycleEnum +
                ", length=" + length +
                ", immortality=" + immortality +
                ", remainingLife=" + remainingLife +
                ", coordinate=" + coordinate +
                '}';
    }
}
