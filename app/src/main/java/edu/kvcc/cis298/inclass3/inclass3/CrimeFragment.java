package edu.kvcc.cis298.inclass3.inclass3;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/
public class CrimeFragment extends Fragment {

    //Declare a class level variable for a crime
    private Crime mCrime;

    //This method does not do the inflating of the view like the onCreate for an activity does
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DELETED? setContentView(R.layout.activity_crime);
        //Create a new instance of a crime
        mCrime = new Crime();
    }

    //This method IS responsible for inflating the view and getting the content on the screen.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // DELETED? return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_crime, container, false);
        return v;
    }
}
