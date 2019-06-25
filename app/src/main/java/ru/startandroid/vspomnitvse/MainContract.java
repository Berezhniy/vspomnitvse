package ru.startandroid.vspomnitvse;

public interface MainContract {
    enum FragmentType{
        TOP, BOTTOM
    }

    interface Listener{
        void updateFragments(MainContract.FragmentType type);
    }
}
