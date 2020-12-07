package com.example.chef101.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

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

    // TODO: Create better variable names lol
    public int unitPosition1;
    public int unitPosition2;
    public double amount;
    public EditText decimalField1;
    public EditText decimalField2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_converter, container, false);

/*------------------------------ Unit 1 ------------------------------*/
        Spinner unitSpinner1 = view.findViewById(R.id.unitSpinner1);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(getContext(), R.array.mass_units, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitSpinner1.setAdapter(adapter1);

        decimalField1 = view.findViewById(R.id.unitTextField1);
        decimalField2 = view.findViewById(R.id.unitTextField2);

        decimalField1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {convertOnTextChanged();}

            @Override
            public void afterTextChanged(Editable s) {}
        });

        unitSpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unitPosition1 = position;
                convertOnItemSelected();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
/*------------------------------ Unit 2 ------------------------------*/
        Spinner unitSpinner2 = view.findViewById(R.id.unitSpinner2);
        unitSpinner2.setAdapter(adapter1);

        unitSpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                unitPosition2 = position;
                convertOnItemSelected();
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
    public void convertOnItemSelected() {
        if (!decimalField1.getText().toString().equals("")) {
            amount = Double.parseDouble(decimalField1.getText().toString());
            decimalField2.setText(String.valueOf(UnitConverter.unitConversion(amount, unitPosition1, unitPosition2)));
        }
    }

    /**
     * Assign the converted value from the first input field
     * into the second input field.
     *
     * @author Dylan Shawol
     */
    public void convertOnTextChanged() {
        amount = Double.parseDouble(decimalField1.getText().toString());
        decimalField2.setText(String.valueOf(UnitConverter.unitConversion(amount, unitPosition1, unitPosition2)));
    }
}