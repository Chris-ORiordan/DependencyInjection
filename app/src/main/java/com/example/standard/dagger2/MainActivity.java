package com.example.standard.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //IronBank bank = new IronBank();
        //Allies allies = new Allies();

        //Manual Dependency Injection
        /*Starks starks = new Starks();
        Boltons boltons = new Boltons();
        War war = new War(starks,boltons);
        war.prepare();
        war.report();*/

        //Using Dagger2
        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent battleComponent = DaggerMainActivity_BattleComponent.builder().braavosModule(new BraavosModule(cash,soldiers)).build();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();

    }

    @Component(modules = BraavosModule.class)
    interface BattleComponent {
        War getWar();
        Starks getStarks();
        Boltons getBoltons();
    }
}
