package com.gminney.animalapp_minney2019;

public class Seal extends Animal implements Fun {

    public Seal(){

    }

    public String say(){
        return "ow ow ow";
    }


    @Override
    public String play() {
        return "The Seal bounces a ball off its nose.";
    }
}
