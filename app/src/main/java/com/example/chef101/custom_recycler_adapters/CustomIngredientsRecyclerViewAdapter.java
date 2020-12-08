package com.example.chef101.custom_recycler_adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chef101.R;
import com.example.chef101.pojo.Ingredients;

import java.util.ArrayList;

public class CustomIngredientsRecyclerViewAdapter extends RecyclerView.Adapter<CustomIngredientsRecyclerViewAdapter.ViewHolder> {
    ArrayList<Ingredients> ingredients;
    public CustomIngredientsRecyclerViewAdapter(ArrayList<Ingredients> ingredientsList) {
        this.ingredients = ingredientsList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredients_recycler_layout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Ingredients ingredients = this.ingredients.get(position);
        holder.ingredient.setText(ingredients.getIngredient());
        holder.amount.setText(ingredients.getAmount());
    }

    @Override
    public int getItemCount() {
        if (ingredients == null) {
            return -1;
        }
        return ingredients.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        protected TextView ingredient;
        protected TextView amount;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ingredient = itemView.findViewById(R.id.ingredientsName);
            amount = itemView.findViewById(R.id.ingredientsAmount);
        }
    }
}
