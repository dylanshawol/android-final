package com.example.chef101.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.ToggleButton;

import com.example.chef101.R;
import com.example.chef101.UnitConverter.Conversions;
import com.example.chef101.UnitConverter.UnitConverter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ConverterFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConverterFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ConverterFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ConverterFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ConverterFragment newInstance(String param1, String param2) {
        ConverterFragment fragment = new ConverterFragment();
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

    public int firstSpinnerPosition;
    public int secondSpinnerPosition;
    public double amount;
    public EditText firstDecimalField;
    public EditText secondDecimalField;
    public static String isMassOrVolume = "mass";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_converter, container, false);


/*------------------------------ First Spinner and Decimal Field ------------------------------*/
        Spinner unitSpinner1 = view.findViewById(R.id.unitSpinner1);
        ArrayAdapter<CharSequence> adapter1 = null;

        // Set the navigation title and the spinner adapter based on weather mass or volume was clicked
        if (isMassOrVolume.equals("mass")) {
            adapter1 = ArrayAdapter.createFromResource(getContext(), R.array.mass_units, android.R.layout.simple_spinner_item);
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Mass Converter");
        } else if (isMassOrVolume.equals("volume")) {
            adapter1 = ArrayAdapter.createFromResource(getContext(), R.array.volume_units, android.R.layout.simple_spinner_item);
            ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Volume Converter");
        }

        // Set the adapter's layout
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Set adapter to the spinner
        unitSpinner1.setAdapter(adapter1);

        // Create the decimal fields for the input
        firstDecimalField = view.findViewById(R.id.unitTextField1);
        secondDecimalField = view.findViewById(R.id.unitTextField2);


        firstDecimalField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // When input is typed into the first decimal field convert what's in it
                convertOnChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });

        unitSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // When a unit is selected from the spinner assign the position of the item to firstSpinnerPosition
                // and convert what's in the decimal field
                firstSpinnerPosition = position;
                convertOnChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
/*------------------------------ Second Spinner and Decimal Field ------------------------------*/
        Spinner unitSpinner2 = view.findViewById(R.id.unitSpinner2);
        unitSpinner2.setAdapter(adapter1);

        unitSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // When a unit is selected from the spinner assign the position of the item to unitPosition1
                // and convert what's in the first decimal field
                secondSpinnerPosition = position;
                convertOnChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        return view;
    }

    /**
     * Checks to see if the first input field is empty
     * If it contains a decimal then it calls the convert
     * method from the UnitConverter class and assigns its
     * value to the second input field.
     *
     * @author Dylan Shawol
     */
    public void convertOnChanged() {
        if (!firstDecimalField.getText().toString().equals("")) {
            amount = Double.parseDouble(firstDecimalField.getText().toString());
            secondDecimalField.setText(String.valueOf(UnitConverter.convertBySpinner(amount, firstSpinnerPosition, secondSpinnerPosition)));
        } else {
            secondDecimalField.setText("");
        }
    }
}