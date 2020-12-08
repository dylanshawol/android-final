package com.example.chef101.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.chef101.R;
import com.example.chef101.pojo.Recipe;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RecipeListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RecipeListFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RecipeListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RecipesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RecipeListFragment newInstance(String param1, String param2) {
        RecipeListFragment fragment = new RecipeListFragment();
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

    public static int listViewPosition;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recipe_list, container, false);
        // Create a list view and link it to the list view in the layout
        ListView recipesListView = view.findViewById(R.id.recipesListView);

        // Set the custom adapter to the list view and give it an array list of recipes
        recipesListView.setAdapter(new CustomRecipesListViewAdapter(getContext(), Recipe.getRecipesArrayList()));

        // Make the list view position value static and navigate to the recipe fragment
        recipesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listViewPosition = position;
                Navigation.findNavController(view).navigate(R.id.action_recipe_list_fragment_to_recipe_fragment);
            }
        });
        return view;
    }

    // Create a public list view adapter for the recipe list view
    public static class CustomRecipesListViewAdapter extends ArrayAdapter<Recipe> {
        public CustomRecipesListViewAdapter(@NonNull Context context, ArrayList<Recipe> recipeArrayList) {
            super(context, 0, recipeArrayList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.recipe_list_layout, parent, false);
                // Create text and image views and link them to the text and image views in the recipe list layout
                TextView recipeName = convertView.findViewById(R.id.recipeNameTextView);
                TextView recipeTime = convertView.findViewById(R.id.recipeTimeTextView);
                ImageView recipeImage = convertView.findViewById(R.id.recipeImageView);

                // Set the text and image views in the layout to the values given to them from the array list
                recipeName.setText(getItem(position).getName());
                recipeTime.setText(getItem(position).getAmountOfTime());
                recipeImage.setImageDrawable(convertView.getContext().getDrawable(getItem(position).getImageOfDish()));
            }
            return convertView;
        }
    }

}
