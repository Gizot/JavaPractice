package model;

public abstract class Car { // metodun abstract olması için class ta abstract tanımlı olmalıdır.
    public void carBrand(){
        System.out.println("car brand"); // abstarck olmadığı için gövde tanımlayabildim.
    }

    public abstract  void carColor();//{} gövde tanımlayamayız.
}
