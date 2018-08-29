package com.example.standard.dagger2;

import dagger.*;

@Module //The module
public class BraavosModule {
    Cash cash;
    Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers){
        this.cash = cash;
        this.soldiers = soldiers;
    }

    @Provides //Provides cash dependency
    Cash provideCash(){
        return cash;
    }

    @Provides //Provides soldiers dependency
    Soldiers provideSoldiers(){
        return soldiers;
    }
}
