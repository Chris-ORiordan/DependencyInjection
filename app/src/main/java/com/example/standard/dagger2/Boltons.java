package com.example.standard.dagger2;

import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons(){
        //do something
    }

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
