package in.co.maxxwarez.skynet.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.co.maxxwarez.skynet.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoHomeSet#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoHomeSet extends Fragment {
 TextView mTextView;
    public NoHomeSet () {
        // Required empty public constructor
    }

    public static NoHomeSet newInstance () {
        NoHomeSet fragment = new NoHomeSet();
        return fragment;
    }

    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_no_home_set, container, false);
        mTextView = v.findViewById(R.id.noHomeSet);
        return  v;
    }
}