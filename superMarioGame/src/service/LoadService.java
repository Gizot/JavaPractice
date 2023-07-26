package service;

import model.*;

import java.util.List;

public class LoadService implements ILoadService{
    @Override
    public List<Villain> loadVillains() {
        return null;
    }

    @Override
    public MarioBaseCharacter loadMario() {

        Coordinate marioCoordinate = new Coordinate(0,0);

        MarioBaseCharacter mario = new Mario("Mario",1, GrowthCycleEnum.LITTLE,
                1,false,3,marioCoordinate);

    }

    @Override
    public MarioBaseCharacter loadLuigi() {
        return null;
    }

    @Override
    public Map loadMap() {
        return null;
    }


}
