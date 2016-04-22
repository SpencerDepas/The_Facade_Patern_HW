package com.clearfaun.dp_hw;

/**
 * Created by SpencerDepas on 4/21/16.
 */
public class PrepaireAnimalForSellingFacade {

    ButcherAnimal butcherAnimal;
    CleanAnimal cleanAnimal;
    KillAnimial killAnimial;

    public PrepaireAnimalForSellingFacade(){

        butcherAnimal = new ButcherAnimal();
        killAnimial = new KillAnimial();
        cleanAnimal = new CleanAnimal();

    }


    public void prepairForLocalMeatMarket(){
        killAnimial.chopHeadOff();
        killAnimial.drianBlood();

        cleanAnimal.shaveAnimal();
        cleanAnimal.washAnimal();
    }

    public void prepairForSuperMarket(){
        killAnimial.chopHeadOff();
        killAnimial.drianBlood();

        cleanAnimal.shaveAnimal();
        cleanAnimal.washAnimal();

        butcherAnimal.prepairMeat();
    }

}
