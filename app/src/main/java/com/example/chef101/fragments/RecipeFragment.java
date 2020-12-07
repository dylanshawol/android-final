package com.example.chef101.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chef101.R;
import com.example.chef101.pojo.RecipesArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecipeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecipeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecipeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecipeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecipeFragment newInstance(String param1, String param2) {
        RecipeFragment fragment = new RecipeFragment();
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
        View view = inflater.inflate(R.layout.fragment_recipe, container, false);

        // Create image and text views for the recipe fragment
        ImageView recipeImageSelectedImageView = view.findViewById(R.id.recipeImageViewLarge);
        TextView recipeNameSelectedTextViewBlack = view.findViewById(R.id.recipeSelectedNameTextViewBlack);
        TextView recipeNameSelectedTextViewWhite = view.findViewById(R.id.recipeSelectedNameTextViewWhite);

        // Get the name and image of the recipe selected from the recipe list view using the recipe array list
        String recipeNameSelected = RecipesArrayList.getRecipesArrayList().get(RecipeListFragment.listViewPosition).getName();
        int recipeImageSelected = RecipesArrayList.getRecipesArrayList().get(RecipeListFragment.listViewPosition).getImageOfDish();

        // Set the text and image on the layout to the name and image selected
        recipeNameSelectedTextViewBlack.setText(recipeNameSelected);
        recipeNameSelectedTextViewWhite.setText(recipeNameSelected);
        recipeImageSelectedImageView.setImageDrawable(getContext().getDrawable(recipeImageSelected));

        return view;
    }
}