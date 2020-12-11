package com.example.chef101.nav_drawer_fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.chef101.R;
import com.example.chef101.pojo.Ingredients;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContactFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContactFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContactFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContactFragment newInstance(String param1, String param2) {
        ContactFragment fragment = new ContactFragment();
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
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        // Call
        Button callButton = view.findViewById(R.id.phoneButton);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a Uri Object that will hold a phone number
                Uri phoneNumber = Uri.parse("tel: 5195195195");

                // Create an Intent Object that will preform the Dial Action using the phone number
                Intent intent = new Intent(Intent.ACTION_DIAL, phoneNumber);

                // Check if the user's device has a default phone client
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the intent
                    startActivity(intent);
                } else {
                    // Otherwise display an error message
                    Toast.makeText(getContext(), "No Phone Client Detected", Toast.LENGTH_SHORT);
                }
            }
        });

        // Text
        Button smsButton = view.findViewById(R.id.smsButton);
        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent Object that will preform the Send To action using the phone number
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto: 5195195195"));

                // Check if the user's device has a default SMS client
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the intent
                    startActivity(intent);
                } else {
                    // Otherwise display an error message
                    Toast.makeText(getContext(), "No SMS Client Detected", Toast.LENGTH_SHORT);
                }
            }
        });

        // Email
        Button emailButton = view.findViewById(R.id.emailButton);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a String Array of email addresses and add relevant email(s)
                String[] developerEmailAddresses = {"dylan.shawol01@stclairconnect.ca"};

                // Create an Intent Object that will preform the Send To action using the email address Array
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: " + developerEmailAddresses[0]));

                // Check if the user's device has a default email client
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the intent
                    startActivity(intent);
                } else {
                    // Otherwise display an error message
                    Toast.makeText(getContext(), "No Email Client Detected", Toast.LENGTH_SHORT);
                }
            }
        });

        // Location
        Button mapButton = view.findViewById(R.id.visitButton);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent Object that will preform the View Action using the coordinates
                Uri headQuarters = Uri.parse("geo:0,0?q=St. Clair College - Windsor Campus");
//                Uri headQuarters = Uri.parse("geo:42.2464, -83.0182");
                Intent intent = new Intent(Intent.ACTION_VIEW, headQuarters);

                // Check if the user's device has a default map client
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the intent
                    startActivity(intent);
                } else {
                    // Otherwise display an error message
                    Toast.makeText(getContext(), "No Map Client Detected", Toast.LENGTH_SHORT);
                }
            }
        });

        // Location
        Button intentButton = view.findViewById(R.id.visitButton);
        intentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent Object that will preform the View Action using the coordinates
                Uri headQuarters = Uri.parse("geo:0,0?q=St. Clair College - Windsor Campus");
//                Uri headQuarters = Uri.parse("geo:42.2464, -83.0182");
                Intent intent = new Intent(Intent.ACTION_VIEW, headQuarters);

                // Check if the user's device has a default map client
                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                    // Start the intent
                    startActivity(intent);
                } else {
                    // Otherwise display an error message
                    Toast.makeText(getContext(), "No Map Client Detected", Toast.LENGTH_SHORT);
                }
            }
        });

        return view;
    }
}