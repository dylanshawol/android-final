package com.example.chef101.fragments.helper_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chef101.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TipsHelperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TipsHelperFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_TIP = "tip";

    // TODO: Rename and change types of parameters
    private String tip;

    public TipsHelperFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment TipsHelperFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TipsHelperFragment newInstance(String param1) {
        TipsHelperFragment fragment = new TipsHelperFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TIP, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            tip = getArguments().getString(ARG_TIP);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tips_helper, container, false);

        TextView tipsText = view.findViewById(R.id.tipText);

        tipsText.setText(tip);

        return view;
    }
}