package model;

public class Villain {
    private String name;
    private int damage;
    private boolean isMortal;
    private int health;
    private MoveTypeEnum moveTypeEnum;
    private Coordinate coordinate;

    public Villain(String name, int damage, boolean isMortal,
                   int health, MoveTypeEnum moveTypeEnum, Coordinate coordinate) {
        this.name = name;
        this.damage = damage;
        this.isMortal = isMortal;
        this.health = health;
        this.moveTypeEnum = moveTypeEnum;
        this.coordinate = coordinate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isMortal() {
        return isMortal;
    }

    public void setMortal(boolean mortal) {
        isMortal = mortal;
    }

    public MoveTypeEnum getMoveTypeEnum() {
        return moveTypeEnum;
    }

    public void setMoveTypeEnum(MoveTypeEnum moveTypeEnum) {
        this.moveTypeEnum = moveTypeEnum;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", isMortal=" + isMortal +
                ", moveTypeEnum=" + moveTypeEnum +
                ", coordinate=" + coordinate +
                '}';
    }
}
