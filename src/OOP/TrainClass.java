package OOP;

import OOP.Train;

public class TrainClass {
    public static void main(String[] args) {
        Train myTrain = new Train ();
        Train myTrain2 = new Train ("Parovozik008", "green", 11);
        myTrain.color = "blue";
        myTrain.number = "Parovozik007";
        myTrain.setLeight(18);
        System.out.println(myTrain2.ChoohChooh());
        String hello = myTrain.ChoohChooh ();
        System.out.println(myTrain.ChoohChooh());
        myTrain.fuel("Gas", 3);
    }
}
