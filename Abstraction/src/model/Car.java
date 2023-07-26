package model;

public abstract class Car {
    public void carBrand(){
        System.out.println("car brand"); // abstarck olmadığı için gövde tanımlayabildim.
    }

    public abstract  void carColor();//{} gövde tanımlayamayız.
}
