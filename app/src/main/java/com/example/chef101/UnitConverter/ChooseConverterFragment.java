package com.example.chef101.UnitConverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.chef101.R;
import com.example.chef101.fragments.ConverterFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChooseConverterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChooseConverterFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ChooseConverterFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChooseConverterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChooseConverterFragment newInstance(String param1, String param2) {
        ChooseConverterFragment fragment = new ChooseConverterFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_choose_converter, container, false);
        Button massButton = view.findViewById(R.id.massButton);
        massButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterFragment.isMassOrVolume = "mass";
                Navigation.findNavController(view).navigate(R.id.action_chooseConverterFragment_to_converter_fragment);
            }
        });

        Button volumeButton = view.findViewById(R.id.volumeButton);
        volumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConverterFragment.isMassOrVolume = "volume";
                Navigation.findNavController(view).navigate(R.id.action_chooseConverterFragment_to_converter_fragment);
            }
        });

        return view;
    }
}