package com.clearfaun.dp_hw;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //my farm has lots of tast meats
        //we sell them for our income
        PrepaireAnimalForSellingFacade prepaireAnimalForSellingFacade = new PrepaireAnimalForSellingFacade();


        //when we sell to the local meat market we
        //kill and clean the animal
        prepaireAnimalForSellingFacade.prepairForLocalMeatMarket();
        //output
        //Chopping head off
        //CHang the animal to drain out all of its blood
        //shaving animal
        //washing animal


        //when we sell to the supermarket we
        //kill, clean and cut the meat up
        prepaireAnimalForSellingFacade.prepairForSuperMarket();
        //output
        //Chopping head off
        //CHang the animal to drain out all of its blood
        //shaving animal
        //washing animal
        //Cut meat up into portions

    }
}
