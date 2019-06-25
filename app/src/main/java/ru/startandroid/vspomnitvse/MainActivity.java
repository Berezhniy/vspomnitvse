package ru.startandroid.vspomnitvse;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainContract.Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doUpdateFragments(R.id.containerTop, R.id.containerBottom, FirstFragment.newInstance(), SecondFragment.newInstance());
    }

    @Override
    public void updateFragments(MainContract.FragmentType type) {
        switch (type){
            case TOP:
                doUpdateFragments(R.id.containerTop, R.id.containerBottom, FirstFragment.newInstance(), SecondFragment.newInstance());
                break;
            case BOTTOM:
                doUpdateFragments(R.id.containerTop, R.id.containerBottom, SecondFragment.newInstance(), FirstFragment.newInstance());

                break;
        }
    }
    public void doUpdateFragments(int mainContainer, int anotherContainer,
                                  Fragment main, Fragment another) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(mainContainer, main)
                .replace(anotherContainer, another)
                .commit();
    }
}
