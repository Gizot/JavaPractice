import model.Coordinate;
import model.GrowthCycleEnum;
import model.Mario;
import model.MarioBaseCharacter;

public class Main {
    public static void main(String[] args) {

        /*
        this.name = name;
        this.healts = healts;
        this.growthCycleEnum = growthCycleEnum;
        this.length = length;
        this.immortality = immortality;
        this.remainingLife = remainingLife;
        this.coordinate = coordinate;
         */
        Coordinate marioCoordinate = new Coordinate(0,0);

        MarioBaseCharacter mario = new Mario("Mario",1, GrowthCycleEnum.LITTLE,
                1,false,3,marioCoordinate);
    }
}