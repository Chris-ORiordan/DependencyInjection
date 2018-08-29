package com.example.standard.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Starks implements House {

    //the @Inject annotation will tell the Dagger what dependencies need to be transferred to the dependant.

    //Field Injection
    //@Inject Allies allies;
    Allies allies;

    //Constructor Injection
    @Inject
    public Starks(){
        //do something
    }

    //Method Injection
    //@Inject
    @Override
    public void prepareForWar() {
        Log.i(this.getClass().getSimpleName(), "Prepared for War");
    }

    //@Inject
    @Override
    public void reportForWar() {
        Log.i(this.getClass().getSimpleName(), "Reporting for War");
    }
}
