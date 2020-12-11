package com.example.chef101.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.chef101.R;
import com.example.chef101.pojo.Recipe;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CreditsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CreditsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CreditsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CreditsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CreditsFragment newInstance(String param1, String param2) {
        CreditsFragment fragment = new CreditsFragment();
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
        View view = inflater.inflate(R.layout.fragment_credits, container, false);

        ListView creditsListView = view.findViewById(R.id.creditsListView);

        ArrayList<Recipe> creditsList = new ArrayList<>(Recipe.getRecipesArrayList());
        String[] links = {"https://unsplash.com/photos/JspLKUauwSI",
                          "https://unsplash.com/photos/1rqk6XVnw44",
                          "https://unsplash.com/photos/HyuvFrHlJZc",
                          "https://unsplash.com/photos/xsfX3AqLDKo",
                          "https://unsplash.com/photos/LbFKMh4F5Nk",
                          "https://unsplash.com/photos/zcUgjyqEwe8",
                          "https://unsplash.com/photos/KxcYYoJZehI"
                        };
        for (int i = 0; i < creditsList.size(); i++) {
            creditsList.get(i).setAmountOfTime("unsplash.com");
        }
        creditsListView.setAdapter(new RecipeListFragment.CustomRecipesListViewAdapter(getContext(), creditsList));

        creditsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        return view;
    }
}